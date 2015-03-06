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
import mx.edu.itschapala.sistemas.biblioteca.dao.UsuariosDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Usuarios;

/**
 *
 * @author Estudiante_2
 */
@Stateless
public class UsuariosBL implements UsuariosBLLocal {
    @EJB
    private UsuariosDaoLocal usuariosDao;

    @Override
    public boolean registrar(Usuarios usuarios) {
        
        usuariosDao.crear(usuarios);
        
        return false;
    }

    @Override
    public boolean eliminar(Usuarios usuarios) {
        
        usuariosDao.remover(usuarios);
        return false;
    }

    @Override
    public boolean modificar(Usuarios usuarios) {
        usuariosDao.editar(usuarios);
        
        return false;
    }

    @Override
    public List<Usuarios> getLista() {
        
        usuariosDao.buscarTodos();
        return null;
    }

    @Override
    public Usuarios getPorId(int id) {
        
        
        return usuariosDao.buscarporId(id);
    }

    
    
    
    
}
