/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.sql.PreparedStatement;
/**
 *
 * @author ASUS
 */
public class gradePage extends javax.swing.JFrame {

    /**
     * Creates new form gradePage
     */
    Connection con=null;
    Statement s;
    ResultSet r;


    int studentCin;
    public gradePage() {
        initComponents();
    }
    public gradePage(String cin)
    {
        initComponents();
        this.studentCin = Integer.parseInt(cin);
        con = new DbConnect().connect();
        cinLabel.setText("Logged in as "+cin);
        getGradesData();
        getSubjectsData();
    }
    
    public void getGradesData(){
        DefaultTableModel model=new DefaultTableModel();
        try{
        model.addColumn("Subject");   
        model.addColumn("Ds"); 
        model.addColumn("Exam");
        model.addColumn("Tp"); 
        model.addColumn("Average"); 

        model.setRowCount(0);
        s=con.createStatement();
        ResultSet Rs= s.executeQuery("Select * from note where studentId = "+ this.studentCin);
        while(Rs.next())
        {
            Statement stmt;
            stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("select subjectName from subject where id="+Rs.getInt("subjectId"));
            result.next();
            model.addRow(new Object[]{result.getString("subjectName"),Rs.getFloat("dsGrade"),Rs.getFloat("examGrade"),Rs.getFloat("tpGrade"),Rs.getFloat("average")});
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        studentInfoTable.setModel(model);
    }
    public void getSubjectsData(){
        try{
            DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
            comboBoxModel.addElement(new String("All Grades"));
            subjectsBox.setSelectedItem("All Grades");
            s = con.createStatement();
            ResultSet rs = s.executeQuery("Select major from student where cin="+this.studentCin);
            rs.next();
            PreparedStatement stmt;
            stmt = con.prepareStatement("select subjectId from majorsubject where designation = ?");
            String major = (String)rs.getString("major");
            stmt.setString(1, major);
            JOptionPane.showMessageDialog(null, rs.getString("major"));            
            ResultSet result = stmt.executeQuery();
            JOptionPane.showMessageDialog(null, "done");
            while(result.next()){
                Statement subjectsNamesStmt;
                subjectsNamesStmt = con.createStatement(); 
                ResultSet subjectsNamesResult = subjectsNamesStmt.executeQuery("select subjectName from subject where id="+result.getInt("subjectId"));
                subjectsNamesResult.next();
                comboBoxModel.addElement(new String(subjectsNamesResult.getString("subjectName")));
            }
            subjectsBox.setModel(comboBoxModel);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cinLabel = new javax.swing.JLabel();
        subjectsBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentInfoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grades");
        setPreferredSize(new java.awt.Dimension(778, 400));
        getContentPane().setLayout(null);

        cinLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cinLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cinLabel);
        cinLabel.setBounds(90, 50, 630, 50);

        subjectsBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectsBox.setForeground(new java.awt.Color(0, 0, 54));
        subjectsBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        subjectsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectsBoxActionPerformed(evt);
            }
        });
        getContentPane().add(subjectsBox);
        subjectsBox.setBounds(640, 70, 110, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user(6).png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 30, 64, 90);

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        backBtn.setBorderPainted(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(10, 20, 20, 20);

        studentInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subject", "Ds", "Examen", "Tp", "Average"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentInfoTable.setAlignmentX(1.0F);
        studentInfoTable.setAlignmentY(1.0F);
        jScrollPane1.setViewportView(studentInfoTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 160, 770, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bleu.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 780, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectsBoxActionPerformed
        // TODO add your handling code here:
                try{
            String subjectName = (String) subjectsBox.getSelectedItem();
            if(subjectName.equals("All Grades")){
                getGradesData();
            }else{
            // get subject id
            PreparedStatement stmt1 = con.prepareStatement("Select id from subject where subjectName = ?");
            stmt1.setString(1, subjectName);
            ResultSet result1 = stmt1.executeQuery();
            result1.next();
            PreparedStatement stmt = con.prepareStatement("Select count(*) from note where studentId = ? and subjectId = ?");
            stmt.setInt(1, this.studentCin);
            stmt.setInt(2, result1.getInt("id"));
            ResultSet result2 = stmt.executeQuery();
            result2.next();
            if(result2.getInt("count(*)")!=0){
                stmt = con.prepareStatement("Select * from note where studentId = ? and subjectId = ?");
                stmt.setInt(1, this.studentCin);
                stmt.setInt(2, result1.getInt("id"));
                result2 = stmt.executeQuery();
                DefaultTableModel newModel = new DefaultTableModel();
                newModel.addColumn("Subject");   
                newModel.addColumn("Ds"); 
                newModel.addColumn("Exam");
                newModel.addColumn("Tp"); 
                newModel.addColumn("Average"); 
                while(result2.next()){
                    newModel.addRow(new Object[]{subjectName,result2.getFloat("dsGrade"),result2.getFloat("examGrade"),result2.getFloat("tpGrade"),result2.getFloat("average")});
                }
                studentInfoTable.setModel(newModel);
            }else{
                JOptionPane.showMessageDialog(null, "No Grades Found in Subject " + subjectName);  
            }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_subjectsBoxActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
            {

                public void run()
                {
                    login back = new login();
                    back.setVisible(true);
                }
            });
    }//GEN-LAST:event_backBtnMouseClicked

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
            java.util.logging.Logger.getLogger(gradePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cinLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentInfoTable;
    private javax.swing.JComboBox<String> subjectsBox;
    // End of variables declaration//GEN-END:variables
}
