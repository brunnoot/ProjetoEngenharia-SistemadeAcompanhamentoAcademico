/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.operacaoBD;
import projetoengenharia.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno
 */
public class TelaControleSalas extends javax.swing.JFrame {

    /**
     * Creates new form TelaControleSalas
     */
    public TelaControleSalas() {
        initComponents();
    }
    private int cod;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalas = new javax.swing.JButton();
        btnAlunos = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalas = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btnCadastrarSala = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSalas.setText("Salas");
        btnSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalasMousePressed(evt);
            }
        });

        btnAlunos.setText("Alunos");
        btnAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlunosMousePressed(evt);
            }
        });

        btnRelatorios.setText("Relatorios");
        btnRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRelatoriosMousePressed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSalasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSalas);

        btnCadastrarSala.setText("Cadastrar Sala");
        btnCadastrarSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarSalaMousePressed(evt);
            }
        });
        btnCadastrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarSalaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
        });

        jLabel1.setText("Busca pelo Nome das Salas:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarSala)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarSala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        operacaoBD ob = new operacaoBD();

        try {
            Connection conexao = ob.obterConexao();
            PreparedStatement pre = null;
            ResultSet rs;

            String sql = "select usuariocod from telaindividual";
            pre = conexao.prepareStatement(sql);
            rs = pre.executeQuery();
            if (rs.next()) {
                int id_usuario = rs.getInt("usuariocod");
                pre.executeQuery();
                pre = conexao.prepareStatement("Select * from salas where id_usuario = ? and visible = 1 order by id_Sala");
                pre.setInt(1, id_usuario);
                rs = pre.executeQuery();
                
                String i = Integer.toString(id_usuario);
                
                
                String[] colunasTabela = new String[]{
                    "Cod da Sala", "Nome da Sala", "Materia", "Instituicao"
                };
                DefaultTableModel modelo;
                modelo = new DefaultTableModel(null, colunasTabela) {
                    public boolean isCellEditable(int row, int col) {
                        return false;
                    }

                    public boolean isCellSelected(int row, int col) {
                        return true;
                    }
                };
                tblSalas.setModel(modelo);
                //while para mostrar os dados dobanco de dados
                while (rs.next()) {

                    String dados[] = new String[4];
                    dados[0] = rs.getString("id_sala");
                    dados[1] = rs.getString("nomesala");
                    dados[2] = rs.getString("materia");
                    dados[3] = rs.getString("instituicao");
                    modelo.addRow(dados);
                }

                tblSalas.setModel(modelo);
            }
        } 
        catch (Exception e) {
            System.out.println("erro no mostrar as salas cadastradas" + e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnCadastrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarSalaActionPerformed

    private void btnCadastrarSalaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarSalaMousePressed
        new TelaCadastroSala().setVisible(true);
    }//GEN-LAST:event_btnCadastrarSalaMousePressed

    private void tblSalasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalasMousePressed
        operacaoBD ob = new operacaoBD();
        int selecionada = tblSalas.getSelectedRow();
        if (selecionada == -1) {
            return; //Não tem nada selecionado
        }

        String codd = tblSalas.getValueAt(selecionada, 1).toString();
        cod = Integer.parseInt(codd);
        this.setCod(cod);
        ob.GuardarCodSala(cod);

        new TelaControleSalaIndividual().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tblSalasMousePressed

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
        operacaoBD ob = new operacaoBD();
        try {

            PreparedStatement st;
            ResultSet rs = null;
            String nome = txtPesquisa.getText();

            Connection conexao = ob.obterConexao();
            //st = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //ResultSet.TYPE_SCROLL_SENSITIVE possibilita o acesso
            //ResultSet.CONCUR_UPDATABLE possibilita a edição

            st = conexao.prepareStatement("Select * from salas where nomeSala like ? and visible = 0");
            st.setString(1, '%' + nome + '%');
            rs = st.executeQuery();

            System.out.println("\n Salas buscados");

            String[] colunasTabela = new String[]{
                "Cod da Sala", "Nome da Sala", "Materia", "Instituicao"
            };
            DefaultTableModel modelo;
            modelo = new DefaultTableModel(null, colunasTabela) {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }

                public boolean isCellSelected(int row, int col) {
                    return true;
                }
            };
            tblSalas.setModel(modelo);
            //while para mostrar os dados dobanco de dados
            while (rs.next()) {

                String dados[] = new String[4];
                dados[0] = rs.getString("id_Sala");
                dados[1] = rs.getString("nomesala");
                dados[2] = rs.getString("materia");
                dados[3] = rs.getString("instituicao");
                modelo.addRow(dados);
            }

            tblSalas.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarMousePressed

    private void btnSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMousePressed
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairMousePressed

    private void btnRelatoriosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMousePressed
        new TelaRelatorios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelatoriosMousePressed

    private void btnAlunosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlunosMousePressed
        new TelaControleAlunos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAlunosMousePressed

    private void btnSalasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalasMousePressed
        new TelaControleSalas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalasMousePressed

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
            java.util.logging.Logger.getLogger(TelaControleSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaControleSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaControleSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaControleSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaControleSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrarSala;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalas;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
