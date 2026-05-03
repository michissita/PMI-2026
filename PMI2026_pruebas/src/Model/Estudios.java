package Model;
import java.util.List;

//Revisar analisis.

public class Estudios {
    private Fecha realizacion;
    private Fecha entrega;
    private Paciente paciente;
    private Profesional profesional;
    private int estado;//[1]EN_ELABORACION, [2] FINALIZADO, [3] RETIRADO, [4] ENVIDADO;

    
    //Contructor vacio
    public Estudios(){
    }
    //Constructor con parametros
    public Estudios(Fecha realizacion1, Fecha entrega1, Paciente paciente1, Profesional profesional1, int estado1){
        this.realizacion = realizacion1;
        this.entrega = entrega1;
        this.paciente = paciente1;
        this.profesional = profesional1;
        this.estado = estado1;
    }
    
    //getters
    public Fecha getRealizacion(){
        return realizacion;
    }
   
    public Fecha getEntrega(){
        return entrega;
    }
    public Paciente getPaciente(){
        return paciente;
    }
    
    public Profesional getProfesional(){
        return profesional;
    }
    public int getEstado(){
        return estado;
    }
    
    public void setRealizacion( Fecha R1){
        this.realizacion = R1;
    }
    public void setEntrega( Fecha E1){
        this.entrega = E1;
    }
    public void setPaciente ( Paciente P1){
        this.paciente = P1;
    }
    public void setProfesional ( Profesional PO1){
        this.profesional = PO1;
    }
    public void setEstado ( int ES1){
        this.estado = ES1;
        
    }
    @Override
    public String toString(){
        return realizacion+","+entrega+","+","+paciente+","+profesional+","+estado;
    }
}

        