 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medisafe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author uriza
 */
public class Paginaprincipal extends javax.swing.JFrame {
    /**
     * Creates new form Paginaprincipal
     */
  
    private DefaultTableModel modelo; // Modelo para la tabla
    private ArrayList<Medicamento> medicamentos; // Lista para almacenar medicamentos

    public Paginaprincipal() {
        initComponents(); // Método generado por NetBeans que configura el diseño
        this.setExtendedState(this.MAXIMIZED_BOTH);

        // Inicializar lista y modelo
        medicamentos = new ArrayList<>();
        
        // Configurar el modelo de tabla no editable
        modelo = new DefaultTableModel(new String[]{"Enfermedad", "Medicamento", "Frecuencia", "Duración"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Evitar que las celdas sean editables
            }
        };
        
        // Asignar el modelo configurado a la tabla
        ver.setModel(modelo);

        // Llamar al método para cargar los datos en la tabla
        cargarDatosEnTablaDesdeArchivo();
   
    setResizable(false); // Desactiva el redimensionamiento
      
    }

    private void cargarDatosEnTablaDesdeArchivo() {
    // Limpiar la lista de medicamentos para asegurarse de que empieza en la posición 0
    medicamentos.clear();
    modelo.setRowCount(0); // Limpiar la tabla

    // Obtener el correo del usuario actual
    String correoUsuario = SesionUsuario.getCorreoUsuarioActual();
    if (correoUsuario == null || correoUsuario.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontró al usuario. Asegúrate de iniciar sesión.");
        return;
    }

    // Ruta del archivo del usuario dentro de la carpeta "usuarios"
    File archivoUsuario = new File("usuarios", correoUsuario + ".txt");
    if (!archivoUsuario.exists()) {
        JOptionPane.showMessageDialog(this, "El archivo del usuario no existe.");
        return;
    }

    // Leer el contenido del archivo
    try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuario))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            // Leer datos en bloques separados por líneas
            if (linea.startsWith("Enfermedad: ")) {
                String enfermedad = linea.replace("Enfermedad: ", "").trim();
                String medicamento = br.readLine().replace("Medicamento: ", "").trim();
                String frecuencia = br.readLine().replace("Frecuencia: ", "").trim();
                String duracion = br.readLine().replace("Duración: ", "").trim();

                // Agregar los datos directamente al modelo de la tabla
                modelo.addRow(new Object[]{enfermedad, medicamento, frecuencia, duracion});

                // Saltar línea separadora (opcional)
                br.readLine(); // Línea que contiene "-----------------------------------"
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Hubo un error al leer el archivo del usuario.");
    }
}
private boolean guardarDatosEnArchivo(String enfermedad, String medicamento, int frecuenciaEnHoras, int duracionEnDias) {
    try {
        // Obtener el correo del usuario actual (asegurarse de que esté logueado)
        String correoUsuario = SesionUsuario.getCorreoUsuarioActual();
        if (correoUsuario == null || correoUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró al usuario.");
            return false;
        }

        // Crear o abrir el archivo del usuario dentro de la carpeta "usuarios"
        File archivoUsuario = new File("usuarios", correoUsuario + ".txt");

        // Si el archivo no existe, crearlo
        if (!archivoUsuario.exists()) {
            archivoUsuario.createNewFile();
        }

        // Escribir los datos en el archivo correspondiente al usuario
        try (FileWriter writer = new FileWriter(archivoUsuario, true)) { // "true" para agregar sin sobrescribir
            writer.write("Enfermedad: " + enfermedad + "\n");
            writer.write("Medicamento: " + medicamento + "\n");
            writer.write("Frecuencia: Cada " + frecuenciaEnHoras + " horas\n");
            writer.write("Duración: " + duracionEnDias + " días\n");
            writer.write("-----------------------------------\n");
        }

        return true; // Indicar que se guardó correctamente
    } catch (IOException e) {
        e.printStackTrace();
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

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ver = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel1.setText("Proximo Evento");

        ver.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ver);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jMenu3.setBackground(new java.awt.Color(204, 204, 204));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medisafe/igual.png"))); // NOI18N
        jMenu3.setToolTipText("");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        jMenu1.setText("Ingresar Nuevo Medicamento");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu2);

        jMenu4.setText("Salir");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu4);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        Entrada salir = new Entrada();
        salir.setVisible(true);
        salir.pack();
        salir.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Medicina medi = new Medicina();
        medi.setVisible(true);
        medi.pack();
        medi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
                 JOptionPane.showMessageDialog(
        this, // Componente padre (el JFrame actual)
        " Envíe un correo a soporte@empresa.com.", // Mensaje
        "Ayuda - Contacto", // Título del cuadro de diálogo
        JOptionPane.INFORMATION_MESSAGE // Tipo de mensaje (informativo)
    ); 
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paginaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ver;
    // End of variables declaration//GEN-END:variables
}
