/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josh.com.medisafe;

/**
 *
 * @author Josué Yax
 */
public class Usuario {
    String Nombre;
    String Correo;
    String Contraseña;
    String Confirmar;
    String Diagnóstico;
    int Edad;

    public Usuario() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getDiagnóstico() {
        return Diagnóstico;
    }

    public void setDiagnóstico(String Diagnóstico) {
        this.Diagnóstico = Diagnóstico;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getConfirmar() {
        return Confirmar;
    }

    public void setConfirmar(String Confirmar) {
        this.Confirmar = Confirmar;
    }
}
