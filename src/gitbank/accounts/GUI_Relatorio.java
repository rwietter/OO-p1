/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitbank.accounts;

import gitbank.ClientRegistration;
import gitbank.DataBase;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rwietter
 */
public class GUI_Relatorio extends javax.swing.JDialog {

    private ClientRegistration client;
    private ContaComum conta;
    private DataBase database;

    private String nome;

    public GUI_Relatorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public GUI_Relatorio(ClientRegistration client, ContaComum conta, DataBase dB) {
        this.client = client;
        this.conta = conta;
        this.database = dB;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_cliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_contas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jT_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jT_cliente);

        jLabel1.setText("Cliente");

        jT_contas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jT_contas);

        jLabel2.setText("Contas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println(this.nome);
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            
        ArrayList<ClientRegistration> clientes = this.database.getClient();

        String[] colunas = {
            "Nome",
            "CPF",
            "Endereço",
            "Telefone",
            "Renda",
            "Situacao",};

        String[][] linhas = new String[clientes.size()][6];

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equals(this.nome)) {
                linhas[i][0] = clientes.get(i).getNome();
                linhas[i][1] = clientes.get(i).getCpf();
                linhas[i][2] = clientes.get(i).getEndereco();
                linhas[i][3] = clientes.get(i).getTelefone();
                linhas[i][4] = Float.toString(clientes.get(i).getRenda());
                linhas[i][5] = Boolean.toString(clientes.get(i).getSituacao());
            }
        }

        DefaultTableModel table = new DefaultTableModel(linhas, colunas);

        this.jT_cliente.setModel(table);
        
        /* -------------------------- Contas ---------------------------- */
        
        ArrayList<ContaComum> contas = this.client.getContas();

        String[] nomeColunas = {
            "Nome",
            "Número",
            "Saldo",
            "Data de Abertura",
            "Tipo de Conta",
            "Situacao",};

        String[][] valoresLinhas = new String[contas.size()][6];

        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNome().equals(this.nome)) {
                valoresLinhas[i][0] = contas.get(i).getNome();
                valoresLinhas[i][1] = contas.get(i).getNumeroConta().toString();
                valoresLinhas[i][2] = Double.toString(contas.get(i).getSaldo());
                valoresLinhas[i][3] = contas.get(i).getDataAbertura().toString();
                valoresLinhas[i][4] = Integer.toString(contas.get(i).getTipoConta());
                valoresLinhas[i][5] = Integer.toString(contas.get(i).getSituacao());
            }
        }

        DefaultTableModel tableModel = new DefaultTableModel(valoresLinhas, nomeColunas);

        this.jT_contas.setModel(tableModel);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(GUI_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI_Relatorio dialog = new GUI_Relatorio(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jT_cliente;
    private javax.swing.JTable jT_contas;
    // End of variables declaration//GEN-END:variables
}
