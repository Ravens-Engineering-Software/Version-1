/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kieran Bingham, Cameron Sokalski, Jacob Laross
 */

import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;

public class CuttingGUI extends javax.swing.JFrame {

    /**
     * Creates new form CuttingGUI
     */
    public CuttingGUI() {
        initComponents();
        DefaultComboBoxModel materialListModel = (DefaultComboBoxModel) materialBox.getModel();
        String[] materialNames={"steel","mild steel","carbon steel","stainless steel","bronze","aluminum","brass","plastic","wood"};
        for (String name:materialNames){
            materialListModel.addElement(name);
        }
        resultLabel.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        toolbarPanel = new javax.swing.JPanel();
        toolbar = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rpmLabel = new javax.swing.JLabel();
        materialBox = new javax.swing.JComboBox();
        numeratorLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        diamiterBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        creditPanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        kieranLabel = new javax.swing.JLabel();
        jacobLabel = new javax.swing.JLabel();
        cameronLabel = new javax.swing.JLabel();
        kieranSeparator = new javax.swing.JSeparator();
        jacobSeparator = new javax.swing.JSeparator();
        cameronSeparator = new javax.swing.JSeparator();
        kieranDescription = new javax.swing.JLabel();
        jacobDescription = new javax.swing.JLabel();
        cameronDescription = new javax.swing.JLabel();
        toolbar1 = new javax.swing.JToolBar();
        ravenEyes = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        cat = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("hello");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(102, 0, 102));

        toolbar.setBackground(new java.awt.Color(153, 153, 153));
        toolbar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toolbar.setFloatable(false);
        toolbar.setRollover(true);
        toolbar.setMaximumSize(new java.awt.Dimension(186, 25));
        toolbar.setMinimumSize(new java.awt.Dimension(186, 25));
        toolbar.setPreferredSize(new java.awt.Dimension(592, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resorces/ldhssRaven.png"))); // NOI18N
        toolbar.add(jLabel1);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(jButton1);

        javax.swing.GroupLayout toolbarPanelLayout = new javax.swing.GroupLayout(toolbarPanel);
        toolbarPanel.setLayout(toolbarPanelLayout);
        toolbarPanelLayout.setHorizontalGroup(
            toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        toolbarPanelLayout.setVerticalGroup(
            toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rpmLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rpmLabel.setForeground(new java.awt.Color(204, 204, 204));
        rpmLabel.setText("RPM =");

        numeratorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numeratorLabel.setForeground(new java.awt.Color(204, 204, 204));
        numeratorLabel.setText("*              4");

        diamiterBox.setEditable(true);
        diamiterBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        diamiterBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("GO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(204, 204, 204));
        resultLabel.setText("= result");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(rpmLabel)
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(materialBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(numeratorLabel))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(diamiterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(resultLabel)
                        .addGap(138, 138, 138)))
                .addComponent(jButton2)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(toolbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rpmLabel)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(materialBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeratorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diamiterBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(resultLabel)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        rpmLabel.getAccessibleContext().setAccessibleDescription("");

        jPanel2.add(mainPanel, "card2");

        header.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        header.setForeground(new java.awt.Color(102, 0, 204));
        header.setText("Software Developpment Team");

        footer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        footer.setForeground(new java.awt.Color(102, 0, 204));
        footer.setText("Cutting Speed App V1.2");

        kieranLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kieranLabel.setText("Kieran Bingham");

        jacobLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jacobLabel.setText("Jacob Larose");

        cameronLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cameronLabel.setText("Cameron Sokalski");

        kieranDescription.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        kieranDescription.setForeground(new java.awt.Color(102, 0, 204));
        kieranDescription.setText("Software Design and President");

        jacobDescription.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jacobDescription.setForeground(new java.awt.Color(102, 0, 204));
        jacobDescription.setText("Database Management and COO");

        cameronDescription.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        cameronDescription.setForeground(new java.awt.Color(102, 0, 204));
        cameronDescription.setText("Grahpic Design, GUI Developpment and CEO");

        toolbar1.setBackground(new java.awt.Color(153, 153, 153));
        toolbar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toolbar1.setFloatable(false);
        toolbar1.setRollover(true);
        toolbar1.setMaximumSize(new java.awt.Dimension(186, 25));
        toolbar1.setMinimumSize(new java.awt.Dimension(186, 25));
        toolbar1.setPreferredSize(new java.awt.Dimension(592, 25));

        ravenEyes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resorces/ldhssRaven.png"))); // NOI18N
        toolbar1.add(ravenEyes);

        homeButton.setText("Home");
        homeButton.setFocusable(false);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar1.add(homeButton);

        cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resorces/cat-small.png"))); // NOI18N

        javax.swing.GroupLayout creditPanelLayout = new javax.swing.GroupLayout(creditPanel);
        creditPanel.setLayout(creditPanelLayout);
        creditPanelLayout.setHorizontalGroup(
            creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbar1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(creditPanelLayout.createSequentialGroup()
                .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creditPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jacobLabel)
                            .addComponent(kieranLabel)
                            .addComponent(cameronLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jacobSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(kieranSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cameronSeparator))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jacobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cameronDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kieranDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(creditPanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(header)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(footer))
            .addGroup(creditPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(cat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        creditPanelLayout.setVerticalGroup(
            creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creditPanelLayout.createSequentialGroup()
                .addComponent(toolbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(header)
                .addGap(52, 52, 52)
                .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kieranLabel)
                    .addGroup(creditPanelLayout.createSequentialGroup()
                        .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kieranDescription)
                            .addComponent(kieranSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditPanelLayout.createSequentialGroup()
                        .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(creditPanelLayout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jacobLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jacobDescription)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jacobSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cameronLabel)
                            .addComponent(cameronDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cameronSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(cat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(footer))
        );

        jPanel2.add(creditPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Create arrays
        int[] materials= {50,100,70,80,80,300,300,500,275};
        
        //Get material value 
        DefaultComboBoxModel materialListModel = (DefaultComboBoxModel) materialBox.getModel();
        int materialSelected = materialListModel.getIndexOf(materialListModel.getSelectedItem());
        int materialSpeed = materials[materialSelected]; 
        
        //Get drill diamiter 
        int drillDiamiter = Integer.valueOf((String)(diamiterBox.getSelectedItem()));
//        resultLabel.setText("= "+ diamiterBox.getSelectedItem() + " - " + diamiterBox.getSelectedIndex() );
        
        //Calculate
        int result = (materialSpeed * 4) / drillDiamiter; 
        
        //Output callculation result
        resultLabel.setText("= "+result);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CuttingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuttingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuttingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuttingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuttingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cameronDescription;
    private javax.swing.JLabel cameronLabel;
    private javax.swing.JSeparator cameronSeparator;
    private javax.swing.JLabel cat;
    private javax.swing.JPanel creditPanel;
    private javax.swing.JComboBox diamiterBox;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel header;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jacobDescription;
    private javax.swing.JLabel jacobLabel;
    private javax.swing.JSeparator jacobSeparator;
    private javax.swing.JLabel kieranDescription;
    private javax.swing.JLabel kieranLabel;
    private javax.swing.JSeparator kieranSeparator;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox materialBox;
    private javax.swing.JLabel numeratorLabel;
    private javax.swing.JLabel ravenEyes;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel rpmLabel;
    private javax.swing.JToolBar toolbar;
    private javax.swing.JToolBar toolbar1;
    private javax.swing.JPanel toolbarPanel;
    // End of variables declaration//GEN-END:variables
}
