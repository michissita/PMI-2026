package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
public abstract class Persona {
    protected String apellido;
    protected String nombre;
    protected long telefono;
    protected String mail;
    
    //Contructor
    public Persona (){
        apellido = "";
        nombre = "";
        telefono = 0;
        mail = "";
    }
    //Accesos
    //get
    public String getApellido(){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public long getTelefono(){
        return telefono;
    }
    public String getMail(){
        return mail;
    }
    //set
    public void setApellido(String A1){
        this.apellido = A1;
    }
    public void setNombre (String N1){
        this.nombre = N1;
    }
    public void setTelefono (long T1){
            this.telefono = T1;
    }
    public void setMail (String M1){
        this.mail = M1;
    }

}
