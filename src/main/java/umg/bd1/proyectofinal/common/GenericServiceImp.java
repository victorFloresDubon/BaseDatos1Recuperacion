package umg.bd1.proyectofinal.common;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class GenericServiceImp <T, ID extends Serializable> implements GenericService<T, ID>{

    @Override
    public void save(T entity) {
        getRepository().save(entity);
    }

    @Override
    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    @Override
    public T get(ID id) {
        Optional<T> obj = getRepository().findById(id);
        if (obj.isPresent()) {
            return obj.get();
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        List<T> returnList = new ArrayList<>();
        getRepository().findAll().forEach(obj -> returnList.add(obj));
        return returnList;
    }

    public abstract CrudRepository<T, ID> getRepository();

}
