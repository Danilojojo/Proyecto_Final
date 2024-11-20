/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medisafe.clases;

/**
 *
 * @author uriza
 */
public class SesionUsuario {
  private static String correoUsuarioActual;

    // Método para guardar el correo del usuario actual al iniciar sesión
    public static void iniciarSesion(String correo) {
        correoUsuarioActual = correo;
    }

    // Método para obtener el correo del usuario actual
    public static String getCorreoUsuarioActual() {
        return correoUsuarioActual;
    }

    // Método para cerrar la sesión
    public static void cerrarSesion() {
        correoUsuarioActual = null;
    }
    }
