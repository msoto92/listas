/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas;

import java.util.List;

/**
 *
 * @author Miguel
 */
public class Estudiante  extends Persona
{
    private String programa;
    private List<Double> notas;

    public Estudiante( String nombre, String apellido, int edad, String documento, String programa) {
        super(nombre, apellido, edad, documento);
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    
    
    
}
