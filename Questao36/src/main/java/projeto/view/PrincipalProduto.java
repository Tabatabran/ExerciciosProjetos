package projeto.view;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrincipalProduto extends javax.swing.JFrame {

    public PrincipalProduto() {
        initComponents();
        
//        JFrame PrincipalProduto = new JFrame();
//            PrincipalProduto.setSize(400, 300);
//            PrincipalProduto.setResizable(false);
//            PrincipalProduto.setVisible(true);
        
        ButtonGroup botao = new ButtonGroup();
            botao.add(jRBCadastrar);
            botao.add(jRBPesquisar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioButtom = new javax.swing.ButtonGroup();
        jPainelMenuPrincipal = new javax.swing.JPanel();
        jLabelMenuPrincipal = new javax.swing.JLabel();
        jRBCadastrar = new javax.swing.JRadioButton();
        jRBPesquisar = new javax.swing.JRadioButton();
        jBotaoSelecionarOpcao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenuPrincipal.setText("MENU PRINCIPAL");

        grupoRadioButtom.add(jRBCadastrar);
        jRBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRBCadastrar.setText("Cadastrar");

        grupoRadioButtom.add(jRBPesquisar);
        jRBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRBPesquisar.setText("Pesquisar");

        jBotaoSelecionarOpcao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBotaoSelecionarOpcao.setText("Selecionar");
        jBotaoSelecionarOpcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSelecionarOpcaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelMenuPrincipalLayout = new javax.swing.GroupLayout(jPainelMenuPrincipal);
        jPainelMenuPrincipal.setLayout(jPainelMenuPrincipalLayout);
        jPainelMenuPrincipalLayout.setHorizontalGroup(
            jPainelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addGroup(jPainelMenuPrincipalLayout.createSequentialGroup()
                        .addGroup(jPainelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBCadastrar)
                            .addComponent(jRBPesquisar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPainelMenuPrincipalLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jBotaoSelecionarOpcao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelMenuPrincipalLayout.setVerticalGroup(
            jPainelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMenuPrincipal)
                .addGap(18, 18, 18)
                .addComponent(jRBCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jBotaoSelecionarOpcao)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoSelecionarOpcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSelecionarOpcaoActionPerformed
        
        if (jRBCadastrar.isSelected()){
            new CadastrarProduto().setVisible(true);
            dispose();           
        } else if (jRBPesquisar.isSelected()){
            new PesquisarProduto().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null,"Selecione UMA opção");
        }
    }//GEN-LAST:event_jBotaoSelecionarOpcaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoRadioButtom;
    private javax.swing.JButton jBotaoSelecionarOpcao;
    private javax.swing.JLabel jLabelMenuPrincipal;
    private javax.swing.JPanel jPainelMenuPrincipal;
    private javax.swing.JRadioButton jRBCadastrar;
    private javax.swing.JRadioButton jRBPesquisar;
    // End of variables declaration//GEN-END:variables

}
