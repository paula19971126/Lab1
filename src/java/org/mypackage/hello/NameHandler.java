package org.mypackage.hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class NameHandler {
    private String name;
    int ano;
    String fechadenacimiento;
    int semestre;
    int eda;
    
    
    public NameHandler(){
     name = null;   
     ano= 0;
     fechadenacimiento=null;
     semestre =0;
     eda=0;
    }
    
    public void edad (String edad){
    String vec[];
    int ano;
    int cont;
    vec = edad.split("/");
    ano= Integer.parseInt(vec[2]);
    cont = 2020-ano;
    eda=cont;
    }

    public int getEda() {
        edad(fechadenacimiento);
        return eda;
    }
    

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
            }
