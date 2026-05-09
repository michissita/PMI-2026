
package Controlador;
import Model.Profesional;
import java.util.ArrayList;

public class ControladorProfesional {
      private Profesional profesional = new Profesional ();
    private static ArrayList <Profesional> listadeProfesionales = new ArrayList <Profesional>();
   
    //Constructor vacio
    public ControladorProfesional(){
    }
    //Constructor con parametros
    public ControladorProfesional(ArrayList listaf){
        this.listadeProfesionales = listaf;
    }
    
    //
    public ArrayList getListaProfesionales(){
        return listadeProfesionales;
    }
    
    public void setProfesionalNombre(String nombre){
        this.profesional.setNombre(nombre);
    }
    public void setPacienteApellido(String apellido){
        this.profesional.setApellido(apellido);
    }
    public void setPProfesionalTelefono(long telefono){
        this.profesional.setTelefono(telefono);
    }
    public void setProfesionalMail(String mail){
        this.profesional.setMail(mail);
    }
    public void setProfesionalMatricula(long matricula){
        this.profesional.setMatricula(matricula);
    }
    public String getProfesionalNombre(){
        return profesional.getNombre();
    }
    public String getProfesionalApellido(){
        return profesional.getApellido();
    }
    public long getProfesionalTelefono(){
        return profesional.getTelefono();
    }
    public String getProfesionalMail(){
        return profesional.getMail();
    }
    public long getProfesionalMatricula(){
        return profesional.getMatricula();
    }
 
    
    //Metodo de Carga de Pacientes
    
    public void cargaProfesional( Profesional f){
        listadeProfesionales.add(f);
    }
    
    //Metodo de Modificacion de Pacientes
    
    public void modificarProfesional (Profesional p){
        
    }
}