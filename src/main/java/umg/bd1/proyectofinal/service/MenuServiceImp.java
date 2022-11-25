package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Menu;
import umg.bd1.proyectofinal.repositorio.MenuRepository;

@Service
public class MenuServiceImp extends GenericServiceImp<Menu, Long> implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public CrudRepository<Menu, Long> getRepository() {
        return menuRepository;
    }
}
