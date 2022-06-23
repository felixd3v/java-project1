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
public class empleados {
    private String nombre;
    private String apellido;
    private String nombre2;
    private String apellido2;
    private String cedula;
    private String fechaN;
    private String direccion;
    private String telefono;
    private String ruta = "c:\\UEcarpeta\\";
    private String file = "Empleados.txt";
    
    public empleados (){}

    public empleados(String nombre, String apellido, String nombre2, String apellido2, String cedula, String fechaN, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.fechaN = fechaN;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean InsertarEmpleado (){
    File carpeta = new File (ruta);
    
    try{
    FileWriter fw = new FileWriter (ruta+file, true);
    PrintWriter pw = new PrintWriter(fw);
    pw.println(this.nombre+"|"+this.nombre2+"|"+this.apellido+"|"+this.apellido2+"|"+this.cedula+"|"+this.fechaN+"|"+this.direccion+"|"+this.telefono);
    pw.close();
    fw.close();
    return true;
    }catch(IOException e){
    return false;
    }
    
    }
}
