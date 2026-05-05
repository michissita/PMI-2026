/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Model.Estudios;
import Model.Paciente;
import Model.Profesional;
import Model.Fecha;
import java.util.ArrayList;
/**
 *
 * @author Windows 10
 */
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
    public void setPaciente (Paciente p){
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
    
    // Modificación
    public void modificarEstudio(int posicion, Fecha fechaEntrega, int estado) {
        if (posicion >= 0 && posicion < listaEstudios.size()) { // Verifica que la posición sea válida
            Estudios e = listaEstudios.get(posicion); // Obtiene el estudio en esa posición
            if (fechaEntrega != null) {   // Si mandaron una fecha nueva
                e.setEntrega(fechaEntrega);
            }
            if (estado >= 1 && estado <= 4) {  // Si mandaron un estado válido
                e.setEstado(estado);
            }
        }
    }
    
    // Consultas
    public int cantidadEstudiosPorPaciente(Paciente p) {
        int contador = 0;
        for (Estudios e : listaEstudios) {    // Recorre toda la lista
            if (e.getPaciente().equals(p)) {  // Pregunta: ¿este estudio es de este paciente?
                contador++;                  // Si sí, suma 1 al contador
            }
        }
        return contador;  // Devuelve cuántos estudios tiene ese paciente
    }

    public ArrayList<Estudios> estudiosPorEstado(int estado) {
        ArrayList<Estudios> encontrados = new ArrayList<>(); // Creo una lista vacía para guardar los resultados
        for (Estudios e : listaEstudios) {                   // Recorro todos los estudios
            if (e.getEstado() == estado) {                  // Si el estado del estudio coincide con el que busco
                encontrados.add(e);                         // Lo agrego a la lista de resultados
            }
        }
        return encontrados; // Devuelvo la lista con todos los estudios de ese estado
    }

    public ArrayList<Estudios> estudiosPorProfesional(Profesional prof) {
        ArrayList<Estudios> encontrados = new ArrayList<>();    // Lista vacía para guardar resultados
        for (Estudios e : listaEstudios) {                      // Recorro todos los estudios
            if (e.getProfesional().equals(prof)) {              // Comparo si el profesional del estudio es el mismo
                encontrados.add(e);                             // Si coincide, lo guardo
            }
        }
        return encontrados;  // Devuelvo todos los estudios de ese profesional
    }

    public ArrayList<Estudios> estudiosPorFecha(Fecha fecha) {
        ArrayList<Estudios> encontrados = new ArrayList<>();   // Lista vacía para los resultados
        for (Estudios e : listaEstudios) {                    // Recorro la lista de estudios
            if (e.getRealizacion().equals(fecha)) {           // Comparo la fecha de realización
                encontrados.add(e);                           // Si es la misma fecha, agrego el estudio
            }
        }
        return encontrados;  // Devuelvo los estudios de esa fecha
    }
}
