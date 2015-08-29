/*
 * KAKAO System Planowania Wysy�ek
 * by Pawe� Pikus, Tomasz Pud�o
 */
package kakao;

import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static kakao.Sqlite.conn;

/**
 *
 * @author Lusiotron2015
 */
public class PassChangePage extends javax.swing.JFrame {

    private String _username;
    public String getUser () {return _username;}
    public final void setUser (String u) {_username=u;}
     
    
    public PassChangePage() {
        initComponents();
    }
    
    public PassChangePage(String user)
    {
        initComponents();
        setUser(user);
        System.out.println(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nPassField = new javax.swing.JPasswordField();
        nPassFieldAgain = new javax.swing.JPasswordField();
        passChange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Wpisz nowe hasło: ");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Wpisz ponownie nowe hasło:");

        passChange.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        passChange.setText(" Zmień Hasło");
        passChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passChange)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(nPassField)
                        .addComponent(nPassFieldAgain)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(nPassFieldAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(passChange)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passChangeActionPerformed
        try {
            char[] pwd = nPassField.getPassword();
            String pass = String.copyValueOf(pwd);
            char [] pwdAgain = nPassFieldAgain.getPassword();
            String passAgain = String.copyValueOf(pwdAgain);
            
            if (nPassField.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "Uzupełnij wszystkie pola!");
            } else if (nPassFieldAgain.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "Uzupełnij wszystkie pola!");

            } else if (!pass.equals(passAgain)) {
                JOptionPane.showMessageDialog(null, "Hasła niezgodne!");
            } else {
                
                String sql = "UPDATE Pracownicy SET password=?, newPAss=? WHERE username=?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, pass);
                statement.setInt(2, 0);
                statement.setString(3, getUser());

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Hasło uzytkownika " + getUser() + " zostało zmienione.");
                    setVisible(false);
                    Kakao.initLoginPage();
                } else {
                    JOptionPane.showMessageDialog(null, "Błąd! Hasło nie zostało zmienione!");

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_passChangeActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField nPassField;
    private javax.swing.JPasswordField nPassFieldAgain;
    private javax.swing.JButton passChange;
    // End of variables declaration//GEN-END:variables
}
