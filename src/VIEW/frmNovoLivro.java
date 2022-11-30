/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.LivroDAO;
import DTO.LivroDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class frmNovoLivro extends javax.swing.JFrame {

    /**
     * Creates new form frmNovoLivro
     */
    public frmNovoLivro() {
        initComponents();
        listarLivros();
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
        txtTituloLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGeneroLivro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivro = new javax.swing.JTable();
        btnCadastrarLivro = new javax.swing.JButton();
        btnExcluirLivro = new javax.swing.JButton();
        txtIDLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCarregarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titulo do Livro");

        txtTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLivroActionPerformed(evt);
            }
        });

        jLabel2.setText("Genero do Livro");

        txtGeneroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroLivroActionPerformed(evt);
            }
        });

        tabelaLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Livro", "Título", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaLivro);
        if (tabelaLivro.getColumnModel().getColumnCount() > 0) {
            tabelaLivro.getColumnModel().getColumn(0).setResizable(false);
            tabelaLivro.getColumnModel().getColumn(1).setResizable(false);
            tabelaLivro.getColumnModel().getColumn(2).setResizable(false);
        }

        btnCadastrarLivro.setText("Cadastrar Livro");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        btnExcluirLivro.setText("Excluir Livro");
        btnExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivroActionPerformed(evt);
            }
        });

        txtIDLivro.setEnabled(false);
        txtIDLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDLivroActionPerformed(evt);
            }
        });

        jLabel3.setText("ID ");

        btnCarregarCampos.setText("Carragar Campos");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnExcluirLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(27, 27, 27))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCadastrarLivro)
                                        .addComponent(btnCarregarCampos))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(txtGeneroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGeneroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnCadastrarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCarregarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeneroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroLivroActionPerformed

    private void txtTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLivroActionPerformed

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        cadastrarLivros();
         listarLivros();
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void btnExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivroActionPerformed
        // TODO add your handling code here:
        excluirLivros();
        CarregarCampos();
        listarLivros();
    }//GEN-LAST:event_btnExcluirLivroActionPerformed

    private void txtIDLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDLivroActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        CarregarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

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
            java.util.logging.Logger.getLogger(frmNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNovoLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluirLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaLivro;
    private javax.swing.JTextField txtGeneroLivro;
    private javax.swing.JTextField txtIDLivro;
    private javax.swing.JTextField txtTituloLivro;
    // End of variables declaration//GEN-END:variables
private void cadastrarLivros(){
    //
    String titulo_livro,genero_livro;
    
    titulo_livro = txtTituloLivro.getText();
    genero_livro = txtGeneroLivro.getText();
    
    LivroDTO objlivrodto = new LivroDTO();
    objlivrodto.settitulo_livro(titulo_livro);
    objlivrodto.setgenero_livro(genero_livro);
    
    LivroDAO objlivrodao = new LivroDAO();
    objlivrodao.cadastrarLivro(objlivrodto);
}

private void excluirLivros(){
    
    int id_livro = Integer.parseInt(txtIDLivro.getText());
    
    LivroDTO objlivrodto = new LivroDTO();
    objlivrodto.setId_livro(id_livro); 
    
    LivroDAO objfuncionariodao = new LivroDAO();
    objfuncionariodao.excluirLivro(objlivrodto);    
    
}

private void CarregarCampos(){
    
   int setar = tabelaLivro.getSelectedRow();
   
   txtIDLivro.setText(tabelaLivro.getModel().getValueAt(setar, 0).toString());
   txtGeneroLivro.setText(tabelaLivro.getModel().getValueAt(setar,1).toString());
   txtTituloLivro.setText(tabelaLivro.getModel().getValueAt(setar,2).toString());
    
}

private void listarLivros(){
    try {
        LivroDAO objlivrodao = new LivroDAO();
        
        DefaultTableModel model = (DefaultTableModel) tabelaLivro.getModel();
        model.setNumRows(0);
        
        ArrayList<LivroDTO>lista = objlivrodao.CarregararCampos();
        
        
        for(int num=0;num<lista.size();num++){
            model.addRow(new Object[]{
                lista.get(num).getId_livro(),
                lista.get(num).gettitulo_livro(),
                lista.get(num).getgenero_livro(),
            
            });
        }
    } catch (Exception e) {
    }
}
}
