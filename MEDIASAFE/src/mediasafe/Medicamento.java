/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediasafe;

import java.time.LocalTime;

/**
 *
 * @author uriza
 */
public class Medicamento {
     String nombre;
    String Dosis;
    LocalTime frecuenacia;
    String Final;

    public Medicamento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public LocalTime getFrecuenacia() {
        return frecuenacia;
    }

    public void setFrecuenacia(LocalTime frecuenacia) {
        this.frecuenacia = frecuenacia;
    }
 

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }

 
    
}
