
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


public class BuscarEditarEntrenadores extends javax.swing.JFrame {

        public Connection cn;
        public Statement stmt;
        public ResultSet rs;
        //clase entrenador genera objEntrenador para tratamiento de informacion
        
        Entrenador objEntrenador = new Entrenador();
        
    public BuscarEditarEntrenadores() {
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
        jPanel1 = new javax.swing.JPanel();
        lblIdEntrenador = new javax.swing.JLabel();
        lblNombreEntrenador = new javax.swing.JLabel();
        lblCedulaEntrenador = new javax.swing.JLabel();
        lblApellidoEntrenador = new javax.swing.JLabel();
        lblEdadEntrenador = new javax.swing.JLabel();
        lblGeneroEntrenador = new javax.swing.JLabel();
        lblProfesionEntrenador = new javax.swing.JLabel();
        lblCertificacionesEntrenador = new javax.swing.JLabel();
        txtEditarIdEntrenador = new javax.swing.JTextField();
        txtEditarCedulaEntrenador = new javax.swing.JTextField();
        txtEditarNombreEntrenador = new javax.swing.JTextField();
        txtEditarApellidosEntrenador = new javax.swing.JTextField();
        txtEditarProfesionEntrenador = new javax.swing.JTextField();
        txtEditarGeneroEntrenador = new javax.swing.JTextField();
        txtEditarEdadEntrenador = new javax.swing.JTextField();
        txtEditarCertificacionesEntrenador = new javax.swing.JTextField();
        btnEditarEntrenadores = new javax.swing.JButton();
        btnBuscarIdEntrenadores = new javax.swing.JButton();
        btnRegresarMenu = new javax.swing.JButton();
        btnRevisarActualizaciones2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Busca o edita a cualquier entrenador");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busca/edita ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblIdEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdEntrenador.setText("Id:");

        lblNombreEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreEntrenador.setText("Nombre:");

        lblCedulaEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCedulaEntrenador.setText("Cedula:");

        lblApellidoEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidoEntrenador.setText("Apellidos:");

        lblEdadEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdadEntrenador.setText("Edad:");

        lblGeneroEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGeneroEntrenador.setText("Género:");

        lblProfesionEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProfesionEntrenador.setText("Profesion:");

        lblCertificacionesEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCertificacionesEntrenador.setText("Certificaciones:");

        btnEditarEntrenadores.setBackground(new java.awt.Color(255, 0, 51));
        btnEditarEntrenadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarEntrenadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarEntrenadores.setText("Editar entrenador");
        btnEditarEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEntrenadoresActionPerformed(evt);
            }
        });

        btnBuscarIdEntrenadores.setBackground(new java.awt.Color(0, 0, 153));
        btnBuscarIdEntrenadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarIdEntrenadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarIdEntrenadores.setText("Buscar por Id");
        btnBuscarIdEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdEntrenadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProfesionEntrenador)
                    .addComponent(lblEdadEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditarNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarProfesionEntrenador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarEdadEntrenador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblApellidoEntrenador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEditarApellidosEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCedulaEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEditarCedulaEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblGeneroEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEditarGeneroEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCertificacionesEntrenador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEditarCertificacionesEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnBuscarIdEntrenadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarEntrenadores)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEditarIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCertificacionesEntrenador)
                            .addComponent(txtEditarCertificacionesEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditarProfesionEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProfesionEntrenador)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdEntrenador)
                            .addComponent(lblCedulaEntrenador)
                            .addComponent(txtEditarCedulaEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidoEntrenador)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombreEntrenador)
                                .addComponent(txtEditarNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEditarApellidosEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGeneroEntrenador)
                            .addComponent(txtEditarGeneroEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdadEntrenador)
                            .addComponent(txtEditarEdadEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEntrenadores)
                    .addComponent(btnBuscarIdEntrenadores))
                .addGap(55, 55, 55))
        );

        btnRegresarMenu.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresarMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnRegresarMenu.setText("Regresar al menu");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        btnRevisarActualizaciones2.setBackground(new java.awt.Color(204, 255, 204));
        btnRevisarActualizaciones2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRevisarActualizaciones2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listo.png"))); // NOI18N
        btnRevisarActualizaciones2.setText("Revisar Actualizaciones");
        btnRevisarActualizaciones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActualizaciones2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrenador2.png"))); // NOI18N

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnRegresarMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRevisarActualizaciones2)
                .addGap(205, 205, 205))
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(248, 248, 248))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRevisarActualizaciones2)
                    .addComponent(btnRegresarMenu))
                .addGap(24, 24, 24))
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

    private void btnEditarEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEntrenadoresActionPerformed
        String actualizarEntrenador = "";

        try {
            conectarBase();

            objEntrenador.setId(Integer.parseInt(txtEditarIdEntrenador.getText()));
            objEntrenador.setCedula(Integer.parseInt(txtEditarCedulaEntrenador.getText()));
            objEntrenador.setNombre(txtEditarNombreEntrenador.getText());
            objEntrenador.setApellido(txtEditarApellidosEntrenador.getText());
            objEntrenador.setProfesion(txtEditarProfesionEntrenador.getText());
            objEntrenador.setGenero(txtEditarGeneroEntrenador.getText());
            objEntrenador.setEdad(txtEditarEdadEntrenador.getText());
            objEntrenador.setCertificaciones(txtEditarCertificacionesEntrenador.getText());

            actualizarEntrenador = "UPDATE entrenadores SET cedula = '"+objEntrenador.getCedula()+"', nombre = '"+objEntrenador.getNombre()+"',apellido = '"+objEntrenador.getApellido()+"',profesion = '"+objEntrenador.getProfesion()+"',genero = '"+objEntrenador.getGenero()+"',edad = '"+objEntrenador.getEdad()+"',certificaciones = '"+objEntrenador.getCertificaciones()+"' where id='"+ objEntrenador.getId()+"' ";
            stmt.executeUpdate(actualizarEntrenador);
            JOptionPane.showMessageDialog(null, "Datos del entrenador actualizados \n de forma correcta\n\nVerifica consulta");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos 7 editar\n" + ex);
        }
    }//GEN-LAST:event_btnEditarEntrenadoresActionPerformed

    private void btnBuscarIdEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdEntrenadoresActionPerformed
        try {
            conectarBase();
            objEntrenador.setId(Integer.parseInt(txtEditarIdEntrenador.getText()));
            rs=stmt.executeQuery("SELECT * FROM entrenadores where id ='"+objEntrenador.getId()+"'");
            JOptionPane.showMessageDialog(null, "Buscando Entrenador.....");

            if (rs.next()==true) {
                txtEditarCedulaEntrenador.setText(rs.getString("cedula"));
                txtEditarNombreEntrenador.setText(rs.getString("nombre"));
                txtEditarApellidosEntrenador.setText(rs.getString("apellido"));
                txtEditarProfesionEntrenador.setText(rs.getString("profesion"));
                txtEditarGeneroEntrenador.setText(rs.getString("genero"));
                txtEditarEdadEntrenador.setText(rs.getString("edad"));
                txtEditarCertificacionesEntrenador.setText(rs.getString("certificaciones"));
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe el ID del entrenador");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 6 de BD para editar: \n\n" + ex);
        }
    }//GEN-LAST:event_btnBuscarIdEntrenadoresActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
           MenuAdmin ventanaAdministrador = new MenuAdmin();
        ventanaAdministrador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void btnRevisarActualizaciones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActualizaciones2ActionPerformed
       RegistroEntrenadores ventanaConsulta = new RegistroEntrenadores();
        ventanaConsulta.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRevisarActualizaciones2ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarEditarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEditarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEditarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEditarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarEditarEntrenadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarIdEntrenadores;
    private javax.swing.JButton btnEditarEntrenadores;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnRevisarActualizaciones2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField txtEditarApellidosEntrenador;
    private javax.swing.JTextField txtEditarCedulaEntrenador;
    private javax.swing.JTextField txtEditarCertificacionesEntrenador;
    private javax.swing.JTextField txtEditarEdadEntrenador;
    private javax.swing.JTextField txtEditarGeneroEntrenador;
    private javax.swing.JTextField txtEditarIdEntrenador;
    private javax.swing.JTextField txtEditarNombreEntrenador;
    private javax.swing.JTextField txtEditarProfesionEntrenador;
    // End of variables declaration//GEN-END:variables
}
