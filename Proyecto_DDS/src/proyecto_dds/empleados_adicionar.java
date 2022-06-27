package proyecto_dds;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class empleados_adicionar {
    private String nombre;
    private String apellido;
    private String nombre2;
    private String apellido2;
    private String cedula;
    private String ruta = "c:\\UEcarpeta\\";
    private String file = "Empleados.txt";
    private double horastrabajadas;
    private double salarioporhora;
    private double salariobruto;
    private double segurososcial;
    private double seguroeducativo;
    private double salarioneto;
    
    public empleados_adicionar (){}

    public empleados_adicionar(String nombre, String apellido, String nombre2, String apellido2, String cedula, double horastrabajadas, double salarioporhora, double salariobruto, double segurososcial, double seguroeducativo, double salarioneto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.horastrabajadas = horastrabajadas;
        this.salarioporhora = salarioporhora;
        this.salariobruto = salariobruto;
        this.segurososcial = segurososcial;
        this.seguroeducativo = seguroeducativo;
        this.salarioneto = salarioneto;
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

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getSalarioporhora() {
        return salarioporhora;
    }

    public void setSalarioporhora(double salarioporhora) {
        this.salarioporhora = salarioporhora;
    }

    public double getSalariobruto() {
        return salariobruto;
    }

    public void setSalariobruto(double salariobruto) {
        this.salariobruto = salariobruto;
    }

    public double getSegurososcial() {
        return segurososcial;
    }

    public void setSegurososcial(double segurososcial) {
        this.segurososcial = segurososcial;
    }

    public double getSeguroeducativo() {
        return seguroeducativo;
    }

    public void setSeguroeducativo(double seguroeducativo) {
        this.seguroeducativo = seguroeducativo;
    }

    public double getSalarioneto() {
        return salarioneto;
    }

    public void setSalarioneto(double salarioneto) {
        this.salarioneto = salarioneto;
    }
    
    public boolean mostrarempleado (){
        File carpeta = new File(ruta);
        if (!carpeta.exists()){
            carpeta.mkdir();
        }
        File Ffile = new File (ruta+ file);
        try{
            Scanner in = new Scanner(Ffile);
            while(in.hasNextLine()){
               String [] linea = in.nextLine().split("\\|");
               if(linea[4].equals(this.cedula)){
                   this.cedula=linea[4];
                   this.nombre=linea[0];
                   this.nombre2=linea[1];
                   this.apellido=linea[2];
                   this.apellido2=linea[3];
                   in.close();
                   return true;
               }
            }
            in.close();
                   return false;
        }catch (FileNotFoundException e){
            return false;
        }
    }
    
    
   
    public boolean modificar(){
        
        if(this.salarioporhora>=5 && this.salarioporhora<=20 && this.horastrabajadas>=4 && this.horastrabajadas<=12){
        this.salariobruto=this.horastrabajadas*this.salarioporhora;
        this.segurososcial=this.salariobruto*0.0975;
        this.seguroeducativo=this.salariobruto*0.0125;
        this.salarioneto=this.salariobruto-this.seguroeducativo-this.segurososcial;
        }else{
            JOptionPane.showMessageDialog(null, "hora y pago fuera de los rangos");
            return false;
        }
        
    File carpeta = new File (ruta);
        if(!carpeta.exists()){
            carpeta.mkdir(); 
        }
        
   File Ffile = new File (ruta + file);
   try{
       FileWriter Ffile2 = new FileWriter (ruta + file + ".tmp");
       PrintWriter pw = new PrintWriter (Ffile2);
       try{
           Scanner in = new Scanner (Ffile);
           while (in.hasNextLine()){
               String linea = in.nextLine();
               String []arr = linea.split("\\|");
               if (arr[4].equals(this.cedula)){
                   pw.println(this.cedula+"|"+this.nombre+"|"+this.nombre2+"|"+this.apellido+"|"+this.apellido2+"|"+this.horastrabajadas+"|"+this.salarioporhora+"|"+this.salariobruto+"|"+this.segurososcial+"|"+this.seguroeducativo+"|"+this.salarioneto);
                   
               }else{
                   pw.println(linea);
              
               }
           }
           pw.close();
           Ffile2.close();
           in.close();
           Ffile.delete();
           
           File newfile = new File(ruta + file + ".tmp");
           newfile.renameTo(Ffile);
           return true;
       }catch(FileNotFoundException e){
           return false;
       }
   }catch(IOException e){
       return false;
   }
 }
}
