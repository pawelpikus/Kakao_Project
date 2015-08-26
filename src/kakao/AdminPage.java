/*
 * KAKAO System Planowania Wysy�ek
 * by Pawe� Pikus, Tomasz Pud�o
 */
package kakao;

import static java.rmi.Naming.list;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import static kakao.Sqlite.conn;

/**
 *
 * @author Lusiotron2015
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
    }

    public AdminPage(String i, String n, String s) {
        initComponents();
        user.setText(i + " " + n + ", " + s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        wyloguj = new javax.swing.JButton();
        JPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfield_imie = new javax.swing.JTextField();
        txtfield_nazwisko = new javax.swing.JTextField();
        txtfield_stanowisko = new javax.swing.JTextField();
        txtfield_login = new javax.swing.JTextField();
        txtfield_haslo = new javax.swing.JTextField();
        btn_wprowadz = new javax.swing.JButton();
        wynik = new javax.swing.JLabel();
        Jpanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtfield_loginUpd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfield_imieUpd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtField_nazwiskoUpd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfield_stanowiskoUpd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfield_hasloUpd = new javax.swing.JTextField();
        wynikUpd = new javax.swing.JLabel();
        btn_uaktualnij = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtfield_loginDel = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        wynikDel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_pracownicy = new javax.swing.JList();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Zalogowany jako:");

        user.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        user.setText("user");

        wyloguj.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        wyloguj.setText("Wyloguj");
        wyloguj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wylogujMouseClicked(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 287));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Wprowadź dane nowego użytkownika: ");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Imię: ");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Nazwisko:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Stanowisko");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Login: ");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Hasło:");

        btn_wprowadz.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_wprowadz.setText("Wprowadź Dane");
        btn_wprowadz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_wprowadzMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_wprowadz)
                            .addComponent(wynik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfield_imie, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(txtfield_nazwisko)
                                    .addComponent(txtfield_stanowisko)
                                    .addComponent(txtfield_login)
                                    .addComponent(txtfield_haslo))))
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfield_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfield_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfield_stanowisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfield_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtfield_haslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_wprowadz)
                .addGap(18, 18, 18)
                .addComponent(wynik, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nowy Użytkownik", jPanel1);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Login:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Wpisz aktualne dane użytkownika:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("Imię:");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("Nazwisko");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setText("Stanowisko");

        txtfield_stanowiskoUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_stanowiskoUpdActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setText("Hasło: ");

        btn_uaktualnij.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btn_uaktualnij.setText("Uaktualnij");
        btn_uaktualnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uaktualnijActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addGroup(JpanelLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                            .addComponent(txtfield_loginUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JpanelLayout.createSequentialGroup()
                            .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(55, 55, 55)
                            .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfield_imieUpd, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(txtField_nazwiskoUpd)
                                .addComponent(txtfield_stanowiskoUpd)
                                .addComponent(txtfield_hasloUpd)))
                        .addComponent(wynikUpd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_uaktualnij))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtfield_loginUpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtfield_imieUpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtField_nazwiskoUpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtfield_stanowiskoUpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtfield_hasloUpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_uaktualnij)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wynikUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Uaktualnij Dane", Jpanel);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setText("Login: ");

        btn_delete.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_delete.setText("Usuń");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        try{
            DefaultListModel model = new DefaultListModel();
            String sql="Select username FROM Pracownicy";
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                String username=res.getString("username");

                model.addElement(username);

            }
            jlist_pracownicy.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        jlist_pracownicy.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlist_pracownicy.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlist_pracownicyValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlist_pracownicy);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setText("Lista użytkowników systemu:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfield_loginDel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_delete)
                    .addComponent(wynikDel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtfield_loginDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_delete)
                        .addGap(18, 18, 18)
                        .addComponent(wynikDel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuń Użytkownika", jPanel3);

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wyloguj)
                .addContainerGap())
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(wyloguj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void wylogujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wylogujMouseClicked
        try {
            Kakao.initLoginPage();
            setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_wylogujMouseClicked

    private void btn_wprowadzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_wprowadzMouseClicked
        try {
            //sprawdzanie ostatniego nr id_pracownicy
            String sprawdz = "SELECT id_pracownicy FROM Pracownicy";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sprawdz);

            int lastId = 0;
            while (result.next()) {
                int id = result.getInt(1);
                lastId = id;
            }

            //dodawanie nowego użytkownika z nr id_pracownicy wiekszym o 1 od poprzedniego (lastid+1)
            String sql = "INSERT INTO Pracownicy VALUES (?,?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, lastId + 1);
            stm.setString(2, txtfield_imie.getText());
            stm.setString(3, txtfield_nazwisko.getText());
            stm.setString(4, txtfield_stanowisko.getText());
            stm.setString(5, txtfield_login.getText());
            stm.setString(6, txtfield_haslo.getText());

            int rowsInserted = stm.executeUpdate();
            if (rowsInserted > 0) {
                wynik.setText("Dodano nowego użytkownika!");
            }
        } catch (Exception ex) {
            wynik.setText("Podany login juz istnieje. Podaj inny login!");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_wprowadzMouseClicked

    private void btn_uaktualnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uaktualnijActionPerformed
        try {
            String sql = "UPDATE Pracownicy SET imie=?, nazwisko=?, stanowisko=?, password=? WHERE username=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, txtfield_imieUpd.getText());
            statement.setString(2, txtField_nazwiskoUpd.getText());
            statement.setString(3, txtfield_stanowiskoUpd.getText());
            statement.setString(4, txtfield_hasloUpd.getText());
            statement.setString(5, txtfield_loginUpd.getText());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated>0)
            {
                wynikUpd.setText("Dane użytkownika "+txtfield_loginUpd.getText()+" zostały uaktualnione.");
            }
            else{
                wynikUpd.setText("Podany login nie istnieje.");
                
            }
                
            
        } catch (Exception e) {
            wynikUpd.setText("Podany login nie istnieje.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_uaktualnijActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            String sql = "DELETE FROM Pracownicy WHERE username=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, txtfield_loginDel.getText());
            if ("admin".equals(txtfield_loginDel.getText())) {
                wynikDel.setText("Go to hell!");
                return;
            } else {
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    wynikDel.setText("Użytkownik usunięty z bazy danych.");
                } else {
                    wynikDel.setText("Podany login nie istnieje.");
                }
            }
        } catch (Exception e) {
            wynikDel.setText("Podany login nie istnieje.");
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jlist_pracownicyValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlist_pracownicyValueChanged
        
            txtfield_loginDel.setText(jlist_pracownicy.getSelectedValue().toString()) ;
    }//GEN-LAST:event_jlist_pracownicyValueChanged

    private void txtfield_stanowiskoUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_stanowiskoUpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_stanowiskoUpdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_uaktualnij;
    private javax.swing.JButton btn_wprowadz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList jlist_pracownicy;
    private javax.swing.JTextField txtField_nazwiskoUpd;
    private javax.swing.JTextField txtfield_haslo;
    private javax.swing.JTextField txtfield_hasloUpd;
    private javax.swing.JTextField txtfield_imie;
    private javax.swing.JTextField txtfield_imieUpd;
    private javax.swing.JTextField txtfield_login;
    private javax.swing.JTextField txtfield_loginDel;
    private javax.swing.JTextField txtfield_loginUpd;
    private javax.swing.JTextField txtfield_nazwisko;
    private javax.swing.JTextField txtfield_stanowisko;
    private javax.swing.JTextField txtfield_stanowiskoUpd;
    private javax.swing.JLabel user;
    private javax.swing.JButton wyloguj;
    private javax.swing.JLabel wynik;
    private javax.swing.JLabel wynikDel;
    private javax.swing.JLabel wynikUpd;
    // End of variables declaration//GEN-END:variables
}
