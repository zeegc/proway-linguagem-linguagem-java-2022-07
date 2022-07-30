/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.heranca.sobrescrita;

/**
 *
 * @author moc
 */
public class ContaJFrame extends javax.swing.JFrame {

    private ContaPoupanca contaPoupanca;
    private ContaCorrente contaCorrente;

    /**
     * Creates new form ContaJFrame
     */
    public ContaJFrame() {
        initComponents();

        contaPoupanca = new ContaPoupanca();
        contaCorrente = new ContaCorrente();
        contaCorrente.setValorChequeEspecial(400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelContaPoupanca = new javax.swing.JLabel();
        jLabelContaCorrente = new javax.swing.JLabel();
        jButtonContaPoupancaDepositar = new javax.swing.JButton();
        jTextFieldContaPoupancaValorDeposito = new javax.swing.JTextField();
        jLabelContaPoupancaValorDeposito = new javax.swing.JLabel();
        jLabelContaPoupancaValorSaque = new javax.swing.JLabel();
        jTextFieldContaPoupancaValorSaque = new javax.swing.JTextField();
        jButtonContaPoupancaSaque = new javax.swing.JButton();
        jLabelContaPoupancaExtrato = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaContaPoupancaExtrato = new javax.swing.JTextArea();
        jLabelContaCorrenteValorDeposito = new javax.swing.JLabel();
        jTextFieldContaCorrenteValorDeposito = new javax.swing.JTextField();
        jButtonContaCorrenteDepositar = new javax.swing.JButton();
        jButtonContaCorrenteSaque = new javax.swing.JButton();
        jTextFieldContaCorrenteValorSaque = new javax.swing.JTextField();
        jLabelContaCorrenteValorSaque = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaContaCorrenteExtrato = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelContaPoupanca.setText("Conta Poupança");

        jLabelContaCorrente.setText("Conta Corrente");

        jButtonContaPoupancaDepositar.setText("Depositar");
        jButtonContaPoupancaDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContaPoupancaDepositarActionPerformed(evt);
            }
        });

        jLabelContaPoupancaValorDeposito.setText("Valor");

        jLabelContaPoupancaValorSaque.setText("Valor");

        jButtonContaPoupancaSaque.setText("Saque");
        jButtonContaPoupancaSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContaPoupancaSaqueActionPerformed(evt);
            }
        });

        jLabelContaPoupancaExtrato.setText("Extrato");

        jTextAreaContaPoupancaExtrato.setColumns(20);
        jTextAreaContaPoupancaExtrato.setRows(5);
        jScrollPane1.setViewportView(jTextAreaContaPoupancaExtrato);

        jLabelContaCorrenteValorDeposito.setText("Valor");

        jButtonContaCorrenteDepositar.setText("Depositar");
        jButtonContaCorrenteDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContaCorrenteDepositarActionPerformed(evt);
            }
        });

        jButtonContaCorrenteSaque.setText("Saque");
        jButtonContaCorrenteSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContaCorrenteSaqueActionPerformed(evt);
            }
        });

        jLabelContaCorrenteValorSaque.setText("Valor");

        jTextAreaContaCorrenteExtrato.setColumns(20);
        jTextAreaContaCorrenteExtrato.setRows(5);
        jScrollPane2.setViewportView(jTextAreaContaCorrenteExtrato);

        jLabel8.setText("Extrato");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelContaPoupanca))
                    .addComponent(jLabelContaPoupancaValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContaPoupancaValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonContaPoupancaDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelContaPoupancaValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContaPoupancaValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonContaPoupancaSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelContaPoupancaExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabelContaCorrente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelContaCorrenteValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldContaCorrenteValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonContaCorrenteDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabelContaCorrenteValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldContaCorrenteValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButtonContaCorrenteSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 197, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelContaPoupanca)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelContaPoupancaValorDeposito)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldContaPoupancaValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonContaPoupancaDepositar))
                        .addGap(11, 11, 11)
                        .addComponent(jLabelContaPoupancaValorSaque)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldContaPoupancaValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonContaPoupancaSaque))
                        .addGap(11, 11, 11)
                        .addComponent(jLabelContaPoupancaExtrato)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelContaCorrente)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelContaCorrenteValorDeposito)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldContaCorrenteValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonContaCorrenteDepositar))
                        .addGap(11, 11, 11)
                        .addComponent(jLabelContaCorrenteValorSaque)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldContaCorrenteValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonContaCorrenteSaque))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContaCorrenteDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContaCorrenteDepositarActionPerformed
        double valor = Double.parseDouble(
                jTextFieldContaCorrenteValorDeposito.getText());

        contaCorrente.deposito(valor);

        double novoSaldo = contaCorrente.getSaldo();
        String texto = "Depósito de R$" + valor + " novo saldo: R$" + novoSaldo + "\n";

        jTextAreaContaCorrenteExtrato.append(texto);

        jTextFieldContaCorrenteValorDeposito.setText("");
    }//GEN-LAST:event_jButtonContaCorrenteDepositarActionPerformed

    private void jButtonContaPoupancaDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContaPoupancaDepositarActionPerformed
        double valor = Double.parseDouble(
                jTextFieldContaPoupancaValorDeposito.getText());

        contaPoupanca.deposito(valor);

        // Gerar log(extrato)
        double novoSaldo = contaPoupanca.getSaldo();
        String texto = "Depósito de R$" + valor + " novo saldo: R$" + 
                novoSaldo + "\n";

        jTextAreaContaPoupancaExtrato.append(texto);

        jTextFieldContaPoupancaValorDeposito.setText("");
    }//GEN-LAST:event_jButtonContaPoupancaDepositarActionPerformed

    private void jButtonContaPoupancaSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContaPoupancaSaqueActionPerformed
        double valor = Double.parseDouble(jTextFieldContaPoupancaValorSaque
                .getText());

        boolean saqueRealizado = contaPoupanca.sacar(valor);

        if (saqueRealizado == false) {
            jTextAreaContaPoupancaExtrato.append(
                    "Saque no valor " + valor
                    + " não realizado pois o saldo atual é: "
                    + contaPoupanca.getSaldo() + "\n");

            // Encerra a execução deste método
            return;
        }

        jTextAreaContaPoupancaExtrato.append(
                "Saque no valor " + valor
                + " realizado com sucesso, saldo atual é: "
                + contaPoupanca.getSaldo() + "\n");

        jTextFieldContaPoupancaValorSaque.setText("");
    }//GEN-LAST:event_jButtonContaPoupancaSaqueActionPerformed

    private void jButtonContaCorrenteSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContaCorrenteSaqueActionPerformed
        double valor = Double.parseDouble(jTextFieldContaCorrenteValorSaque
                .getText());

        boolean saqueRealizado = contaCorrente.sacar(valor);

        if (saqueRealizado == false) {
            jTextAreaContaCorrenteExtrato.append(
                    "Saque no valor " + valor
                    + " não realizado pois o saldo atual é: "
                    + contaCorrente.getSaldo() + "\n");

            // Encerra a execução deste método
            return;
        }

        jTextAreaContaCorrenteExtrato.append(
                "Saque no valor " + valor
                + " realizado com sucesso, saldo atual é: "
                + contaCorrente.getSaldo() + "\n");

        jTextFieldContaCorrenteValorSaque.setText("");
    }//GEN-LAST:event_jButtonContaCorrenteSaqueActionPerformed

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
            java.util.logging.Logger.getLogger(ContaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContaCorrenteDepositar;
    private javax.swing.JButton jButtonContaCorrenteSaque;
    private javax.swing.JButton jButtonContaPoupancaDepositar;
    private javax.swing.JButton jButtonContaPoupancaSaque;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelContaCorrente;
    private javax.swing.JLabel jLabelContaCorrenteValorDeposito;
    private javax.swing.JLabel jLabelContaCorrenteValorSaque;
    private javax.swing.JLabel jLabelContaPoupanca;
    private javax.swing.JLabel jLabelContaPoupancaExtrato;
    private javax.swing.JLabel jLabelContaPoupancaValorDeposito;
    private javax.swing.JLabel jLabelContaPoupancaValorSaque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaContaCorrenteExtrato;
    private javax.swing.JTextArea jTextAreaContaPoupancaExtrato;
    private javax.swing.JTextField jTextFieldContaCorrenteValorDeposito;
    private javax.swing.JTextField jTextFieldContaCorrenteValorSaque;
    private javax.swing.JTextField jTextFieldContaPoupancaValorDeposito;
    private javax.swing.JTextField jTextFieldContaPoupancaValorSaque;
    // End of variables declaration//GEN-END:variables
}
