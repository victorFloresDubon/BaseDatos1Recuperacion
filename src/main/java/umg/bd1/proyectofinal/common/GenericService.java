package umg.bd1.proyectofinal.common;

import java.io.Serializable;
import java.util.List;

public interface GenericService <T, ID extends Serializable> {

    void save(T entity);

    void delete(ID id);

    T get(ID id);

    List<T> getAll();

}
