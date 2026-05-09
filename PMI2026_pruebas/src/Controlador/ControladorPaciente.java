
package Controlador;
import Model.Paciente;

public class ControladorPaciente {
    private Paciente paciente = new Paciente ();
    
   //Constructor Vacio
    public ControladorPaciente(){
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
    public void setPacienteDNI(long DNI){
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
    public boolean buscarPorDNI(long dniBusqueda) {
    try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("Pacientes.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] v = linea.split(";"); // Separa por punto y coma
            
            // Si el DNI de la línea es igual al que buscamos...
            if (Long.parseLong(v[0]) == dniBusqueda) {
                // Llenamos el objeto controlador con la info del archivo
               this.telefono = Long.parseLong(v[3]);
                this.mail = v[4];
                this.obraSocial = Boolean.parseBoolean(v[5]);
                return true; // Éxito: lo encontramos
            }
        }
    } catch (Exception e) {
        System.out.println("Error al leer archivo: " + e.getMessage());
    }
    return false; // No se encontró
}

// Estos "Getters" sirven para que la Vista pueda sacar la info del Controlador
public long getPacienteTelefono() { 
    return getTelefono; }
public String getMail() {
    return mail; }
public boolean isObraSocial() { 
    return obraSocial; }
        
}
