
package Controlador;

import java.util.ArrayList;
import Model.Paciente;

public class ControladorPaciente {
    private Paciente paciente = new Paciente ();
    private static ArrayList <Paciente> listadePacientes = new ArrayList <Paciente>();
    
   //Constructor Vacio
    public ControladorPaciente(){
    }
    //Constructor con parametros
    public ControladorPaciente(ArrayList listap){
        this.listadePacientes = listap;
    }
    //get ArrayList
    public ArrayList getListaPacientes(){
        return listadePacientes;
    }
    //set
    public void setPacienteNombre(String nombre){
        this.paciente.setNombre(nombre);
    }
    public void setPacienteApellido(String apellido){
        this.paciente.setApellido(apellido);
    }
    public void setPacienteTelefono(long telefono){
        this.paciente.setTelefono(telefono);
    }
    public void setPacienteMail(String mail){
        this.paciente.setMail(mail);
    }
    public void setPacienteObraSocial(boolean obraSocial){
        this.paciente.setObraSocial(obraSocial);
    }
    public void setPscienteDNI(long DNI){
        this.paciente.setDNI(DNI);
    }
    public String getPacienteNombre(){
        return paciente.getNombre();
    }
    public String getPacienteApellido(){
        return paciente.getApellido();
    }
    public long getPacienteTelefono(){
        return paciente.getTelefono();
    }
    public String getPacienteMail(){
        return paciente.getMail();
    }
    public boolean getPacienteObraSocial(){
        return paciente.getObraSocial();
    }
    public long getDNI(){
        return paciente.getDNI();
    }
    
    //Metodo de Carga de Pacientes
    
    public void cargadePacientes( Paciente p){
        listadePacientes.add(p);
    }
    
    //Metodo de Modificacion de Pacientes
    
    public void modificarPacientes (Paciente p){
        listadePacientes
    }
}
