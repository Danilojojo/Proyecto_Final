/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mediasafe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author uriza
 */
public class Nuevosdatos extends javax.swing.JFrame {

    /**
     * Creates new form Nuevosdatos
     */
    public Nuevosdatos() {
        initComponents();
    }
private boolean actualizarCorreoYContraseña(String correoActual, String nuevoCorreo, String nuevaContraseña) {
    // Obtener el archivo del usuario con el correo actual
    File archivoUsuario = new File("usuarios", correoActual + ".txt");

    // Verificar si el archivo existe
    if (!archivoUsuario.exists()) {
        JOptionPane.showMessageDialog(this, "El usuario no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Leer el archivo y almacenar el contenido actualizado
    StringBuilder contenido = new StringBuilder();
    boolean correoYContraseñaActualizados = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(archivoUsuario))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            // Reemplazar la línea de correo
            if (linea.startsWith("Correo:")) {
                contenido.append("Correo:" + nuevoCorreo + "\n");
                correoYContraseñaActualizados = true;
            }
            // Reemplazar la línea de la contraseña
            else if (linea.startsWith("Contraseña:")) {
                contenido.append("Contraseña:" + nuevaContraseña + "\n");
            }
            else {
                contenido.append(linea + "\n");
            }
        }

        // Si no se actualizó el correo o la contraseña, significa que hubo un error
        if (!correoYContraseñaActualizados) {
            JOptionPane.showMessageDialog(this, "No se encontraron datos para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Hubo un error al leer o escribir el archivo.");
        return false;
    }

    // Guardar los cambios en el archivo
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoUsuario))) {
        writer.write(contenido.toString());
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el archivo actualizado.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        contra2 = new javax.swing.JPasswordField();
        nuevoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        label1.setText("Ingrese sus nuevos");

        label2.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        label2.setText("Datos");

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("Correo Anterior");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("Correo Nuevo");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Confirmar Contraseña");

        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(194, 194, 194))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoc, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(95, 95, 95)
                                .addComponent(jButton2))
                            .addComponent(contra2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Codigo regresar = new Codigo();
        regresar.setVisible(true);
        regresar.pack();
        regresar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    String correoActual = correo.getText();  // Correo actual del usuario
    String nuevoCorreo = nuevoc.getText();  // Nuevo correo ingresado
    String nuevaContraseña = new String(contra2.getPassword());  // Nueva contraseña

    // Validación básica
    if (nuevoCorreo.isEmpty() || nuevaContraseña.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa tanto el correo como la contraseña.");
        return;
    }

    // Llamar al método para actualizar los datos del usuario
    boolean actualizado = actualizarCorreoYContraseña(correoActual, nuevoCorreo, nuevaContraseña);
    
    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Correo y contraseña actualizados con éxito.");
    } else {
        JOptionPane.showMessageDialog(this, "Hubo un error al actualizar los datos.");
    }

    // Abrir la nueva ventana después de la actualización exitosa
    Entrada finalizar = new Entrada();
    finalizar.setVisible(true);
    finalizar.pack();
    finalizar.setLocationRelativeTo(null);
    this.dispose();  // Cerrar la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nuevosdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevosdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevosdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevosdatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevosdatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra2;
    private javax.swing.JTextField correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField nuevoc;
    // End of variables declaration//GEN-END:variables
}
