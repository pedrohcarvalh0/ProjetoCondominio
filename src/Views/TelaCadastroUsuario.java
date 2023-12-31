/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author tapet
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuário
     */
    public TelaCadastroUsuario() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextField_name_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextField_loggin_user = new javax.swing.JTextField();
        jComboBox_type_user = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_code_access = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        btn_adicionar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPassword_user_confirmed = new javax.swing.JPasswordField();
        jPassword_user1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TextField_name_user1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TextField_loggin_user1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogosCondomínioMenor.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/condoInfo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Condomínio Residencial Univasf");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(88, 88, 86));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        TextField_name_user.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextField_name_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_name_userActionPerformed(evt);
            }
        });
        jPanel3.add(TextField_name_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Login:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, 30));

        TextField_loggin_user.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextField_loggin_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_loggin_userActionPerformed(evt);
            }
        });
        jPanel3.add(TextField_loggin_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 230, 30));

        jComboBox_type_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Tipo de Usuário", "Administrador", "Funcionário", " " }));
        jComboBox_type_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_type_userActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_type_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 270, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Senha:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Confirmar Senha:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Código de Acesso:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, -1, 30));

        jTextField_code_access.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField_code_access.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_code_accessActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField_code_access, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Insira as informações referentes ao novo usuário");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jPanel3.add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 50, 50));

        btn_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar_1.png"))); // NOI18N
        jPanel3.add(btn_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        jPanel3.add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 50, 50));

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jPanel3.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 50, 50));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remover.png"))); // NOI18N
        jPanel3.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 50, 50));

        jPassword_user_confirmed.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel3.add(jPassword_user_confirmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 230, 30));

        jPassword_user1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel3.add(jPassword_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 250, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1000, 160));

        TextField_name_user1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextField_name_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_name_user1ActionPerformed(evt);
            }
        });
        jPanel3.add(TextField_name_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 250, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("ID:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("CPF:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, 30));

        TextField_loggin_user1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextField_loggin_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_loggin_user1ActionPerformed(evt);
            }
        });
        jPanel3.add(TextField_loggin_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 230, 30));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(576, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_name_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_name_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_name_userActionPerformed

    private void TextField_loggin_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_loggin_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_loggin_userActionPerformed

    private void jTextField_code_accessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_code_accessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_code_accessActionPerformed

    private void TextField_name_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_name_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_name_user1ActionPerformed

    private void TextField_loggin_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_loggin_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_loggin_user1ActionPerformed

    private void jComboBox_type_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_type_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_type_userActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField_loggin_user;
    private javax.swing.JTextField TextField_loggin_user1;
    private javax.swing.JTextField TextField_name_user;
    private javax.swing.JTextField TextField_name_user1;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> jComboBox_type_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassword_user1;
    private javax.swing.JPasswordField jPassword_user_confirmed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_code_access;
    // End of variables declaration//GEN-END:variables
}
