package projeto.view;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import projeto.model.Produto;
import projeto.presenter.CadastrarProdutoPresenter;
import projeto.presenter.IPresenter;

public class CadastrarProduto extends javax.swing.JFrame {
    public IPresenter presenter;
    
    public CadastrarProduto() {
        initComponents();  
        this.presenter = new CadastrarProdutoPresenter();
        
    }  

    public JButton getBtCancelarCadastro() {
        return BtCancelarCadastro;
    }

    public JButton getBtSalvarCadastro() {
        return BtSalvarCadastro;
    }

    public JComboBox<String> getjComboBoxTipoProduto() {
        return jComboBoxTipoProduto;
    }

    public JTextField getjTFNomeProduto() {
        return jTFNomeProduto;
    }

    public JTextField getjTFPrecoCustoProduto() {
        return jTFPrecoCustoProduto;
    }

    public JTextField getjTFQtdMinimaProduto() {
        return jTFQtdMinimaProduto;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCadastrarProduto = new javax.swing.JLabel();
        jTFQtdMinimaProduto = new javax.swing.JTextField();
        jLabelPrecoCusto = new javax.swing.JLabel();
        jTFPrecoCustoProduto = new javax.swing.JTextField();
        BtSalvarCadastro = new javax.swing.JButton();
        BtCancelarCadastro = new javax.swing.JButton();
        jLabelNomeProduto = new javax.swing.JLabel();
        jLabelTipoProduto = new javax.swing.JLabel();
        jComboBoxTipoProduto = new javax.swing.JComboBox<>();
        jLabelQuantidadeMinima = new javax.swing.JLabel();
        jTFNomeProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frameCadastrarProduto");

        jLabelCadastrarProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadastrarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastrarProduto.setText("CADASTRAR PRODUTO(S)");

        jTFQtdMinimaProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelPrecoCusto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPrecoCusto.setText("Preço de Custo:");

        jTFPrecoCustoProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BtSalvarCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtSalvarCadastro.setText("Salvar");

        BtCancelarCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtCancelarCadastro.setText("Cancelar");

        jLabelNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomeProduto.setText("Nome do Produto:");

        jLabelTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTipoProduto.setText("Tipo:");

        jComboBoxTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acessórios automotivos", "Cama, mesa e banho", "Eletrônicos", "Limpeza" }));

        jLabelQuantidadeMinima.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelQuantidadeMinima.setText("Quantidade Mínima:");

        jTFNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtCancelarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtSalvarCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFQtdMinimaProduto))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelTipoProduto)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxTipoProduto, 0, 321, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPrecoCusto)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFPrecoCustoProduto)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNomeProduto)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelCadastrarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelCadastrarProduto)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoProduto)
                    .addComponent(jComboBoxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidadeMinima)
                    .addComponent(jTFQtdMinimaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFPrecoCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecoCusto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSalvarCadastro)
                    .addComponent(BtCancelarCadastro))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelarCadastro;
    private javax.swing.JButton BtSalvarCadastro;
    private javax.swing.JComboBox<String> jComboBoxTipoProduto;
    private javax.swing.JLabel jLabelCadastrarProduto;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelPrecoCusto;
    private javax.swing.JLabel jLabelQuantidadeMinima;
    private javax.swing.JLabel jLabelTipoProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFNomeProduto;
    private javax.swing.JTextField jTFPrecoCustoProduto;
    private javax.swing.JTextField jTFQtdMinimaProduto;
    // End of variables declaration//GEN-END:variables
}
