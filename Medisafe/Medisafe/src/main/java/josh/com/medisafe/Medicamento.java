/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josh.com.medisafe;

import java.time.LocalTime;

/**
 *
 * @author Josué Yax
 */
public class Medicamento {
    String nombre;
    String Dosis;
    LocalTime Horatoma;
    String Frecuencia;

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

    public LocalTime getHoratoma() {
        return Horatoma;
    }

    public void setHoratoma(LocalTime Horatoma) {
        this.Horatoma = Horatoma;
    }

    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }
    
    
}
