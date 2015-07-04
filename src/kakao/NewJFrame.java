/*
 * KAKAO System Planowania Wysy�ek
 * by Pawe� Pikus, Tomasz Pud�o
 */
package kakao;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static kakao.Sqlite.conn;

/**
 *
 * @author laptop
 */
public class NewJFrame extends javax.swing.JFrame {
    
  
    public NewJFrame() {
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

        jTextField1 = new javax.swing.JTextField();
        fileChooser = new javax.swing.JFileChooser();
        ReadFile = new javax.swing.JTabbedPane();
        Wczytaj = new javax.swing.JPanel();
        WczytajCSV = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Artykuly = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_artykulow = new javax.swing.JTable();
        Kierunki = new javax.swing.JPanel();
        ZamowieniaArtykulow = new javax.swing.JPanel();
        ZamowieniaNaKierunki = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WczytajCSV.setText("Wczytaj Plik CSV");
        WczytajCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WczytajCSVActionPerformed(evt);
            }
        });

        jButton2.setText("Wczytaj artykuły");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Wczytaj kierunki");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WczytajLayout = new javax.swing.GroupLayout(Wczytaj);
        Wczytaj.setLayout(WczytajLayout);
        WczytajLayout.setHorizontalGroup(
            WczytajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WczytajLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(WczytajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WczytajCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(578, Short.MAX_VALUE))
        );
        WczytajLayout.setVerticalGroup(
            WczytajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WczytajLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(WczytajCSV)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        ReadFile.addTab("Plik", Wczytaj);

        jButton1.setText("Zapamietaj ilości paletowe");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tabela_artykulow.setModel(new javax.swing.table.DefaultTableModel(
            Kakao.tablicaArtykulow,
            new String [] {
                "Numer", "Nazwa", "Ilość paletowa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_artykulow.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Tabela_artykulow.setFillsViewportHeight(true);
        Tabela_artykulow.setGridColor(new java.awt.Color(51, 51, 0));
        jScrollPane1.setViewportView(Tabela_artykulow);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout ArtykulyLayout = new javax.swing.GroupLayout(Artykuly);
        Artykuly.setLayout(ArtykulyLayout);
        ArtykulyLayout.setHorizontalGroup(
            ArtykulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArtykulyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        ArtykulyLayout.setVerticalGroup(
            ArtykulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArtykulyLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ReadFile.addTab("Artykuły", Artykuly);

        javax.swing.GroupLayout KierunkiLayout = new javax.swing.GroupLayout(Kierunki);
        Kierunki.setLayout(KierunkiLayout);
        KierunkiLayout.setHorizontalGroup(
            KierunkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        KierunkiLayout.setVerticalGroup(
            KierunkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        ReadFile.addTab("Kierunki", Kierunki);

        javax.swing.GroupLayout ZamowieniaArtykulowLayout = new javax.swing.GroupLayout(ZamowieniaArtykulow);
        ZamowieniaArtykulow.setLayout(ZamowieniaArtykulowLayout);
        ZamowieniaArtykulowLayout.setHorizontalGroup(
            ZamowieniaArtykulowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        ZamowieniaArtykulowLayout.setVerticalGroup(
            ZamowieniaArtykulowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        ReadFile.addTab("Zamówienia artykułów", ZamowieniaArtykulow);

        javax.swing.GroupLayout ZamowieniaNaKierunkiLayout = new javax.swing.GroupLayout(ZamowieniaNaKierunki);
        ZamowieniaNaKierunki.setLayout(ZamowieniaNaKierunkiLayout);
        ZamowieniaNaKierunkiLayout.setHorizontalGroup(
            ZamowieniaNaKierunkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        ZamowieniaNaKierunkiLayout.setVerticalGroup(
            ZamowieniaNaKierunkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        ReadFile.addTab("Zamówienia na kierunki", ZamowieniaNaKierunki);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReadFile)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );

        ReadFile.getAccessibleContext().setAccessibleName("Artykuły");
        ReadFile.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        try {
            
            // Na razie nie chce poprawnie działać:
            
            Statement stat = conn.createStatement();
            
            int liczba_wierszy;
            ResultSet rs1 = stat.executeQuery("select count(numer_artykulu) as total from Artykuly");
            liczba_wierszy = rs1.getInt("total");
            rs1.close();
                     
            
            ReadCSV obj = new ReadCSV();
            obj.czysc_tabele("Artykuly");
            System.out.println("Skasowalem dane z artykułów.");
            
            for(int i = 0; i<liczba_wierszy; i++){
                PreparedStatement prep = conn.prepareStatement("insert into Artykuly values(?,?,?);");
                prep.setString(1, Kakao.tablicaArtykulow[i][0]);
                prep.setString(2, Kakao.tablicaArtykulow[i][1]);
                prep.setString(3, Kakao.tablicaArtykulow[i][2]);    
                prep.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          */  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void WczytajCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WczytajCSVActionPerformed
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {

            File plik = fileChooser.getSelectedFile();
            String filename = fileChooser.getName(plik);
            ReadCSV.wczytajPlik(filename);

        }


    }//GEN-LAST:event_WczytajCSVActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // przycisk wczytaj artykuły wykonuje
            ReadCSV obj = new ReadCSV();
            ReadCSV.czysc_tabele("Artykuly");
            obj.uzupelnij_tabele(2, 3, "Artykuly");
            ReadFromDb odczytArtykulow = new ReadFromDb();
            String[] nazwy_kolumn_artykuly = {"numer_artykulu", "nazwa_artykulu", "ilosc_paletowa"};
            odczytArtykulow.pelny_odczyt("Artykuly", 3, nazwy_kolumn_artykuly);
            System.out.println("Wgrano dane do artykułów.");
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tabela_artykulow.setModel(new javax.swing.table.DefaultTableModel(
            Kakao.tablicaArtykulow,
            new String [] {
                "Numer", "Nazwa", "Ilość paletowa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Artykuly;
    private javax.swing.JPanel Kierunki;
    private javax.swing.JTabbedPane ReadFile;
    private javax.swing.JTable Tabela_artykulow;
    private javax.swing.JPanel Wczytaj;
    private javax.swing.JButton WczytajCSV;
    private javax.swing.JPanel ZamowieniaArtykulow;
    private javax.swing.JPanel ZamowieniaNaKierunki;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
