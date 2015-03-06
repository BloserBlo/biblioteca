/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Usuarios;

/**
 *
 * @author Estudiante_2
 */
@Local
public interface UsuariosBLLocal {

    boolean registrar(Usuarios usuarios);

    boolean eliminar(Usuarios usuarios);

    boolean modificar(Usuarios usuarios);

    List<Usuarios> getLista();

    Usuarios getPorId(int id);
    
}
