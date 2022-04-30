
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
import modelo.Entrenador;


public class ConsultaEntrenadores extends javax.swing.JFrame {
        public Connection cn;
        public Statement stmt;
        public ResultSet rs;
        //clase entrenador genera objEntrenador para tratamiento de informacion
        
        Entrenador objEntrenador = new Entrenador();
   
    public ConsultaEntrenadores() {
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

        panPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panRegistroEntrenador = new javax.swing.JPanel();
        lblIdEntrenador = new javax.swing.JLabel();
        lblCedulaEntrenador = new javax.swing.JLabel();
        lblNombreEntrenador = new javax.swing.JLabel();
        lblApellidoEntrenador = new javax.swing.JLabel();
        lblProfesionEntrenador = new javax.swing.JLabel();
        lblGeneroEntrenador = new javax.swing.JLabel();
        lblEdadEntrenador = new javax.swing.JLabel();
        lblCertificacionesEntrenador = new javax.swing.JLabel();
        txtEntrenadorId = new javax.swing.JTextField();
        txtEntrenadorNombre = new javax.swing.JTextField();
        txtEntrenadorEdad = new javax.swing.JTextField();
        txtEntrenadorProfesion = new javax.swing.JTextField();
        txtEntrenadorCedula = new javax.swing.JTextField();
        txtEntrenadorApellidos = new javax.swing.JTextField();
        txtEntrenadorGenero = new javax.swing.JTextField();
        txtEntrenadorCertificaciones = new javax.swing.JTextField();
        btnRegistrarEntrenador = new javax.swing.JButton();
        btnLimpiarEntrenador = new javax.swing.JButton();
        bnRegresarMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRevisarActualizaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Registrar nuevo Entrenador");

        panRegistroEntrenador.setBackground(new java.awt.Color(255, 255, 102));
        panRegistroEntrenador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblIdEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdEntrenador.setText("Id:");

        lblCedulaEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCedulaEntrenador.setText("Cedula:");

        lblNombreEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreEntrenador.setText("Nombre:");

        lblApellidoEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidoEntrenador.setText("Apellidos:");

        lblProfesionEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProfesionEntrenador.setText("Profesion:");

        lblGeneroEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGeneroEntrenador.setText("Género:");

        lblEdadEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdadEntrenador.setText("Edad:");

        lblCertificacionesEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCertificacionesEntrenador.setText("Certificaciones:");

        btnRegistrarEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnRegistrarEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntrenadorActionPerformed(evt);
            }
        });

        btnLimpiarEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEntrenadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistroEntrenadorLayout = new javax.swing.GroupLayout(panRegistroEntrenador);
        panRegistroEntrenador.setLayout(panRegistroEntrenadorLayout);
        panRegistroEntrenadorLayout.setHorizontalGroup(
            panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                        .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                                .addComponent(lblProfesionEntrenador)
                                .addGap(18, 18, 18)
                                .addComponent(txtEntrenadorProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                                .addComponent(lblEdadEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEntrenadorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                                .addComponent(lblIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEntrenadorId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                                .addComponent(lblNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEntrenadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGeneroEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCertificacionesEntrenador)
                            .addComponent(lblCedulaEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidoEntrenador))
                        .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistroEntrenadorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistroEntrenadorLayout.createSequentialGroup()
                                        .addComponent(txtEntrenadorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistroEntrenadorLayout.createSequentialGroup()
                                        .addComponent(txtEntrenadorApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))))
                            .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEntrenadorCertificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEntrenadorGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnRegistrarEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        panRegistroEntrenadorLayout.setVerticalGroup(
            panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroEntrenadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEntrenador)
                    .addComponent(lblCedulaEntrenador)
                    .addComponent(txtEntrenadorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrenadorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEntrenador)
                    .addComponent(lblApellidoEntrenador)
                    .addComponent(txtEntrenadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrenadorApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEntrenador)
                    .addComponent(lblGeneroEntrenador)
                    .addComponent(txtEntrenadorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrenadorGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfesionEntrenador)
                    .addComponent(lblCertificacionesEntrenador)
                    .addComponent(txtEntrenadorProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrenadorCertificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panRegistroEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarEntrenador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarEntrenador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        bnRegresarMenu.setBackground(new java.awt.Color(255, 204, 204));
        bnRegresarMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        bnRegresarMenu.setText("Regresar al Menu");
        bnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRegresarMenuActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img1.png"))); // NOI18N

        btnRevisarActualizaciones.setBackground(new java.awt.Color(204, 255, 204));
        btnRevisarActualizaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRevisarActualizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listo.png"))); // NOI18N
        btnRevisarActualizaciones.setText("Revisar Actualizaciones");
        btnRevisarActualizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActualizacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panRegistroEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnRegresarMenu))
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRevisarActualizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(251, 251, 251))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(panRegistroEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnRegresarMenu)
                    .addComponent(btnRevisarActualizaciones))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRegresarMenuActionPerformed
        MenuAdmin ventanaAdministrador = new MenuAdmin();
        ventanaAdministrador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_bnRegresarMenuActionPerformed

    private void btnRevisarActualizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActualizacionesActionPerformed
        RegistroEntrenadores ventanaConsulta = new RegistroEntrenadores();
        ventanaConsulta.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRevisarActualizacionesActionPerformed

    private void btnRegistrarEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntrenadorActionPerformed
         conectarBase();
        //objeto libro toma metodo set de acceso a el dato y se parsea o convierte de objeto a primitivo.
        objEntrenador.setId(Integer.parseInt(txtEntrenadorId.getText()));
        objEntrenador.setCedula(Integer.parseInt(txtEntrenadorCedula.getText()));
        objEntrenador.setNombre(txtEntrenadorNombre.getText());
        objEntrenador.setApellido(txtEntrenadorApellidos.getText());
        objEntrenador.setEdad(txtEntrenadorEdad.getText());
        objEntrenador.setGenero(txtEntrenadorGenero.getText());
        objEntrenador.setProfesion(txtEntrenadorProfesion.getText());
        objEntrenador.setCertificaciones(txtEntrenadorCertificaciones.getText());

        //variable Objeto procesa instrucciones SQL para un INSERT.
        String altaEntrenador = "INSERT INTO entrenadores (`ID`,`cedula`,`nombre`,`apellido`,`profesion`,`genero`,`edad`,`certificaciones`) VALUES ('"+objEntrenador.getId()+"','"+objEntrenador.getCedula()+"','"+objEntrenador.getNombre()+"','"+objEntrenador.getApellido()+"','"+objEntrenador.getProfesion()+"','"+objEntrenador.getGenero()+"','"+objEntrenador.getEdad()+"','"+objEntrenador.getCertificaciones()+"')";

        //ejecutar con estructura de control de tratamiento de errores try-catch
        try {
            stmt.executeUpdate(altaEntrenador);
            JOptionPane.showMessageDialog(null, "Registro Exitoso\n Entrenador \n\n "+objEntrenador.getNombre()+ objEntrenador.getCedula());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 3 de BD para Alta: \n\n" + e);
        }
    }//GEN-LAST:event_btnRegistrarEntrenadorActionPerformed

    private void btnLimpiarEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEntrenadorActionPerformed
        this.txtEntrenadorId.setText("");
        this.txtEntrenadorCedula.setText("");
        this.txtEntrenadorNombre.setText("");
        this.txtEntrenadorApellidos.setText(null);
        this.txtEntrenadorEdad.setText(null);
        this.txtEntrenadorGenero.setText(null);
        this.txtEntrenadorProfesion.setText(null);
        this.txtEntrenadorCertificaciones.setText(null);

        this.txtEntrenadorId.requestFocus();//posiciona cursor
    }//GEN-LAST:event_btnLimpiarEntrenadorActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEntrenadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnRegresarMenu;
    private javax.swing.JButton btnLimpiarEntrenador;
    private javax.swing.JButton btnRegistrarEntrenador;
    private javax.swing.JButton btnRevisarActualizaciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblApellidoEntrenador;
    private javax.swing.JLabel lblCedulaEntrenador;
    private javax.swing.JLabel lblCertificacionesEntrenador;
    private javax.swing.JLabel lblEdadEntrenador;
    private javax.swing.JLabel lblGeneroEntrenador;
    private javax.swing.JLabel lblIdEntrenador;
    private javax.swing.JLabel lblNombreEntrenador;
    private javax.swing.JLabel lblProfesionEntrenador;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panRegistroEntrenador;
    private javax.swing.JTextField txtEntrenadorApellidos;
    private javax.swing.JTextField txtEntrenadorCedula;
    private javax.swing.JTextField txtEntrenadorCertificaciones;
    private javax.swing.JTextField txtEntrenadorEdad;
    private javax.swing.JTextField txtEntrenadorGenero;
    private javax.swing.JTextField txtEntrenadorId;
    private javax.swing.JTextField txtEntrenadorNombre;
    private javax.swing.JTextField txtEntrenadorProfesion;
    // End of variables declaration//GEN-END:variables
}
