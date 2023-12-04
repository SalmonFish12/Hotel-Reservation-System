/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package booking;

import java.awt.Color;
import javax.swing.JScrollPane;


/**
 *
 * @author kingr
 */
public class Room2 extends javax.swing.JFrame {

    /**
     * Creates new form booking
     */
    public Room2() {
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
        TwinExclusiveRoom = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        BookNow = new javax.swing.JButton();
        innerborder = new javax.swing.JLabel();
        MoreEntertainment = new javax.swing.JLabel();
        BathroomBedroom = new javax.swing.JLabel();
        inborder = new javax.swing.JTextField();
        borderbox = new javax.swing.JScrollPane();
        bordertext = new javax.swing.JTextArea();
        border = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        imgmc = new javax.swing.JLabel();
        mcurrent = new javax.swing.JTextField();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
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

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
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

        TwinExclusiveRoom.setBackground(new java.awt.Color(204, 204, 204));
        TwinExclusiveRoom.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        TwinExclusiveRoom.setForeground(new java.awt.Color(204, 204, 204));
        TwinExclusiveRoom.setText("Twin exclusive Room");
        jPanel5.add(TwinExclusiveRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 320, 40));

        Price.setFont(new java.awt.Font("Perpetua Titling MT", 3, 40)); // NOI18N
        Price.setForeground(new java.awt.Color(204, 204, 204));
        Price.setText("$500");
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
        jPanel5.add(MoreEntertainment, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 290, 20));

        BathroomBedroom.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        BathroomBedroom.setForeground(new java.awt.Color(204, 204, 204));
        BathroomBedroom.setText("Bathroom\t                Bedroom");
        jPanel5.add(BathroomBedroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 290, 20));
        jPanel5.add(inborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 370, 110));

        bordertext.setBackground(new java.awt.Color(153, 153, 153));
        bordertext.setColumns(20);
        bordertext.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        bordertext.setForeground(new java.awt.Color(204, 204, 204));
        bordertext.setRows(5);
        bordertext.setText("\n\n\n\n\n    -----------------                   ---------------\nBathrobes\t\tBed sheets\nShower\t\tBlackout drapes/curtains\nFree toiletries\tClimate-controlled air conditioning\nEco-friendly toiletries\tPillowtop bed\nTowels\t\t\n\t\t\n\n    ---------                             ------------------------\nDaily housekeeping\t43-inch flat-screen TV\nDesk\t\tPay movies\nIron/ironing board\tSatellite channels\nLaptop workspace\tFree WiFi (50+ Mbps)\nPhone\nRecycling bin\nSafeView - city\n\n\n \n ");
        borderbox.setViewportView(bordertext);

        jPanel5.add(borderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 370, 480));
        jPanel5.add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 410, 520));

        jPanel6.setBackground(java.awt.Color.lightGray);
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgmc.setBackground(new java.awt.Color(255, 255, 255));
        imgmc.setIcon(new javax.swing.ImageIcon("C:\\Users\\kingr\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\src\\booking\\imgs\\m2.png")); // NOI18N
        jPanel6.add(imgmc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));
        jPanel6.add(mcurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 220, 140));

        previous.setFont(new java.awt.Font("Garamond", 1, 100)); // NOI18N
        previous.setForeground(new java.awt.Color(255, 255, 255));
        previous.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        previous.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/kingr/OneDrive/Documents/NetBeansProjects/JavaApplication1/src/booking/imgs/previous.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
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
        next.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/kingr/OneDrive/Documents/NetBeansProjects/JavaApplication1/src/booking/imgs/next.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        next.setMaximumSize(new java.awt.Dimension(80, 80));
        next.setMinimumSize(new java.awt.Dimension(80, 80));
        next.setPreferredSize(new java.awt.Dimension(50, 80));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        jPanel6.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 30, 75));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 180));

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgmn.setBackground(new java.awt.Color(255, 255, 255));
        imgmn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kingr\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\src\\booking\\imgs\\m3.png")); // NOI18N
        jPanel4.add(imgmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
        jPanel4.add(mnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 220, 140));

        imgmp.setBackground(new java.awt.Color(255, 255, 255));
        imgmp.setIcon(new javax.swing.ImageIcon("C:\\Users\\kingr\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\src\\booking\\imgs\\m1.png")); // NOI18N
        jPanel4.add(imgmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        jPanel4.add(mprevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 220, 140));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 150));

        png1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kingr\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\src\\booking\\imgs\\2.png")); // NOI18N
        jPanel5.add(png1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 129, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 1080, 590));

        Hotel.setFont(new java.awt.Font("Script MT Bold", 1, 60)); // NOI18N
        Hotel.setText("Hotel");
        getContentPane().add(Hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 160, -1));

        background.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/kingr/OneDrive/Documents/NetBeansProjects/JavaApplication1/src/booking/imgs/gray-background-3.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
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
        new Room1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_previousMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // next Room
        new Room3().setVisible(true);
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
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BathroomBedroom;
    private javax.swing.JButton BookNow;
    private javax.swing.JLabel Hotel;
    private javax.swing.JLabel MoreEntertainment;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel TwinExclusiveRoom;
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
    private javax.swing.JTextField mcurrent;
    private javax.swing.JTextField mnext;
    private javax.swing.JTextField mprevious;
    private javax.swing.JLabel next;
    private javax.swing.JLabel png1;
    private javax.swing.JLabel previous;
    // End of variables declaration//GEN-END:variables
}
