package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
public class Paciente extends Persona {
      private boolean obraSocial;
      private Long DNI;
      
        //contructor
       public Paciente(){
            super();
            this.obraSocial = false;
            this.DNI=null;
        }
        //accesos
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
       return nombre+";"+apellido+";"+DNI;
   }
}