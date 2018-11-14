/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior.citizen.record.system.barangay_classify;

import java.awt.Toolkit;
import senior.citizen.record.system.Main;

/**
 *
 * @author Administrator
 */
public class Barangay extends javax.swing.JFrame {

    private static final String[] brgyList = {
        "Antipolo", "Ariendo", "Bantog", "Calaanan", "Commercial", "Cruz", "Curva",
        "Digmala", "Caingin", "Labi", "Larcon", "Lusok", "Macabaklay", "Matanggol",
        "Mantile", "Olibete", "Palomaria", "Pesa", "Rizal", "Sampalukan", "San Roque",
        "Santor", "Sinipit", "Sisilang", "Social", "Togatog", "Tulay na bato", "Vega"
    };

    /**
     * Creates new form Barangay
     */
    public Barangay() {
        initComponents();
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xsize = (int) tk.getScreenSize().getWidth();
//        int ysize = (int) tk.getScreenSize().getHeight();
//        this.setSize(xsize, ysize);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnAntipolo = new javax.swing.JButton();
        btnAriendo = new javax.swing.JButton();
        btnBantog = new javax.swing.JButton();
        btnCalaanan = new javax.swing.JButton();
        btnCruz = new javax.swing.JButton();
        btnCurva = new javax.swing.JButton();
        btnDigmala = new javax.swing.JButton();
        btnCaingin = new javax.swing.JButton();
        btnLabi = new javax.swing.JButton();
        btnLarcon = new javax.swing.JButton();
        btnLusok = new javax.swing.JButton();
        btnMacabaklay = new javax.swing.JButton();
        btnMatanggol = new javax.swing.JButton();
        btnMantile = new javax.swing.JButton();
        btnOlibete = new javax.swing.JButton();
        btnPalomaria = new javax.swing.JButton();
        btnPesa = new javax.swing.JButton();
        btnRizal = new javax.swing.JButton();
        btnSampalukan = new javax.swing.JButton();
        btnSanRoque = new javax.swing.JButton();
        btnSantor = new javax.swing.JButton();
        btnSinipit = new javax.swing.JButton();
        btnSisilang = new javax.swing.JButton();
        btnSocial = new javax.swing.JButton();
        btnTogatog = new javax.swing.JButton();
        btnTulaynaBato = new javax.swing.JButton();
        btnCommercial = new javax.swing.JButton();
        btnVega = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(4, 7, 3, 3));

        btnAntipolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_antipolo.png"))); // NOI18N
        btnAntipolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntipoloActionPerformed(evt);
            }
        });
        jPanel1.add(btnAntipolo);

        btnAriendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Ariendo.png"))); // NOI18N
        btnAriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAriendoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAriendo);

        btnBantog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Bantog.png"))); // NOI18N
        btnBantog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBantogActionPerformed(evt);
            }
        });
        jPanel1.add(btnBantog);

        btnCalaanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Calaanan.png"))); // NOI18N
        btnCalaanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalaananActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalaanan);

        btnCruz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_cruz.png"))); // NOI18N
        btnCruz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCruzActionPerformed(evt);
            }
        });
        jPanel1.add(btnCruz);

        btnCurva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Curva.png"))); // NOI18N
        btnCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurvaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCurva);

        btnDigmala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Digmala.png"))); // NOI18N
        btnDigmala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDigmalaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDigmala);

        btnCaingin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Caingin.png"))); // NOI18N
        btnCaingin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCainginActionPerformed(evt);
            }
        });
        jPanel1.add(btnCaingin);

        btnLabi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Labi.jpg"))); // NOI18N
        btnLabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabiActionPerformed(evt);
            }
        });
        jPanel1.add(btnLabi);

        btnLarcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Larcon.jpg"))); // NOI18N
        btnLarcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLarconActionPerformed(evt);
            }
        });
        jPanel1.add(btnLarcon);

        btnLusok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Lusok.png"))); // NOI18N
        btnLusok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLusokActionPerformed(evt);
            }
        });
        jPanel1.add(btnLusok);

        btnMacabaklay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Macabaklay.png"))); // NOI18N
        btnMacabaklay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMacabaklayActionPerformed(evt);
            }
        });
        jPanel1.add(btnMacabaklay);

        btnMatanggol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Matanggol.png"))); // NOI18N
        btnMatanggol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatanggolActionPerformed(evt);
            }
        });
        jPanel1.add(btnMatanggol);

        btnMantile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Mantile.png"))); // NOI18N
        btnMantile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantileActionPerformed(evt);
            }
        });
        jPanel1.add(btnMantile);

        btnOlibete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Olibete.png"))); // NOI18N
        btnOlibete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlibeteActionPerformed(evt);
            }
        });
        jPanel1.add(btnOlibete);

        btnPalomaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Palomaria.png"))); // NOI18N
        btnPalomaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalomariaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPalomaria);

        btnPesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Pesa.png"))); // NOI18N
        btnPesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesa);

        btnRizal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Rizal.png"))); // NOI18N
        btnRizal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRizalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRizal);

        btnSampalukan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Sampalukan.png"))); // NOI18N
        btnSampalukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSampalukanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSampalukan);

        btnSanRoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_San Roque.png"))); // NOI18N
        btnSanRoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanRoqueActionPerformed(evt);
            }
        });
        jPanel1.add(btnSanRoque);

        btnSantor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Santor.png"))); // NOI18N
        btnSantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSantorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSantor);

        btnSinipit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Sinipit.png"))); // NOI18N
        btnSinipit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinipitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSinipit);

        btnSisilang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Sisilang.png"))); // NOI18N
        btnSisilang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisilangActionPerformed(evt);
            }
        });
        jPanel1.add(btnSisilang);

        btnSocial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Social.png"))); // NOI18N
        btnSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSocialActionPerformed(evt);
            }
        });
        jPanel1.add(btnSocial);

        btnTogatog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Togatog.png"))); // NOI18N
        btnTogatog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTogatogActionPerformed(evt);
            }
        });
        jPanel1.add(btnTogatog);

        btnTulaynaBato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Tulay na bato.png"))); // NOI18N
        btnTulaynaBato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTulaynaBatoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTulaynaBato);

        btnCommercial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Commercial.png"))); // NOI18N
        btnCommercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommercialActionPerformed(evt);
            }
        });
        jPanel1.add(btnCommercial);

        btnVega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/barangay_classify/btn_Vega.png"))); // NOI18N
        btnVega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVegaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVega);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 760, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lalaine Ganda\\Desktop\\myphoto\\mainbackground.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAntipoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntipoloActionPerformed
        openSeniorRecords(brgyList[0]);
    }//GEN-LAST:event_btnAntipoloActionPerformed

    private void btnAriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAriendoActionPerformed
        openSeniorRecords(brgyList[1]);
    }//GEN-LAST:event_btnAriendoActionPerformed

    private void btnBantogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBantogActionPerformed
        openSeniorRecords(brgyList[2]);
    }//GEN-LAST:event_btnBantogActionPerformed

    private void btnCalaananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalaananActionPerformed
        openSeniorRecords(brgyList[3]);
    }//GEN-LAST:event_btnCalaananActionPerformed

    private void btnCommercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommercialActionPerformed
        openSeniorRecords(brgyList[4]);
    }//GEN-LAST:event_btnCommercialActionPerformed

    private void btnCruzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCruzActionPerformed
        openSeniorRecords(brgyList[5]);
    }//GEN-LAST:event_btnCruzActionPerformed

    private void btnCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurvaActionPerformed
        openSeniorRecords(brgyList[6]);
    }//GEN-LAST:event_btnCurvaActionPerformed

    private void btnDigmalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigmalaActionPerformed
        openSeniorRecords(brgyList[7]);
    }//GEN-LAST:event_btnDigmalaActionPerformed

    private void btnCainginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCainginActionPerformed
        openSeniorRecords(brgyList[8]);
    }//GEN-LAST:event_btnCainginActionPerformed

    private void btnLabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabiActionPerformed
        openSeniorRecords(brgyList[9]);
    }//GEN-LAST:event_btnLabiActionPerformed

    private void btnLarconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLarconActionPerformed
        openSeniorRecords(brgyList[10]);
    }//GEN-LAST:event_btnLarconActionPerformed

    private void btnLusokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLusokActionPerformed
        openSeniorRecords(brgyList[11]);
    }//GEN-LAST:event_btnLusokActionPerformed

    private void btnMacabaklayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMacabaklayActionPerformed
        openSeniorRecords(brgyList[12]);

    }//GEN-LAST:event_btnMacabaklayActionPerformed

    private void btnMatanggolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatanggolActionPerformed
        openSeniorRecords(brgyList[13]);

    }//GEN-LAST:event_btnMatanggolActionPerformed

    private void btnMantileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantileActionPerformed
        openSeniorRecords(brgyList[14]);
    }//GEN-LAST:event_btnMantileActionPerformed

    private void btnOlibeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlibeteActionPerformed
        openSeniorRecords(brgyList[15]);
    }//GEN-LAST:event_btnOlibeteActionPerformed

    private void btnPalomariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalomariaActionPerformed
        openSeniorRecords(brgyList[16]);
    }//GEN-LAST:event_btnPalomariaActionPerformed

    private void btnPesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesaActionPerformed
        openSeniorRecords(brgyList[17]);
    }//GEN-LAST:event_btnPesaActionPerformed

    private void btnRizalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRizalActionPerformed
        openSeniorRecords(brgyList[18]);
    }//GEN-LAST:event_btnRizalActionPerformed

    private void btnSampalukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSampalukanActionPerformed
        openSeniorRecords(brgyList[19]);
    }//GEN-LAST:event_btnSampalukanActionPerformed

    private void btnSanRoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanRoqueActionPerformed
        openSeniorRecords(brgyList[20]);
    }//GEN-LAST:event_btnSanRoqueActionPerformed

    private void btnSantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantorActionPerformed
        openSeniorRecords(brgyList[21]);
    }//GEN-LAST:event_btnSantorActionPerformed

    private void btnSinipitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinipitActionPerformed
        openSeniorRecords(brgyList[22]);
    }//GEN-LAST:event_btnSinipitActionPerformed

    private void btnSisilangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisilangActionPerformed
        openSeniorRecords(brgyList[23]);
    }//GEN-LAST:event_btnSisilangActionPerformed

    private void btnSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSocialActionPerformed
        openSeniorRecords(brgyList[24]);
    }//GEN-LAST:event_btnSocialActionPerformed

    private void btnTogatogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTogatogActionPerformed
        openSeniorRecords(brgyList[25]);
    }//GEN-LAST:event_btnTogatogActionPerformed

    private void btnTulaynaBatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTulaynaBatoActionPerformed
        openSeniorRecords(brgyList[26]);
    }//GEN-LAST:event_btnTulaynaBatoActionPerformed

    private void btnVegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVegaActionPerformed
        openSeniorRecords(brgyList[27]);
    }//GEN-LAST:event_btnVegaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new Main().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void openSeniorRecords(String brgy) {
        SeniorRecords seniorRecords = new SeniorRecords(brgy);
        seniorRecords.setVisible(true);
        this.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(Barangay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barangay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barangay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barangay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barangay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAntipolo;
    private javax.swing.JButton btnAriendo;
    private javax.swing.JButton btnBantog;
    private javax.swing.JButton btnCaingin;
    private javax.swing.JButton btnCalaanan;
    private javax.swing.JButton btnCommercial;
    private javax.swing.JButton btnCruz;
    private javax.swing.JButton btnCurva;
    private javax.swing.JButton btnDigmala;
    private javax.swing.JButton btnLabi;
    private javax.swing.JButton btnLarcon;
    private javax.swing.JButton btnLusok;
    private javax.swing.JButton btnMacabaklay;
    private javax.swing.JButton btnMantile;
    private javax.swing.JButton btnMatanggol;
    private javax.swing.JButton btnOlibete;
    private javax.swing.JButton btnPalomaria;
    private javax.swing.JButton btnPesa;
    private javax.swing.JButton btnRizal;
    private javax.swing.JButton btnSampalukan;
    private javax.swing.JButton btnSanRoque;
    private javax.swing.JButton btnSantor;
    private javax.swing.JButton btnSinipit;
    private javax.swing.JButton btnSisilang;
    private javax.swing.JButton btnSocial;
    private javax.swing.JButton btnTogatog;
    private javax.swing.JButton btnTulaynaBato;
    private javax.swing.JButton btnVega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
