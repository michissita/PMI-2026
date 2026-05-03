package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */

//Se usa la libreria Date, preguntar como se aplicaria
public class Fecha {
     private int dia;
    private int mes;
    private int anio;
    
    //constructores
    public Fecha (){
    this.dia = 0;
    this.mes = 0;
    this.anio = 0;
    }
    
    //Getters
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }
    
    //Setters. Hay que colocar los controles
    
    public void setDia(int d1){
       this.dia = d1;
    }
    
    public void setMes(int m1){
        this.mes = m1;
    }
    //Preguntar como se usaria la libreria Date es estos casos
    public void setAnio (int A1){
            this.anio = A1;
        
    }
    
    public boolean isEmpty() {
        if(dia == 0) {
            return true;
        }
        if(mes == 0) {
            return true;
        }
        if(anio == 0){
            return true;
        }
        return false;
    }

    
    //Retorno. me olvide que habia que poner aca
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio;
        
    }
}

