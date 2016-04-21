/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagementSoftware;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Calendar;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Anthony
 */

class Surface extends JPanel {

    
    public void doDrawing(String actName, int x, int y, String dateStart, String dateEnd, String lateStart, String lateEnd, String duration, String slack) {
        
        Graphics2D g2d = (Graphics2D) this.getGraphics();
        g2d.drawString(dateStart, x+50, y+50);
        g2d.drawString((duration + " days"), x+130, y+50);
        g2d.drawString(dateEnd, x+210, y+50);
        g2d.drawRect(x+40, y+25, 80, 40);//first box 1st row
        g2d.drawRect(x+120, y+25, 80, 40);//second box 1st row
        g2d.drawRect(x+200, y+25, 80, 40);//third box 1st row
        g2d.drawString(actName, x+50, y+90);
        g2d.drawRect(x+40, y+65, 240, 40);//second row box
        g2d.drawString(lateStart, x+50, y+130);
        g2d.drawString(slack + " days", x+130, y+130);
        g2d.drawString(lateEnd, x+210, y+130);
        g2d.drawRect(x+40, y+105, 80, 40);//third row box 1
        g2d.drawRect(x+120, y+105, 80, 40);//third row box 2
        g2d.drawRect(x+200, y+105, 80, 40);//third row box 3
        g2d.drawLine(x+40, y+85, x-40, y+85);
    }
    
    public void drawPertStart(String dateStart){
        Graphics2D g2d = (Graphics2D) this.getGraphics();
        g2d.drawRect(10, 75, 240, 120);
        g2d.drawString("Project Start", 100, 135);
        g2d.drawString(dateStart, 100, 155);
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}

public class mainWindow extends JFrame {

    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        initComponents();
        initOutput();
        this.g = drawArea.getGraphics();
    }

    Random randGen = new Random();
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String dateFormat = "dd/MM/yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    Calendar projectStart = Calendar.getInstance();
    Calendar projectEnd = Calendar.getInstance();
    ArrayList pertActsArray = new ArrayList();
    ArrayList ganttActsArray = new ArrayList();
    ArrayList wbtActsArray = new ArrayList();
    Graphics g;
    Surface drawArea = new Surface();
    int x = 290;
    int y = 50;
            
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        panel1 = new java.awt.Panel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        startDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        endDate = new javax.swing.JTextField();
        projectEntryConfirm = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        activityName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        activityStartDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        activityLengthDays = new javax.swing.JTextField();
        addActivity = new javax.swing.JButton();
        criticalAct = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        menu1.setLabel("File");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("New Table");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Draw Connection");

        jButton5.setText("Colour");
        jButton5.setMaximumSize(new java.awt.Dimension(83, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(83, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(83, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Text Size");

        jButton7.setText("Zoom In");

        jButton8.setText("Text Colour");

        jButton9.setText("Zoom Out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setLabelFor(startDate);
        jLabel1.setText("Project End Date (dd/mm/yyyy)");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setLabelFor(startDate);
        jLabel2.setText("Project Start Date (dd/mm/yyyy)");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        projectEntryConfirm.setText("Confirm Entry");
        projectEntryConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectEntryConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectEntryConfirm)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(projectEntryConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setName("Pert"); // NOI18N

        jLabel3.setText("Activity Name");

        jLabel4.setText("Activity Start Date");

        jLabel5.setText("Activity Length(days)");

        addActivity.setText("Add Activity");
        addActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActivityActionPerformed(evt);
            }
        });

        criticalAct.setText("Critical Activity?");

        jMenu1.setText("New");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Save");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Print");
        jMenuBar1.add(jMenu4);

        jMenu6.setText("Delete");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Settings");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(activityName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(activityStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(activityLengthDays, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(criticalAct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addActivity))
                            .addComponent(jLabel5))
                        .addGap(0, 389, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityLengthDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addActivity)
                    .addComponent(criticalAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initOutput() {
        jTabbedPane1.add(drawArea);
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    private void projectEntryConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectEntryConfirmActionPerformed
        try {
            projectStart.setTime(sdf.parse(startDate.getText()));            
        } catch (ParseException ex) {
            System.err.println("No valid date given.");
        }
        try {
            projectEnd.setTime(sdf.parse(endDate.getText()));
        } catch (ParseException ex) {
            
        }
        
        
        if (projectStart.isSet(Calendar.DAY_OF_MONTH) && projectStart.isSet(Calendar.MONTH) && projectStart.isSet(Calendar.YEAR)){
            PertItem projectStartPERT = new PertItem();
            projectStartPERT.setID("PRT01");
            projectStartPERT.setDate(startDate.getText());
            pertActsArray.add(projectStartPERT);
            drawArea.drawPertStart(startDate.getText());
            GANTTItem projectStartGANTT = new GANTTItem();
            projectStartGANTT.setID("GNT01");
            projectStartGANTT.setDate(startDate.getText());
            ganttActsArray.add(projectStartGANTT);
            WBTItem projectStartWBT = new WBTItem();
            projectStartWBT.setID("WBT01");
            wbtActsArray.add(projectStartWBT);
        }
        else{
            System.err.println("No valid date given.");
        }
    }//GEN-LAST:event_projectEntryConfirmActionPerformed

    private void addActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActivityActionPerformed
        createActivity();
    }//GEN-LAST:event_addActivityActionPerformed

    
    
    
    public String generateID(int typeNum){
        int charSelect = randGen.nextInt(26);
        int id_A = randGen.nextInt(1000000);
        char id_B = alpha.charAt(charSelect);
        char id_C = alpha.charAt(charSelect);
        char id_D = alpha.charAt(charSelect);
        String id = null;
        if (typeNum == 1){    
            id = "WBT" + id_A + id_B + id_C + id_D;
        }else if (typeNum == 2){
            id = "GNT" + id_A + id_B + id_C + id_D;
        }else if (typeNum == 3){
            id = "PRT" + id_A + id_B + id_C + id_D;
        }else{
            System.out.println("Not a valid Item given.");
        }
        return id;
    }
    
    public void createActivity(){
        String activityNm = activityName.getText();
        String activityStDt = activityStartDate.getText();
        int activityLgthDy = Integer.parseInt(activityLengthDays.getText());
        boolean critAct = criticalAct.isSelected();
        PertItem newPertAct =  new PertItem(activityLgthDy, activityNm, critAct);
        newPertAct.setID(generateID(3));
        newPertAct.setDate(activityStDt);
        pertActsArray.add(newPertAct);            
        drawArea.doDrawing(activityNm, x, y, activityStDt, newPertAct.returnEndDate(), newPertAct.returnSlackStart(), newPertAct.returnSlackEnd(), activityLengthDays.getText(), Integer.toString(newPertAct.returnSlack()));
        x = x + 300;
        GANTTItem newGANTTAct = new GANTTItem(activityLgthDy, activityNm);
        newGANTTAct.setID(generateID(2));
        newGANTTAct.setDate(activityStDt);
        ganttActsArray.add(newGANTTAct);
        WBTItem newWBTAct = new WBTItem(activityNm);
        newWBTAct.setID(generateID(1));
        wbtActsArray.add(newWBTAct);
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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activityLengthDays;
    private javax.swing.JTextField activityName;
    private javax.swing.JTextField activityStartDate;
    private javax.swing.JButton addActivity;
    private javax.swing.JCheckBox criticalAct;
    private javax.swing.JTextField endDate;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private java.awt.Panel panel1;
    private javax.swing.JButton projectEntryConfirm;
    private javax.swing.JTextField startDate;
    // End of variables declaration//GEN-END:variables
}