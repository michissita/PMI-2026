package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
public class Profesional extends Persona {
     private long matricula;
        //contructor
        public Profesional(){
            super();
            matricula = 0;
        }
        //Accesos
        //get
        public long getMatricula(){
            return matricula;
        }
        //set
        public void setMatricula(long matricula){
            this.matricula = matricula;
        }

    
}
