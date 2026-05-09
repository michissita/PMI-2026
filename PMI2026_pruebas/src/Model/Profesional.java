package Model;
public class Profesional extends Persona {
     private long matricula;
        //contructor vacio
        public Profesional(){
        }
        
        //Constructor super
        public Profesional(String nombre, String apellido, long telefono, String mail, long matricula1){
            super(nombre, apellido, telefono, mail);
            this.matricula = matricula1;
        }
        //get
        public long getMatricula(){
            return matricula;
        }
        //set
        public void setMatricula(long matricula){
            this.matricula = matricula;
        }
     @Override
     public String toString(){
         return super.toString()+","+matricula;
     }
    
}
