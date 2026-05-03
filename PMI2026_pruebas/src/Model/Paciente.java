package Model;
public class Paciente extends Persona{
      private Estudios cantidadEstudios = new Estudios();
      private boolean obraSocial;
      private long DNI;
      
        //contructor vacio
       public Paciente(){
        }
       
       //Constructor con parametros, aqui esta el super de Persona
       public Paciente(String nombre, String apellido, long telefono, String mail, boolean obraSocial1, long DnI){
           super(nombre, apellido, telefono, mail);
           this.obraSocial = obraSocial1;
           this.DNI = DnI;
       }
        //get
        public boolean getObraSocial(){
            return obraSocial;
        }
        public long getDNI(){
            return DNI;
        }
        //set
        //Ver como es el control del Boolean
        public void setObraSocial(boolean OS){
            this.obraSocial = OS;
        }
        public void setDNI(long DNI1){
                this.DNI = DNI1; 
        }
        @Override 
       public String toString(){
       return super.toString()+","+DNI+","+obraSocial;
   }
}