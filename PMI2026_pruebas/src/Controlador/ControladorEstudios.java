package Controlador;
import Model.Estudios;
import Model.Paciente;
import Model.Profesional;
import Model.Fecha;
import java.util.ArrayList;

public class ControladorEstudios {
    private Estudios estudio = new Estudios();
    private static ArrayList<Estudios> listaEstudios = new ArrayList <>();
    
    // Constructor vacío
    public ControladorEstudios (){
    }
    
    // Constructor con parámetros
    public ControladorEstudios (ArrayList listaE){
        this.listaEstudios = listaE;
    }
    
    // Get de la lista
    public ArrayList<Estudios> getListaEstudios (){
        return listaEstudios;
    }
    
    // Setters
    public void setPaciente(Paciente p){
        this.estudio.setPaciente (p);
    }
    
    public void setProfesional (Profesional p){
        this.estudio.setProfesional (p);
    }
    
    public void setFechaRealizacion (Fecha f){
        this.estudio.setRealizacion (f);
    }
    
    public void setFechaEntrega (Fecha f){
        this.estudio.setEntrega (f);
    }
    
    public void setEstado (int estado){
        this.estudio.setEstado(estado);
    }
    
    // Getters
    public Paciente getPaciente (){
        return estudio.getPaciente();
    }
    
    public Profesional getProfesional(){
        return estudio.getProfesional();
    } 
    
    public Fecha getFechaRealizacion (){
        return estudio.getRealizacion();
    }
    
    public Fecha getFechaEntrega (){
        return estudio.getEntrega();
    }
    
    public int getEstado (){
        return estudio.getEstado ();
    }
    
    // Carga
    public void cargarEstudio(Estudios e) {
        listaEstudios.add(e);
    }
}