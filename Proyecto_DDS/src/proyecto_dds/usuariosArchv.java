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
    public boolean InsertarUsuario (){
        Usuario op = new Usuario();
    File carpeta = new File (ruta);
    if(!carpeta.exists());
    carpeta.mkdir();
    
    try{
    FileWriter fw = new FileWriter (ruta+file, true);
    PrintWriter pw = new PrintWriter(fw);
    pw.println(op.getUsuario()+this.separador+op.getPassword()+this.separador+op.getNombre()+this.separador+op.getCedula()+this.separador+op.getDireccion());
    pw.close();
    fw.close();
    return true;
    }catch(IOException e){
    return false;
    }
    
    }
    
    
}
