/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medisafe;

import medisafe.clases.SesionUsuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author uriza
 */
public class Entrada extends javax.swing.JFrame {

    /**
     * Creates new form Entrada
     */
    public Entrada() {
        initComponents();
    setResizable(false); // Desactiva el redimensionamiento
        setLocationRelativeTo(null);
    }
    
    private boolean validarCredenciales(String correo, String password) {
    String userHome = System.getProperty("user.home");

        // Definir la ruta para el nuevo directorio
        String rutaDirectorio = userHome + "\\Documents\\MiDirectorio";
        // Obtener la carpeta principal donde se almacenan los archivos de los usuarios
    File carpetaUsuarios = new File(rutaDirectorio); // Carpeta donde están los archivos con el correo como nombre
    
    // Verificar si la carpeta de usuarios existe
    if (!carpetaUsuarios.exists() || !carpetaUsuarios.isDirectory()) {
        JOptionPane.showMessageDialog(this, "Carpeta de usuarios no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Crear el archivo que tiene el nombre del correo del usuario (correo.txt)
    String correoNormalizado = correo.trim().toLowerCase(); // Elimina espacios y convierte a minúsculas
    File archivoUsuario = new File(carpetaUsuarios, correoNormalizado + ".txt");
    

    // Verificar si el archivo de ese correo existe
    if (!archivoUsuario.exists()) {
        JOptionPane.showMessageDialog(this, "El correo no corresponde a un usuario registrado.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Leer el archivo para validar las credenciales
    try (BufferedReader reader = new BufferedReader(new FileReader(archivoUsuario))) {
        String linea;
        String passwordArchivo = "";

        // Leer las líneas del archivo
        while ((linea = reader.readLine()) != null) {
            // Buscar la línea que contiene la contraseña
            if (linea.startsWith("Contraseña:")) {
                passwordArchivo = linea.split(":")[1].trim(); // Obtener la contraseña almacenada
            }
        }

        // Comparar las contraseñas
        if (password.equals(passwordArchivo)) {
            return true; // Credenciales válidas
        } else {
            return false; // Contraseña incorrecta
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
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
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Olvidar = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label4 = new java.awt.Label();
        jpass = new javax.swing.JPasswordField();
        Salir = new javax.swing.JButton();
        Olvidar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        login.setText("Ingresar");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medisafe/imagenes/hay.png"))); // NOI18N

        Olvidar.setBackground(new java.awt.Color(51, 51, 255));
        Olvidar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Olvidar.setText("Recuperar Usuario y Contraseña");
        Olvidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlvidarMouseClicked(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Medisafe");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton2.setText("Registrar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        label1.setText("Usuario");

        label4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        label4.setText("Contraseña");

        jpass.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jpass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(204, 204, 204));
        Salir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Salir.setText("Salir");
        Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Olvidar1.setBackground(new java.awt.Color(51, 51, 255));
        Olvidar1.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        Olvidar1.setText("La función \"RECUPERAR\" es de PAGA, asi que guarda tus datos");
        Olvidar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Olvidar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 274, Short.MAX_VALUE)
                .addComponent(Olvidar)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jButton2)
                                .addGap(28, 28, 28)
                                .addComponent(login))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Salir)
                        .addGap(90, 90, 90)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Olvidar1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Olvidar)
                .addGap(18, 18, 18)
                .addComponent(Olvidar1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Registrarse registrar = new Registrarse();
        registrar.setVisible(true);
        registrar.pack();
        registrar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2MouseClicked

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void OlvidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlvidarMouseClicked
        // TODO add your handling code here:
        /*Recupera olvida = new Recupera ();
        olvida.setVisible(true);
        olvida.pack();
        olvida.setLocationRelativeTo(null);
        this.dispose();*/
    }//GEN-LAST:event_OlvidarMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    String correo = Usuario.getText();
    String password = new String(jpass.getPassword());

    // Validar campos vacíos
    if (correo.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar credenciales desde la carpeta de usuarios
    if (validarCredenciales(correo, password)) {
        // Guardar el correo del usuario actual en la sesión
        SesionUsuario.iniciarSesion(correo);

        JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");

        // Abrir la página principal
        Paginaprincipal ingresar = new Paginaprincipal();
        ingresar.setVisible(true);
        ingresar.pack();
        ingresar.setLocationRelativeTo(null);
        this.dispose(); // Cerrar la ventana actual
    } else {
        JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_loginActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose(); 
    }//GEN-LAST:event_SalirActionPerformed

    private void Olvidar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Olvidar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Olvidar1MouseClicked

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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Olvidar;
    private javax.swing.JLabel Olvidar1;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpass;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
