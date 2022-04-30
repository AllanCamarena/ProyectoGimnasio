
package vista;

import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL    DDL,DML,DCL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import modelo.usuario;
public class RegistrarUsuario extends javax.swing.JFrame {

        public Connection cn;
        public Statement stmt;
        public ResultSet rs;
    
        usuario objUsuario = new usuario(); //objeto para n Usuarios
        
    public RegistrarUsuario() {
        initComponents();
        setLocationRelativeTo(null);//centra ventana
    }
    
       public void conectarBase(){//Inicia metodo
    try{ //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdisGym","uisGym","udl12345GYM");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nMARQS'GYM");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
     }
    }//termina metodo

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panRegistroUsuario = new javax.swing.JPanel();
        lblIdUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblApellidoUsuario = new javax.swing.JLabel();
        lblEdadUsuario = new javax.swing.JLabel();
        lblEstaturaUsuario = new javax.swing.JLabel();
        lblPesoUsuario = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApellidoUsuario = new javax.swing.JTextField();
        txtEdadUsuario = new javax.swing.JTextField();
        txtEstaturaUsuario = new javax.swing.JTextField();
        txtPesoUsuario = new javax.swing.JTextField();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblGuardarUsuario = new javax.swing.JLabel();
        lblLimpiarUsuarios = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        bnRegresarMenu = new javax.swing.JButton();
        btnRevisarActualizaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblTitulo.setText("Nuevo Usuario");

        panRegistroUsuario.setBackground(new java.awt.Color(204, 255, 204));
        panRegistroUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registra al nuevo usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblIdUsuario.setText("Id:");

        lblNombreUsuario.setText("Nombre:");

        lblApellidoUsuario.setText("Apellido:");

        lblEdadUsuario.setText("Edad:");

        lblEstaturaUsuario.setText("Estatura:");

        lblPesoUsuario.setText("Peso:");

        javax.swing.GroupLayout panRegistroUsuarioLayout = new javax.swing.GroupLayout(panRegistroUsuario);
        panRegistroUsuario.setLayout(panRegistroUsuarioLayout);
        panRegistroUsuarioLayout.setHorizontalGroup(
            panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblApellidoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEdadUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEstaturaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(lblPesoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstaturaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panRegistroUsuarioLayout.setVerticalGroup(
            panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroUsuarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdUsuario)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoUsuario)
                    .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadUsuario)
                    .addComponent(txtEdadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstaturaUsuario)
                    .addComponent(txtEstaturaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesoUsuario)
                    .addComponent(txtPesoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        btnRegistrarUsuario.setBackground(new java.awt.Color(0, 204, 204));
        btnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblGuardarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGuardarUsuario.setText("Guardar Usuario");

        lblLimpiarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLimpiarUsuarios.setText("Limpiar campos");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrenador.png"))); // NOI18N

        bnRegresarMenu.setBackground(new java.awt.Color(255, 204, 204));
        bnRegresarMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        bnRegresarMenu.setText("Regresar al Menu");
        bnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRegresarMenuActionPerformed(evt);
            }
        });

        btnRevisarActualizaciones.setBackground(new java.awt.Color(204, 255, 204));
        btnRevisarActualizaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRevisarActualizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listo.png"))); // NOI18N
        btnRevisarActualizaciones.setText("Revisar Actualizaciones");
        btnRevisarActualizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActualizacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lblGuardarUsuario))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 296, Short.MAX_VALUE))
                                    .addComponent(lblLimpiarUsuarios)))
                            .addComponent(lblTitulo))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnRegresarMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRevisarActualizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(panRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblGuardarUsuario)
                                .addGap(94, 94, 94)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImagen))
                        .addGap(31, 31, 31)
                        .addComponent(lblLimpiarUsuarios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnRegresarMenu)
                    .addComponent(btnRevisarActualizaciones))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
           conectarBase();
        //objeto libro toma metodo set de acceso a el dato y se parsea o convierte de objeto a primitivo.
        objUsuario.setId(Integer.parseInt(txtIdUsuario.getText()));
        objUsuario.setNombre(txtNombreUsuario.getText());
        objUsuario.setApellido(txtApellidoUsuario.getText());
        objUsuario.setEdad(txtEdadUsuario.getText());
        objUsuario.setEstatura(txtEstaturaUsuario.getText());
        objUsuario.setPeso(txtPesoUsuario.getText());

        //variable Objeto procesa instrucciones SQL para un INSERT.
        String altaUsuario = "INSERT INTO usuario (`ID`,`nombre`,`apellido`,`edad`,`estatura`,`peso`) VALUES ('"+objUsuario.getId()+"','"+objUsuario.getNombre()+"','"+objUsuario.getApellido()+"','"+objUsuario.getEdad()+"','"+objUsuario.getEstatura()+"','"+objUsuario.getPeso()+"')";

        //ejecutar con estructura de control de tratamiento de errores try-catch
        try {
            stmt.executeUpdate(altaUsuario);
            JOptionPane.showMessageDialog(null, "Registro Exitoso\n Usuario \n\n "+objUsuario.getNombre());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 3 de BD para Alta: \n\n" + e);
        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtIdUsuario.setText("");
        this.txtNombreUsuario.setText("");
        this.txtApellidoUsuario.setText(null);
        this.txtEdadUsuario.setText(null);
        this.txtEstaturaUsuario.setText(null);
        this.txtPesoUsuario.setText(null);

        this.txtIdUsuario.requestFocus();//posiciona cursor
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void bnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRegresarMenuActionPerformed
         MenuAdmin ventanaAdministrador = new MenuAdmin();
        ventanaAdministrador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_bnRegresarMenuActionPerformed

    private void btnRevisarActualizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActualizacionesActionPerformed
        ConsultaUsuario ventanaConsulta = new ConsultaUsuario();
        ventanaConsulta.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRevisarActualizacionesActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnRegresarMenu;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRevisarActualizaciones;
    private javax.swing.JLabel lblApellidoUsuario;
    private javax.swing.JLabel lblEdadUsuario;
    private javax.swing.JLabel lblEstaturaUsuario;
    private javax.swing.JLabel lblGuardarUsuario;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLimpiarUsuarios;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPesoUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panRegistroUsuario;
    private javax.swing.JTextField txtApellidoUsuario;
    private javax.swing.JTextField txtEdadUsuario;
    private javax.swing.JTextField txtEstaturaUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPesoUsuario;
    // End of variables declaration//GEN-END:variables
}
