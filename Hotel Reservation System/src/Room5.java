/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import javax.swing.JScrollPane;


/**
 *
 * @author kingr
 */
public class Room5 extends javax.swing.JFrame {

    /**
     * Creates new form booking
     */
    public Room5() {
        initComponents();
        //mini rooms
        mprevious.setBackground(new Color(0, 0, 0, 64));
        mprevious.setBorder (null);
        mprevious.setEditable(false);
        
        mcurrent.setBackground(new Color(0, 0, 0, 64));
        mcurrent.setBorder (null);
        mcurrent.setEditable(false);
        
        mnext.setBackground(new Color(0, 0, 0, 64));
        mnext.setBorder (null);
        mnext.setEditable(false);
        
        
        border.setBackground(new Color(0, 0, 0, 64));
        border.setBorder (null);   
        
        inborder.setBackground(new Color(0, 0, 0, 100));
        inborder.setBorder (null); 
        
        borderbox.getViewport().setOpaque (false);
        borderbox.setBorder (null);
        borderbox.setViewportBorder (null);
        borderbox.setBorder (null);
        borderbox.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        
        bordertext.setEditable(false);
        bordertext.setBackground (new Color(0,0,0,150));
        
        //mini border
        mborder.setBackground(new Color(0, 0, 0, 64));
        mborder.setBorder (null);         
        
        mborderbox.getViewport().setOpaque (false);
        mborderbox.setBorder (null);
        mborderbox.setViewportBorder (null);
        mborderbox.setBorder (null);
        mborderbox.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        mbordertext.setEditable(false);
        mbordertext.setBackground (new Color(0,0,0,150));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        KingDeluxeSuite = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        BookNow = new javax.swing.JButton();
        innerborder = new javax.swing.JLabel();
        MoreEntertainment = new javax.swing.JLabel();
        BathroomBedroom1 = new javax.swing.JLabel();
        BathroomBedroom = new javax.swing.JLabel();
        inborder = new javax.swing.JTextField();
        mborderbox = new javax.swing.JScrollPane();
        mbordertext = new javax.swing.JTextArea();
        mborder = new javax.swing.JTextField();
        borderbox = new javax.swing.JScrollPane();
        bordertext = new javax.swing.JTextArea();
        border = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        imgmc = new javax.swing.JLabel();
        mcurrent = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        imgmn = new javax.swing.JLabel();
        mnext = new javax.swing.JTextField();
        imgmp = new javax.swing.JLabel();
        mprevious = new javax.swing.JTextField();
        png1 = new javax.swing.JLabel();
        Hotel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(49, 48, 77));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, 3));

        KingDeluxeSuite.setBackground(new java.awt.Color(204, 204, 204));
        KingDeluxeSuite.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        KingDeluxeSuite.setForeground(new java.awt.Color(204, 204, 204));
        KingDeluxeSuite.setText("king Deluxe Suite");
        jPanel5.add(KingDeluxeSuite, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 295, 40));

        Price.setFont(new java.awt.Font("Perpetua Titling MT", 3, 40)); // NOI18N
        Price.setForeground(new java.awt.Color(204, 204, 204));
        Price.setText("$1200");
        jPanel5.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 140, 76));

        BookNow.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        BookNow.setText("Book Now");
        BookNow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BookNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNowActionPerformed(evt);
            }
        });
        jPanel5.add(BookNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 130, 40));

        innerborder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel5.add(innerborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 334, 80));

        MoreEntertainment.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MoreEntertainment.setForeground(new java.awt.Color(204, 204, 204));
        MoreEntertainment.setText("More\t                         Entertainment");
        jPanel5.add(MoreEntertainment, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 290, 30));

        BathroomBedroom1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        BathroomBedroom1.setForeground(new java.awt.Color(204, 204, 204));
        BathroomBedroom1.setText("Inclusions");
        jPanel5.add(BathroomBedroom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 100, 20));

        BathroomBedroom.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        BathroomBedroom.setForeground(new java.awt.Color(204, 204, 204));
        BathroomBedroom.setText("Bathroom\t                Bedroom");
        jPanel5.add(BathroomBedroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 290, 20));
        jPanel5.add(inborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 370, 110));

        mbordertext.setBackground(new java.awt.Color(153, 153, 153));
        mbordertext.setColumns(20);
        mbordertext.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        mbordertext.setForeground(new java.awt.Color(204, 204, 204));
        mbordertext.setRows(5);
        mbordertext.setText("\n------------------\nChampagne service\nCoffee/tea maker\nEspresso maker\nMinibar \nRoom service ");
        mborderbox.setViewportView(mbordertext);

        jPanel5.add(mborderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 130, 140));
        jPanel5.add(mborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 230, 150, 160));

        bordertext.setBackground(new java.awt.Color(153, 153, 153));
        bordertext.setColumns(20);
        bordertext.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        bordertext.setForeground(new java.awt.Color(204, 204, 204));
        bordertext.setRows(5);
        bordertext.setText("\n\n\n\n\n    -----------------                   ---------------\nBathrobes\t\tBed sheets\nShower\t\tBlackout drapes/curtains\nFree toiletries\tClimate-controlled air conditioning\nEco-friendly toiletries\tPillowtop bed\nSlippers\t\tPremium bedding\nTowels\t\tFree cribs/infant beds\nHair dryer\t\tFree rollaway/extra beds\n\t\t\n    ---------                             ------------------------\nDaily housekeeping\t65-inch flat-screen TV\nDesk\t\tDigital movies\nIron/ironing board\tPremium channels\nLaptop workspace\tFree WiFi (100+ Mbps)\nPhone\nRecycling bin\nSafeView - city\n ");
        borderbox.setViewportView(bordertext);

        jPanel5.add(borderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 370, 480));
        jPanel5.add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 410, 520));

        jPanel6.setBackground(java.awt.Color.lightGray);
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous.setFont(new java.awt.Font("Garamond", 1, 100)); // NOI18N
        previous.setForeground(new java.awt.Color(255, 255, 255));
        previous.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/previous.png"))); // NOI18N
        previous.setMaximumSize(new java.awt.Dimension(80, 80));
        previous.setMinimumSize(new java.awt.Dimension(80, 80));
        previous.setPreferredSize(new java.awt.Dimension(50, 80));
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousMouseClicked(evt);
            }
        });
        jPanel6.add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 75));

        next.setFont(new java.awt.Font("Garamond", 1, 100)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/next.png"))); // NOI18N
        next.setMaximumSize(new java.awt.Dimension(80, 80));
        next.setMinimumSize(new java.awt.Dimension(80, 80));
        next.setPreferredSize(new java.awt.Dimension(50, 80));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        jPanel6.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 30, 75));

        imgmc.setBackground(new java.awt.Color(255, 255, 255));
        imgmc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/m5.png"))); // NOI18N
        jPanel6.add(imgmc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));
        jPanel6.add(mcurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 220, 140));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 180));

        jPanel4.setBackground(new java.awt.Color(22, 26, 48));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgmn.setBackground(new java.awt.Color(255, 255, 255));
        imgmn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/m6.png"))); // NOI18N
        jPanel4.add(imgmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
        jPanel4.add(mnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 220, 140));

        imgmp.setBackground(new java.awt.Color(255, 255, 255));
        imgmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/m4.png"))); // NOI18N
        jPanel4.add(imgmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        jPanel4.add(mprevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 220, 140));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 150));

        png1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/5.png"))); // NOI18N
        jPanel5.add(png1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 129, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 1080, 590));

        Hotel.setFont(new java.awt.Font("Script MT Bold", 1, 60)); // NOI18N
        Hotel.setText("Hotel");
        getContentPane().add(Hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 160, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/gray-background-3.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNowActionPerformed
        // directs to check-in
        //___ _ = new ___();
        //_.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_BookNowActionPerformed

    private void previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseClicked
        //  previous Room
        new Room4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_previousMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // next Room
        new Room6().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextMouseClicked

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
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BathroomBedroom;
    private javax.swing.JLabel BathroomBedroom1;
    private javax.swing.JButton BookNow;
    private javax.swing.JLabel Hotel;
    private javax.swing.JLabel KingDeluxeSuite;
    private javax.swing.JLabel MoreEntertainment;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel background;
    private javax.swing.JTextField border;
    private javax.swing.JScrollPane borderbox;
    private javax.swing.JTextArea bordertext;
    private javax.swing.JLabel imgmc;
    private javax.swing.JLabel imgmn;
    private javax.swing.JLabel imgmp;
    private javax.swing.JTextField inborder;
    private javax.swing.JLabel innerborder;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField mborder;
    private javax.swing.JScrollPane mborderbox;
    private javax.swing.JTextArea mbordertext;
    private javax.swing.JTextField mcurrent;
    private javax.swing.JTextField mnext;
    private javax.swing.JTextField mprevious;
    private javax.swing.JLabel next;
    private javax.swing.JLabel png1;
    private javax.swing.JLabel previous;
    // End of variables declaration//GEN-END:variables
}
