package Model;
public class Persona {
    private String nombre;
    private String apellido;
    private long telefono;
    private String mail;
    
    //Contructor vacio
    public Persona (){
    }
    
    //Constructor con parametros, no se utiliza(esta por las dudas), usaremos SUPER
    public Persona ( String nombre1 , String apellido1, long  telefono1, String mail1){
    this.nombre = nombre1;
    this.apellido = apellido1;
    this.telefono = telefono1;
    this.mail = mail1;
}
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
