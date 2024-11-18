/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediasafe.descartado;

/**
 *
 * @author uriza
 */
public class SesionUsuario {
 // Variable estática para almacenar el correo del usuario actual
    private static String correo;

    // Método para obtener el correo
    public static String getCorreo() {
        return correo;
    }

    // Método para establecer el correo
    public static void setCorreo(String nuevoCorreo) {
        correo = nuevoCorreo;
    }

    // Método para verificar si hay un usuario en sesión
    public static boolean usuarioEnSesion() {
        return correo != null && !correo.isEmpty();
    }
    }
