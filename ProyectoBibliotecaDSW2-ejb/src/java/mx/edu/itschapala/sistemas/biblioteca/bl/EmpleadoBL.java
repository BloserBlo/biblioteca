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
import mx.edu.itschapala.sistemas.biblioteca.dao.EmpleadoDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Empleado;

/**
 *
 * @author Estudiante_2
 */
@Stateless
public class EmpleadoBL implements EmpleadoBLLocal {
    @EJB
    private EmpleadoDaoLocal empleadoDao;

    @Override
    public boolean registrar(Empleado empleado) {
        empleadoDao.crear(empleado);
        
        return false;
    }

    @Override
    public boolean eliminar(Empleado empleado) {
        empleadoDao.remover(empleado);
        return false;
    }

    @Override
    public boolean modificar(Empleado empleado) {
        empleadoDao.editar(empleado);
        return false;
    }

    @Override
    public List<Empleado> getLista() {
        empleadoDao.buscarTodos();
        return null;
    }

    @Override
    public Empleado getPorId(int id) {
        
        return empleadoDao.buscarporId(id);
    }
    
    
    

}
