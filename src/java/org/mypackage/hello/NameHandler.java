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
    int semestreingreso;
    
    
    public NameHandler(){
    
     name = null;   
     ano= 0;
      semestreingreso= 0;
     fechadenacimiento=null;
     semestre =0;
     eda=0;
    }
    
    public String edad (){
        int b =0;
    String vec[]= new String[2];
    int cont;
    vec = fechadenacimiento.split("/");
    fechadenacimiento= "";
    b= Integer.parseInt(vec[2]);
    cont = 2020-b;
    fechadenacimiento = cont + "";
    return fechadenacimiento;
    
    }
    public int semestre(){
       
    switch (semestre)
    {
        case 1: semestreingreso=(2020-ano)*2+1;
        break;
        case 2: semestreingreso=((2020-ano)*2);
        break;
    }
    return semestreingreso;
    
    }

    public void setEda(int eda) {
        this.eda = eda;
    }

    public int getEda() {
        return eda;
    }

    public int getSemestreingreso() {
        return semestre();
    }

    public void setSemestreingreso(int semestreingreso) {
        this.semestreingreso = semestreingreso;
    }


    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getFechadenacimiento() {
        return edad();
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
