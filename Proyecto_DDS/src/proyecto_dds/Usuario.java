/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_dds;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jenmu
 */
public class Usuario {
    private String nombre;
    private String usuario;
    private String password;
    private String direccion;
    private String cedula;
    String ruta = "c:\\UEcarpeta\\";
    String file = "Usuarios.txt";
    String separador = "|";
    public Usuario (){}

    public Usuario(String nombre, String usuario, String password, String direccion, String cedula) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.direccion = direccion;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

     public boolean InsertarUsuario (){
    File carpeta = new File (ruta);
    if(!carpeta.exists());
    carpeta.mkdir();
    
    try{
    FileWriter fw = new FileWriter (ruta+file, true);
    PrintWriter pw = new PrintWriter(fw);
    pw.println(this.usuario+this.separador+this.password+this.separador+this.nombre+this.separador+this.cedula+this.separador+this.direccion);
    pw.close();
    fw.close();
    return true;
    }catch(IOException e){
    return false;
    }
    
    }
     
     public ArrayList<Usuario> MostrarTodo(){
         ArrayList <Usuario> user = new ArrayList<>();
     File carpeta = new File (ruta);
     if(!carpeta.exists());
     carpeta.mkdir();
     
     File fFile = new File(ruta+file);
     
     try{
     Scanner sc = new Scanner (fFile);
     
     while(sc.hasNextLine()){
     String linea= sc.nextLine();
     String[]arr = linea.split("\\|");
     Usuario obj = new Usuario();
     obj.setUsuario(arr[0]);
     obj.setPassword(arr[1]);
     obj.setNombre(arr[2]);
     obj.setCedula(arr[3]);
     obj.setDireccion(arr[4]);
     user.add(obj);
     }
     
     }catch(FileNotFoundException e){}
        return null;
     }
}