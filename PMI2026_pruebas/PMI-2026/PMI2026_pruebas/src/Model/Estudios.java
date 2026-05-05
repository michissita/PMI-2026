package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
import Model.Fecha;
import Model.Paciente;
import Model.Profesional;
import java.util.List;

//Revisar analisis.

public class Estudios {
    private Fecha realizacion;
    private Fecha entrega;
    private Paciente paciente;
    private Profesional profesional;
    private int estado;//[1]EN_ELABORACION, [2] FINALIZADO, [3] RETIRADO, [4] ENVIDADO;
    private List<Integer> infoEstudios;
    
    //Contructores
    public Estudios(){
        this.estado = 0;
        this.realizacion = null;
        this.entrega = null;
        this.paciente = null;
        this.profesional = null;
        
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
}

        