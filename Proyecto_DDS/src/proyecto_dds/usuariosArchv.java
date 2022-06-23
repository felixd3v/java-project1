/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_dds;
import java.io.*;

/**
 *
 * @author jenmu
 */
public class usuariosArchv extends Usuario {
    String ruta = "c:\\UEcarpeta\\";
    String file = "Usuarios.txt";
    String separador = "|";
    public usuariosArchv() {}

    public usuariosArchv(String nombre, String usuario, String password, String direccion, String cedula) {
        super(nombre, usuario, password, direccion, cedula);
    }
    
    
    
}
