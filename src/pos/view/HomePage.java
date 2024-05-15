/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.view;

import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.PlainDocument;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import pos.App;
import pos.controller.AuthController;
import pos.controller.SalesController;
import pos.exception.InstanceNotFoundException;
import pos.model.Product;
import pos.model.User;
import pos.utils.CustomDocumentFilter;
import pos.view.dialogs.CheckOutDialog;
import pos.view.dialogs.ManageUsersDialog;

/**
 *
 * @author husainazkas
 */
public class HomePage extends javax.swing.JFrame {

    private final SalesController controller = new SalesController();
    private final NumberFormat numberFormat = NumberFormat.getInstance();

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        controller.loadProducts(jTable1.getModel());
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addToCartButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        manageUserButton = new javax.swing.JButton();
        manageProductButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalPriceText = new javax.swing.JLabel();
        purchaseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point of Sales | Home");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/res/images/icon.png")).getImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Available Products"));

        jLabel1.setText("Search");

        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                controller.filterBySearch(jTextField1.getText(), jTable1.getModel());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                controller.filterBySearch(jTextField1.getText(), jTable1.getModel());
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                controller.filterBySearch(jTextField1.getText(), jTable1.getModel());
            }
        });
        jTextField1.setToolTipText("Barcode ID/Name/Brand");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Barcode ID", "Name", "Price", "Stock", "Brand"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer centerHeaderRenderer1 = (DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer();
        centerHeaderRenderer1.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        TableColumnModel table1Column = jTable1.getColumnModel();

        TableColumn index1Column = table1Column.getColumn(0);
        index1Column.setPreferredWidth(30);
        index1Column.setCellRenderer(centerRenderer);

        jTable1.getSelectionModel().addListSelectionListener(evt -> {
            addToCartButton.setEnabled(jTable1.getSelectedRow() != -1);
        });
        jTable1.setFillsViewportHeight(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        addToCartButton.setText("Add");
        addToCartButton.setEnabled(false);
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToCartButton))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("NIAGA SELLER");

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/Logout_16px.png"))); // NOI18N
        logoutButton.setPreferredSize(new java.awt.Dimension(76, 27));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        manageUserButton.setText("Manage User");
        manageUserButton.setPreferredSize(new java.awt.Dimension(76, 27));
        manageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserButtonActionPerformed(evt);
            }
        });

        manageProductButton.setText("Manage Product");
        manageProductButton.setPreferredSize(new java.awt.Dimension(76, 27));
        manageProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductButtonActionPerformed(evt);
            }
        });

        reportButton.setText("Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(121, 121, 121)
                .addComponent(manageProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cart"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer centerHeaderRenderer2 = (DefaultTableCellRenderer) jTable2.getTableHeader().getDefaultRenderer();
        centerHeaderRenderer2.setHorizontalAlignment(JLabel.CENTER);

        TableColumnModel table2Column = jTable2.getColumnModel();

        TableColumn index2Column = table2Column.getColumn(0);
        index2Column.setPreferredWidth(30);
        index2Column.setCellRenderer(centerRenderer);
        jTable2.setFillsViewportHeight(true);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
        }
        jTable2.getModel().addTableModelListener(evt -> {
            Long total = 0L;
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                total += (Long) jTable2.getValueAt(i, 3);
            }
            totalPriceText.setText("Rp " + numberFormat.format(total));
            purchaseButton.setEnabled(jTable2.getRowCount() > 0);
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Grand Total :");

        totalPriceText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalPriceText.setText("Rp 0");

        purchaseButton.setText("Check Out");
        purchaseButton.setEnabled(false);
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPriceText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(purchaseButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalPriceText))
                .addGap(16, 16, 16)
                .addComponent(purchaseButton)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        try {
            final AuthController authController = App.getInstance().getAuthController();
            authController.logout();
        } catch (InstanceNotFoundException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, ex.getMessage());
            JOptionPane.showMessageDialog(this, new JLabel(ex.getMessage()), "Logout Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void manageUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserButtonActionPerformed
        new ManageUsersDialog(this).setVisible(true);
    }//GEN-LAST:event_manageUserButtonActionPerformed

    private void manageProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductButtonActionPerformed
        dispose();
        new ProductInventoryPage().setVisible(true);
    }//GEN-LAST:event_manageProductButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        CustomDocumentFilter numberFilter = new CustomDocumentFilter();
        JTextField input = new JTextField();
        PlainDocument docInput = (PlainDocument) input.getDocument();
        docInput.setDocumentFilter(numberFilter);

        String result = JOptionPane.showInputDialog(input, "How much items?", "Add Item", JOptionPane.QUESTION_MESSAGE);
        if (result != null) {
            Integer count = Integer.valueOf(result);
            if (count > 0) {
                Product product = controller.getProduct(jTable1.getModel(), jTable1.getSelectedRow());
                controller.addProductToCart(product.getId(), count, false);
                controller.loadCart(jTable2.getModel());
            }
        }
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        JTable table = (JTable) evt.getSource();
        int row = table.rowAtPoint(evt.getPoint());
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            CustomDocumentFilter numberFilter = new CustomDocumentFilter();
            JTextField input = new JTextField();
            PlainDocument docInput = (PlainDocument) input.getDocument();
            docInput.setDocumentFilter(numberFilter);

            String result = JOptionPane.showInputDialog(input, "How much items?", "Change Amount", JOptionPane.QUESTION_MESSAGE);
            if (result != null) {
                Integer count = Integer.valueOf(result);
                if (count > 0) {
                    Product product = controller.getSelectedProduct(row);
                    controller.addProductToCart(product.getId(), count, true);
                    controller.loadCart(table.getModel());
                }
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        JTable table = (JTable) evt.getSource();
        int row = table.getSelectedRow();
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && row != -1) {
            Product product = controller.getSelectedProduct(row);
            controller.removeProductFromCart(product.getId());
            controller.loadCart(table.getModel());
        }
    }//GEN-LAST:event_jTable2KeyPressed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        User user;
        try {
            user = App.getInstance().getAuthController().getCurrentUser().orElseThrow();
        } catch (InstanceNotFoundException | NoSuchElementException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Operation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String priceStr = totalPriceText.getText().substring(3);
        long price;
        try {
            price = numberFormat.parse(priceStr).longValue();
        } catch (ParseException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        Long cash = 0L;

        while (cash < price) {
            CheckOutDialog checkOut = new CheckOutDialog(this, priceStr);
            checkOut.setVisible(true);

            cash = Long.valueOf(checkOut.getValue().trim());
        }

        long change = cash - price;

        try {
            // Automatic print bill with jasper
            controller.createTransaction(user, price, cash, change);

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            String jrxmlPath = "src/pos/report/Struk.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlPath);

            //Param for title and description if need
            //Prepare parameters
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("reporttitle", "PT Supra Boga Lestari Tbk");
            parameters.put("keterangan", "Jl. Pesanggrahan No.2, RT.1/RW.7, Kembangan Sel., Kec. Kembangan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11610");
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parameters, new JRTableModelDataSource(model));
            JasperViewer.viewReport(print, false); // true == Exit on Close
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Operation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JLabel changeText = new JLabel("Change :");
        JLabel changeValueText = new JLabel("Rp " + numberFormat.format(change));

        changeText.setFont(new java.awt.Font("Segoe UI", 1, 18));
        changeValueText.setFont(changeText.getFont());

        JPanel panel = new JPanel();
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(changeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeValueText)
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(changeText)
                .addComponent(changeValueText)
        );

        String[] options = {"Re-Print", "Done"};
        int finishing = JOptionPane.showOptionDialog(
                this,
                panel,
                "Payment Successful",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                null
        );

        if (finishing == 0) {
            // Re-print bill with jasper
        }

        controller.clearCart(jTable2.getModel());
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String jrxmlPath = "src/pos/report/ReportBarang.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlPath);

            // Param for title and description if need
            // Prepare parameters
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("reporttitle", "PT Supra Boga Lestari Tbk");
            parameters.put("keterangan", "Jl. Pesanggrahan No.2, RT.1/RW.7, Kembangan Sel., Kec. Kembangan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11610");
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parameters, new JRTableModelDataSource(model));
            JasperViewer.viewReport(print, false); // true == Exit on Close

        } catch (JRException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_reportButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageProductButton;
    private javax.swing.JButton manageUserButton;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel totalPriceText;
    // End of variables declaration//GEN-END:variables
}
