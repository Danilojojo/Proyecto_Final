/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medisafe;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;




/**
 *
 * @author uriza
 */
public class Medicina extends javax.swing.JFrame {

    /**
     * Creates new form Medicina
     */
    

    public Medicina() {
    
        initComponents();
    setResizable(false); // Desactiva el redimensionamiento
        
    }
  private boolean guardarDatosEnArchivo(String enfermedad, String medicamento, int frecuenciaEnHoras, int duracionEnDias) {
    // Obtener el correo del usuario actual desde la sesión
    String correoUsuario = SesionUsuario.getCorreoUsuarioActual();
    if (correoUsuario == null || correoUsuario.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontró al usuario. Asegúrate de iniciar sesión.");
        return false;
    }

    // Crear o verificar la carpeta de usuarios
    File carpetaUsuarios = new File("usuarios");
    if (!carpetaUsuarios.exists()) {
        carpetaUsuarios.mkdirs(); // Si no existe, la crea
    }

    // Crear el archivo específico para el usuario con su correo
    File archivoUsuario = new File(carpetaUsuarios, correoUsuario + ".txt");

    try (FileWriter writer = new FileWriter(archivoUsuario, true)) {
        // Escribir los datos del medicamento en el archivo del usuario
        writer.write("Enfermedad: " + enfermedad + "\n");
        writer.write("Medicamento: " + medicamento + "\n");
        writer.write("Frecuencia: Cada " + frecuenciaEnHoras + " horas\n");
        writer.write("Duración: " + duracionEnDias + " días\n");
        writer.write("-----------------------------------\n");

        return true; // Indicar que se guardó correctamente
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al guardar el medicamento: " + e.getMessage());
        return false; // Indicar que hubo un error
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        Enfe = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        fin = new javax.swing.JTextField();
        medi = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        agreg = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        label7 = new java.awt.Label();
        free = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        label2.setText("INGRESE SU MEDICAMENTO");

        Enfe.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Enfe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        label3.setText("Enfermedad");

        label1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        label1.setText("Medicamento");

        fin.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        fin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });

        medi.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        medi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        label4.setText("Cada cuando tomas tu medicamento");

        label5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        label5.setText("Tiempo de Duración");

        agreg.setBackground(new java.awt.Color(204, 204, 204));
        agreg.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        agreg.setText("Agregar");
        agreg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(204, 204, 204));
        Cancelar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setActionCommand("");
        Cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        label7.setText("MEDISAFE");

        free.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        free.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        free.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(agreg)
                                    .addGap(90, 90, 90)
                                    .addComponent(Cancelar))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(free, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(medi, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Enfe, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Enfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(free, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(agreg))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finActionPerformed

    private void agregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregActionPerformed
        // TODO add your handling code here:

     // Validar que haya un usuario en sesión
    String correoUsuario = SesionUsuario.getCorreoUsuarioActual();
    if (correoUsuario == null || correoUsuario.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay ningún usuario identificado. Inicia sesión primero.");
        return; // Salir si no hay usuario en sesión
    }

    // Obtener los datos ingresados por el usuario
    String enfermedad = Enfe.getText();
    String medicamento = medi.getText();
    String frecuencia = free.getText();
    String duracion = fin.getText();

    // Validación básica
    if (enfermedad.isEmpty() || medicamento.isEmpty() || frecuencia.isEmpty() || duracion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
        return;
    }

    // Validar que la frecuencia sea un número
    int frecuenciaEnHoras;
    try {
        frecuenciaEnHoras = Integer.parseInt(frecuencia); // Convertir frecuencia a número
        if (frecuenciaEnHoras <= 0) {
            JOptionPane.showMessageDialog(null, "La frecuencia debe ser mayor que 0.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido para la frecuencia.");
        return;
    }

    // Validar que la duración sea un número
    int duracionEnDias;
    try {
        duracionEnDias = Integer.parseInt(duracion); // Convertir duración a número
        if (duracionEnDias <= 0) {
            JOptionPane.showMessageDialog(null, "La duración debe ser mayor que 0.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido para la duración.");
        return;
    }

    // Guardar los datos en el archivo correspondiente
    boolean guardado = guardarDatosEnArchivo(enfermedad, medicamento, frecuenciaEnHoras, duracionEnDias);
    if (guardado) {
        // Limpiar los campos después de guardar
        Enfe.setText("");
        medi.setText("");
        free.setText("");
        fin.setText("");

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "Medicamento guardado correctamente.");

        // Abrir la página principal después de guardar los datos
        Paginaprincipal agregado = new Paginaprincipal();
        agregado.setVisible(true);
        agregado.pack();
        agregado.setLocationRelativeTo(null);

        // Cerrar la ventana actual
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Hubo un error al guardar el medicamento.");
    }
    }//GEN-LAST:event_agregActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
         Paginaprincipal cancelar =new Paginaprincipal();
        cancelar.setVisible(true);
        cancelar.pack();
        cancelar.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void freeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freeActionPerformed

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
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new Medicina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Enfe;
    private javax.swing.JButton agreg;
    private javax.swing.JTextField fin;
    private javax.swing.JTextField free;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private javax.swing.JTextField medi;
    // End of variables declaration//GEN-END:variables
}
