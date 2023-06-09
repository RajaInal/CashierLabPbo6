
package guilabpbo6;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.SpinnerNumberModel;


public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        QtyField.setModel(spinnerModel);
    }
    
    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CodeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        QtyField = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AmountField = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TotalField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PayField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BalanceField = new javax.swing.JTextField();
        Billbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReceiptField = new javax.swing.JTextArea();
        Printbtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "POS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Product Code");

        NameField.setEditable(false);
        NameField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Product Name");

        CodeField.setBackground(new java.awt.Color(0, 0, 0));
        CodeField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CodeField.setForeground(new java.awt.Color(255, 204, 0));
        CodeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodeFieldKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");

        QtyField.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QtyFieldStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price");

        PriceField.setEditable(false);
        PriceField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Amount");

        AmountField.setEditable(false);
        AmountField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Addbtn.setText("ADD");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(QtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(QtyField))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total");

        TotalField.setEditable(false);
        TotalField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Pay");

        PayField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Balance");

        BalanceField.setEditable(false);
        BalanceField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Billbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Billbtn.setText("BILL");
        Billbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PayField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Billbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PayField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Billbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Qty", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        DataTable.setShowGrid(true);
        jScrollPane1.setViewportView(DataTable);
        if (DataTable.getColumnModel().getColumnCount() > 0) {
            DataTable.getColumnModel().getColumn(0).setResizable(false);
            DataTable.getColumnModel().getColumn(1).setResizable(false);
            DataTable.getColumnModel().getColumn(2).setResizable(false);
            DataTable.getColumnModel().getColumn(3).setResizable(false);
            DataTable.getColumnModel().getColumn(4).setResizable(false);
        }

        ReceiptField.setEditable(false);
        ReceiptField.setColumns(20);
        ReceiptField.setRows(5);
        jScrollPane2.setViewportView(ReceiptField);

        Printbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Printbtn.setText("PRINT");
        Printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbtnActionPerformed(evt);
            }
        });

        Clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clearbtn.setText("CLEAR");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodeFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodeFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String pcode = CodeField.getText();
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Labpbo_6", "root", "");
                pst = con.prepareStatement("SELECT * FROM product WHERE id = ?");
                
                pst.setString(1, pcode);
                rs = pst.executeQuery();
                
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(rootPane, "Product Code Not Found");
                } else {
                    String pname = rs.getString("productname");
                    String pprice = rs.getString("price");
                    
                    NameField.setText(pname.trim());
                    PriceField.setText(pprice.trim());
                    
                    QtyFieldStateChanged(null);
                }   
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_CodeFieldKeyPressed

    private void QtyFieldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QtyFieldStateChanged
        int qty = Integer.parseInt(QtyField.getValue().toString());
        int price = Integer.parseInt(PriceField.getText());
        int tot = qty * price;
        
        AmountField.setText(String.valueOf(tot));
    }//GEN-LAST:event_QtyFieldStateChanged

    public void Balance() {
        int total = Integer.parseInt(TotalField.getText());
        int pay = Integer.parseInt(PayField.getText());
        int bal = pay - total;
            
        if (bal<0) {
            JOptionPane.showMessageDialog(rootPane, "Not Enough Money !!!");  
        } else {
            BalanceField.setText(String.valueOf(bal));
        }
    }
    
    public void Receipt() {
        String total = TotalField.getText();
        String pay = PayField.getText();
        String bal = BalanceField.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)DataTable.getModel();
        
        ReceiptField.setText(ReceiptField.getText() + "============================\n");
        ReceiptField.setText(ReceiptField.getText() + "=                PBO Super Mart                =\n");
        ReceiptField.setText(ReceiptField.getText() + "============================\n");
        
        ReceiptField.setText(ReceiptField.getText() + "Product" + "\t" + "Price" + "\t" + "Amount" + "\n");
        
        for (int i = 0; i<model.getRowCount(); i++) {
            String pname = (String)model.getValueAt(i, 1);
            String pprice = (String)model.getValueAt(i, 3);
            String amount = (String)model.getValueAt(i, 4);
            
            ReceiptField.setText(ReceiptField.getText() + "  " + pname + "\t" + pprice + "\t" + amount + "\n");
        }
        
        ReceiptField.setText(ReceiptField.getText() + "\n");
        
        ReceiptField.setText(ReceiptField.getText() + "\t" + "Subtotal  : " + total + "\n");
        ReceiptField.setText(ReceiptField.getText() + "\t" + "Pay         : " + pay + "\n");
        ReceiptField.setText(ReceiptField.getText() + "\t" + "Balance  : " + bal + "\n");
        ReceiptField.setText(ReceiptField.getText() + "============================\n");
        ReceiptField.setText(ReceiptField.getText() + "=                    Thank You                     =\n");
        ReceiptField.setText(ReceiptField.getText() + "============================");
    }
    
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)DataTable.getModel();
        model.addRow(new Object[] {
            CodeField.getText(),
            NameField.getText(),
            QtyField.getValue().toString(),
            PriceField.getText(),
            AmountField.getText(),
        });
        
        int sum = 0;

        for (int i = 0; i < DataTable.getRowCount(); i++) {
            sum += Integer.parseInt(DataTable.getValueAt(i, 4).toString());
        }

        TotalField.setText(Integer.toString(sum));
        
        CodeField.setText("");
        NameField.setText("");
        QtyField.setValue(1);
        PriceField.setText("");
        AmountField.setText("");
        CodeField.requestFocus();
    }//GEN-LAST:event_AddbtnActionPerformed

    private void BillbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillbtnActionPerformed
        try {
            Balance();

            int total = Integer.parseInt(TotalField.getText());
            int pay = Integer.parseInt(PayField.getText());
            int bal = pay - total;

            if (bal >= 0) {
                Receipt();
            }
            
            CodeField.setEnabled(false);
            NameField.setEnabled(false);
            QtyField.setEnabled(false);
            PriceField.setEnabled(false);
            AmountField.setEnabled(false);
            Addbtn.setEnabled(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input! Please enter numeric values.");
        }
    }//GEN-LAST:event_BillbtnActionPerformed

    private void PrintbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbtnActionPerformed
        try {
            ReceiptField.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintbtnActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        CodeField.setEnabled(true);
        NameField.setEnabled(true);
        QtyField.setEnabled(true);
        PriceField.setEnabled(true);
        AmountField.setEnabled(true);
        Addbtn.setEnabled(true);
        
        TotalField.setText("");
        PayField.setText("");
        BalanceField.setText("");
        ReceiptField.setText("");
        
        DefaultTableModel model = (DefaultTableModel) DataTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_ClearbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField AmountField;
    private javax.swing.JTextField BalanceField;
    private javax.swing.JButton Billbtn;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField CodeField;
    private javax.swing.JTable DataTable;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField PayField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JButton Printbtn;
    private javax.swing.JSpinner QtyField;
    private javax.swing.JTextArea ReceiptField;
    private javax.swing.JTextField TotalField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
