/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mediasafe;


import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
  
        
    
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        Enfe = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        fin = new javax.swing.JTextField();
        medi = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        cuando = new javax.swing.JPasswordField();
        agreg = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        label7 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        label2.setText("INGRESE SU MEDICAMENTO");

        label3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        label3.setText("Enfermedad");

        label1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        label1.setText("Medicamento");

        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        label4.setText("Cada cuando tomas tu medicamento");

        label5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        label5.setText("Tiempo de Duración");

        agreg.setText("Agragar");
        agreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.setActionCommand("");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        label7.setText("MEDISAFE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enfe, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medi, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuando, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(agreg)
                        .addGap(29, 29, 29)
                        .addComponent(Cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Enfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(medi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agreg)
                    .addComponent(Cancelar))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finActionPerformed

    private void agregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregActionPerformed
        // TODO add your handling code here:
     String enfermedad = Enfe.getText();
    String medicamento = medi.getText();
    String frecuencia = cuando.getText();
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

    // Crear un nombre único para el archivo
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String fecha = sdf.format(new Date());
    String nombreArchivo = "Medicamento_" + fecha + ".txt";

    // Guardar los datos en un archivo
    boolean guardado = guardarDatosEnArchivo(nombreArchivo, enfermedad, medicamento, frecuenciaEnHoras, duracionEnDias);
    if (guardado) {
        // Limpiar los campos después de guardar
        Enfe.setText("");
        medi.setText("");
        cuando.setText("");
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
}

// Método para guardar datos en un archivo
private boolean guardarDatosEnArchivo(String nombreArchivo, String enfermedad, String medicamento, int frecuenciaEnHoras, int duracionEnDias) {
    try (FileWriter writer = new FileWriter(nombreArchivo)) {
        writer.write("Enfermedad: " + enfermedad + "\n");
        writer.write("Medicamento: " + medicamento + "\n");
        writer.write("Frecuencia: Cada " + frecuenciaEnHoras + " horas\n");
        writer.write("Duración: " + duracionEnDias + " días\n");
        writer.write("-----------------------------------\n");
        return true; // Indicar que se guardó correctamente
    } catch (IOException e) {
        e.printStackTrace();
        return false; // Indicar que hubo un error
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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Enfe;
    private javax.swing.JButton agreg;
    private javax.swing.JPasswordField cuando;
    private javax.swing.JTextField fin;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private javax.swing.JTextField medi;
    // End of variables declaration//GEN-END:variables
}
