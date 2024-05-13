/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.view.dialogs;

import java.util.NoSuchElementException;
import java.util.Objects;
import javax.swing.JOptionPane;
import pos.App;
import pos.controller.ManageUsersController;
import pos.exception.InstanceNotFoundException;
import pos.model.User;

/**
 *
 * @author rulfa
 */
public class UserDetailDialog extends javax.swing.JDialog {

    private final ManageUsersController controller;

    /**
     * Creates new form UserDetailDialog
     *
     * @param owner Usually JFrame
     * @param controller to communicate with database, this must not be null
     * @param userId to get full data of user if provided, otherwise will
     * indicate as create new user
     */
    public UserDetailDialog(java.awt.Frame owner, ManageUsersController controller, Long userId) {
        super(owner, true);
        this.controller = Objects.requireNonNull(controller);
        controller.selectUser(userId);
        initComponents();
        postInitComponents();
    }

    /**
     * Creates new form UserDetailDialog
     *
     * @param owner Usually JDialog
     * @param controller to communicate with database, this must not be null
     * @param userId to get full data of user if provided, otherwise will
     * indicate as create new user
     */
    public UserDetailDialog(java.awt.Dialog owner, ManageUsersController controller, Long userId) {
        super(owner, true);
        this.controller = Objects.requireNonNull(controller);
        controller.selectUser(userId);
        initComponents();
        postInitComponents();
    }

    @Override
    public void dispose() {
        // Unselect user from controller
        controller.selectUser(null);
        super.dispose(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        roleDropdown = new javax.swing.JComboBox<>();
        positiveButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        updatedAtText = new javax.swing.JLabel();
        createdAtText = new javax.swing.JLabel();
        negativeButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        idText = new javax.swing.JLabel();
        updatePasswordCheckBox = new javax.swing.JCheckBox();
        statusCheckBox = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(controller.getUserId(null) != null ? "Edit User Data" : "Create New User");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("USER DETAIL");

        jLabel2.setText("ID");

        jLabel3.setText("First Name");

        firstNameTextField.setText(controller.getUserFirstName(null));
        firstNameTextField.setMaximumSize(new java.awt.Dimension(160, 2147483647));
        firstNameTextField.setMinimumSize(new java.awt.Dimension(160, 22));

        jLabel4.setText("Role");

        roleDropdown.setModel(new javax.swing.DefaultComboBoxModel(controller.getRolesName()));
        roleDropdown.setMaximumSize(new java.awt.Dimension(160, 32767));
        roleDropdown.setMinimumSize(new java.awt.Dimension(160, 22));
        roleDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleDropdownActionPerformed(evt);
            }
        });

        positiveButton.setText("Save");
        positiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positiveButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Last Update");

        jLabel8.setText("Created");

        updatedAtText.setText(": May 3, 2024 18:10");

        createdAtText.setText(": May 3, 2024 18:10");

        negativeButton.setText("Delete");
        negativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Last Name");

        lastNameTextField.setText(controller.getUserLastName(null));
        lastNameTextField.setMaximumSize(new java.awt.Dimension(160, 2147483647));
        lastNameTextField.setMinimumSize(new java.awt.Dimension(160, 22));

        jLabel12.setText("Username");

        usernameTextField.setFont(new java.awt.Font("Segoe UI", controller.getUserUsername(null) != null ? 2 : 0, 12));
        usernameTextField.setText(controller.getUserUsername(null) != null ? "This is hidden for security reason" : null);
        usernameTextField.setEnabled(controller.getUserUsername(null) == null);
        usernameTextField.setMaximumSize(new java.awt.Dimension(160, 2147483647));
        usernameTextField.setMinimumSize(new java.awt.Dimension(160, 22));

        jLabel13.setText("Password");

        passwordField.setMaximumSize(new java.awt.Dimension(160, 2147483647));

        jLabel14.setText("Re-enter Password");

        confirmPasswordField.setMaximumSize(new java.awt.Dimension(160, 2147483647));
        confirmPasswordField.setMinimumSize(new java.awt.Dimension(160, 22));

        idText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idText.setText(controller.getUserId("<Auto-generated>"));

        updatePasswordCheckBox.setToolTipText("Update password?");
        updatePasswordCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        updatePasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePasswordCheckBoxActionPerformed(evt);
            }
        });

        statusCheckBox.setSelected(controller.getUserIsActive(true));
        statusCheckBox.setText("Active");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updatedAtText)
                                    .addComponent(createdAtText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(negativeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(positiveButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(roleDropdown, 0, 180, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(updatePasswordCheckBox)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(statusCheckBox))))
                        .addGap(64, 64, 64))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel7, jLabel8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText)
                    .addComponent(statusCheckBox))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(updatedAtText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(createdAtText))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(positiveButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(negativeButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(updatePasswordCheckBox))
                .addGap(64, 64, 64))
        );

        getAccessibleContext().setAccessibleName(controller.getUserId(null) != null ? "Edit User Data" : "Create New User");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatePasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePasswordCheckBoxActionPerformed
        passwordField.setEnabled(updatePasswordCheckBox.isSelected());
        passwordField.setText(updatePasswordCheckBox.isSelected() ? null : "password");
        jLabel14.setVisible(updatePasswordCheckBox.isSelected());
        confirmPasswordField.setVisible(updatePasswordCheckBox.isSelected());
        confirmPasswordField.setText(null);
    }//GEN-LAST:event_updatePasswordCheckBoxActionPerformed

    private void negativeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeButtonActionPerformed
        if (controller.getUserId(null) == null) {
            dispose();
            return;
        }

        User user;
        try {
            user = App.getInstance().getAuthController().getCurrentUser().orElseThrow();
        } catch (InstanceNotFoundException | NoSuchElementException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Deleting Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (Objects.equals(user.getId(), Long.valueOf(controller.getUserId(null)))) {
            dispose();
            return;
        }

        int result = JOptionPane.showConfirmDialog(this, "Are you sure to delete this user? This cannot be undone", "Deleting User", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == 2) {
            return;
        }

        controller.deleteUser(user);

        dispose();
    }//GEN-LAST:event_negativeButtonActionPerformed

    private void positiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positiveButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure to save the data?", "Save User", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == 2) {
            return;
        }

        int roleIndex = roleDropdown.getSelectedIndex();
        if (roleIndex == -1) {
            JOptionPane.showMessageDialog(this, "Role must be selected", "Saving Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String password = passwordField.getText();
        if (updatePasswordCheckBox.isSelected() || controller.getUserId(null) == null) {
            String confirmPassword = confirmPasswordField.getText();
            if (password.isBlank()) {
                JOptionPane.showMessageDialog(this, "Password cannot be empty", "Saving Failed", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Password confirm is not match", "Saving Failed", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        User user;
        try {
            user = App.getInstance().getAuthController().getCurrentUser().orElseThrow();
        } catch (InstanceNotFoundException | NoSuchElementException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Saving Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String username = usernameTextField.getText();
        boolean isActive = statusCheckBox.isSelected();

        try {
            if (firstName.isBlank() || lastName.isBlank() || username.isBlank()) {
                throw new Exception("First Name, Last Name, and Username must be filled");
            }

            controller.saveUser(
                    firstName,
                    lastName,
                    roleIndex,
                    username,
                    password,
                    isActive,
                    user,
                    updatePasswordCheckBox.isSelected()
            );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Saving Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "User data saved successfully!", "Saving Success", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_positiveButtonActionPerformed

    private void roleDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleDropdownActionPerformed

    private void postInitComponents() {
        roleDropdown.setSelectedIndex(controller.getUserRoleIndex(null));

        boolean isEditing = controller.getUserId(null) != null;

        updatePasswordCheckBox.setVisible(isEditing);
        passwordField.setEnabled(isEditing ? updatePasswordCheckBox.isSelected() : true);
        passwordField.setText(isEditing && !updatePasswordCheckBox.isSelected() ? "password" : null);
        jLabel14.setVisible(isEditing ? updatePasswordCheckBox.isSelected() : true);
        confirmPasswordField.setVisible(isEditing ? updatePasswordCheckBox.isSelected() : true);

        if (isEditing) {
            updatedAtText.setText(": " + controller.getUserUpdatedAt(null));
            createdAtText.setText(": " + controller.getUserCreatedAt(null));

            negativeButton.setText("Delete");

            User user;
            try {
                user = App.getInstance().getAuthController().getCurrentUser().orElseThrow();
            } catch (InstanceNotFoundException | NoSuchElementException ex) {
                return;
            }

            if (Objects.equals(user.getId(), Long.valueOf(controller.getUserId(null)))) {
                roleDropdown.setEnabled(false);
                statusCheckBox.setEnabled(false);
                negativeButton.setText("Cancel");
            }
        } else {
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            updatedAtText.setVisible(false);
            createdAtText.setVisible(false);

            negativeButton.setText("Cancel");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel createdAtText;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton negativeButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton positiveButton;
    private javax.swing.JComboBox<String> roleDropdown;
    private javax.swing.JCheckBox statusCheckBox;
    private javax.swing.JCheckBox updatePasswordCheckBox;
    private javax.swing.JLabel updatedAtText;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
