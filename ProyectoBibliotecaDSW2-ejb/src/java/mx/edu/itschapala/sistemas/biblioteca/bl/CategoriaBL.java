/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.CategoriaDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Categoria;

/**
 *
 * @author Estudiante_2
 */
@Stateless
public class CategoriaBL implements CategoriaBLLocal {
    @EJB
    private CategoriaDaoLocal categoriaDao;

    @Override
    public boolean registrar(Categoria categoria) {
        categoriaDao.crear(categoria);
        return false;
    }

    @Override
    public boolean eliminar(Categoria categoria) {
        categoriaDao.remover(categoria);
        return false;
    }

    @Override
    public boolean modificar(Categoria categoria) {
        categoriaDao.editar(categoria);
        return false;
    }

    @Override
    public List<Categoria> getLista() {
        categoriaDao.buscarTodos();
        return null;
    }

    @Override
    public Categoria getPorId(int id) {
   
        return  categoriaDao.buscarporId(id);
    }


}
