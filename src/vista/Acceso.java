
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


public class Acceso extends javax.swing.JFrame {

        public Connection cn;
        public Statement stmt;
        public ResultSet rs;
        
    public Acceso() {
        initComponents();
         setLocationRelativeTo(null);//centra ventana
    }
    
    //metodo para conectar a BD Mysql
    
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panGeneral = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        panCapturaDatos = new javax.swing.JPanel();
        lblUsuarioAcceso = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuarioAcceso = new javax.swing.JTextField();
        txtPasswordAcceso = new javax.swing.JPasswordField();
        panRolUsuario = new javax.swing.JPanel();
        optAdmin = new javax.swing.JRadioButton();
        optEntrenador = new javax.swing.JRadioButton();
        lblLogo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnEntrarSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panGeneral.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 232, 0));
        lblTitulo.setText("Sistema control MARQS ' GYM");

        lblAcceso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(255, 51, 51));
        lblAcceso.setText("Acceso a usuarios");

        panCapturaDatos.setBackground(new java.awt.Color(204, 255, 204));
        panCapturaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Captura tus datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 51))); // NOI18N

        lblUsuarioAcceso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuarioAcceso.setText("Usuario");

        lblContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña");

        txtPasswordAcceso.setText("jPasswordField1");

        panRolUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panRolUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona tu rol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 232, 0))); // NOI18N

        buttonGroup1.add(optAdmin);
        optAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optAdmin.setText("Administradores");

        buttonGroup1.add(optEntrenador);
        optEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optEntrenador.setText("Entrenadores");

        javax.swing.GroupLayout panRolUsuarioLayout = new javax.swing.GroupLayout(panRolUsuario);
        panRolUsuario.setLayout(panRolUsuarioLayout);
        panRolUsuarioLayout.setHorizontalGroup(
            panRolUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(optAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(optEntrenador)
                .addGap(42, 42, 42))
        );
        panRolUsuarioLayout.setVerticalGroup(
            panRolUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolUsuarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panRolUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optAdmin)
                    .addComponent(optEntrenador))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panCapturaDatosLayout = new javax.swing.GroupLayout(panCapturaDatos);
        panCapturaDatos.setLayout(panCapturaDatosLayout);
        panCapturaDatosLayout.setHorizontalGroup(
            panCapturaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaDatosLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(panCapturaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCapturaDatosLayout.createSequentialGroup()
                        .addGroup(panCapturaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuarioAcceso)
                            .addComponent(lblContraseña))
                        .addGap(98, 98, 98)
                        .addGroup(panCapturaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioAcceso)
                            .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCapturaDatosLayout.createSequentialGroup()
                        .addComponent(panRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        panCapturaDatosLayout.setVerticalGroup(
            panCapturaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaDatosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panCapturaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioAcceso)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panCapturaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(panRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 51, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEntrarSistema.setBackground(new java.awt.Color(204, 255, 204));
        btnEntrarSistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntrarSistema.setForeground(new java.awt.Color(0, 51, 204));
        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listo.png"))); // NOI18N
        btnEntrarSistema.setText("Entrar");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panGeneralLayout = new javax.swing.GroupLayout(panGeneral);
        panGeneral.setLayout(panGeneralLayout);
        panGeneralLayout.setHorizontalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(232, 232, 232))
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panCapturaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                                .addComponent(lblAcceso)
                                .addGap(308, 308, 308))))
                    .addGroup(panGeneralLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(484, 484, 484)
                        .addComponent(btnEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panGeneralLayout.setVerticalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblAcceso)
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panGeneralLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panCapturaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
              if(optAdmin.isSelected()){
                try{
              String usuario = txtUsuarioAcceso.getText();
              String pass = txtPasswordAcceso.getText();
                   boolean error = true;
                      conectarBase();
                   rs = stmt.executeQuery("select * from administradores");
        while (rs.next() == true){
            if (usuario.equals(rs.getString("usuarioadmin")) && pass.equals(rs.getString("passwordadmin"))){
                        error = false;
                MenuAdmin accesoSistema = new MenuAdmin();//llamada a interfaz
                
                JOptionPane.showMessageDialog(null, "Bienvenido a Sistema\n MARQSGYM Administrador :\n\n" + usuario );
                accesoSistema.setVisible(true);//muestra ventana
                this.hide();//oculta la anterior
            }      
        }
        if (error == true){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos.\n Verifique su nombre o contraseña");
            this.txtUsuarioAcceso.setText(null);
            this.txtPasswordAcceso.setText(null);
            this.txtUsuarioAcceso.requestFocus();//posiciona cursos a caja usuario
        }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error de BD Validacion: \n\n"+ ex);
      }  
                
                
                
                
            }else if (optEntrenador.isSelected()) {
            try{
              String usuario = txtUsuarioAcceso.getText();
              String pass = txtPasswordAcceso.getText();
                   boolean error = true;
                      conectarBase();
                   rs = stmt.executeQuery("select * from entrenadores");
        while (rs.next() == true){
            if (usuario.equals(rs.getString("nombre")) && pass.equals(rs.getString("cedula"))){
                        error = false;
                GestionGym accesoSistemaLibros = new GestionGym();//llamada a interfaz
                
                JOptionPane.showMessageDialog(null, "Bienvenido a Sistema\n MARQSGYM Entrenador :\n\n" + usuario );
                accesoSistemaLibros.setVisible(true);//muestra ventana
                this.hide();//oculta la anterior
            }      
        }
        if (error == true){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos.\n Verifique");
            this.txtUsuarioAcceso.setText(null);
            this.txtPasswordAcceso.setText(null);
            this.txtUsuarioAcceso.requestFocus();//posiciona cursos a caja usuario
        }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error de BD Validacion: \n\n"+ ex);
      }  
              
                
                
        }
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);//cierra ventana
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblAcceso;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioAcceso;
    private javax.swing.JRadioButton optAdmin;
    private javax.swing.JRadioButton optEntrenador;
    private javax.swing.JPanel panCapturaDatos;
    private javax.swing.JPanel panGeneral;
    private javax.swing.JPanel panRolUsuario;
    private javax.swing.JPasswordField txtPasswordAcceso;
    private javax.swing.JTextField txtUsuarioAcceso;
    // End of variables declaration//GEN-END:variables
}
