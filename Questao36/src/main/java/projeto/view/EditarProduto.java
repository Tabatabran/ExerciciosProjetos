package projeto.view;

public class EditarProduto extends javax.swing.JFrame {

    public EditarProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEditarProduto = new javax.swing.JLabel();
        jLabelNomeProduto = new javax.swing.JLabel();
        jTFNomeProduto = new javax.swing.JTextField();
        jComboBoxTipoProduto = new javax.swing.JComboBox<>();
        jLabelTipoProduto = new javax.swing.JLabel();
        jLabelQuantidadeMinima = new javax.swing.JLabel();
        jTFQtdMinimaProduto = new javax.swing.JTextField();
        jLabelPrecoCusto = new javax.swing.JLabel();
        jTFPrecoCustoProduto = new javax.swing.JTextField();
        BtCancelarEdicao = new javax.swing.JButton();
        BtSalvarEdicao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelEditarProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEditarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditarProduto.setText("EDITAR PRODUTO(S)");

        jLabelNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomeProduto.setText("Nome do Produto:");

        jTFNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBoxTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acessórios automotivos", "Cama, mesa e banho", "Eletrônicos", "Limpeza" }));

        jLabelTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTipoProduto.setText("Tipo:");

        jLabelQuantidadeMinima.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelQuantidadeMinima.setText("Quantidade Mínima:");

        jTFQtdMinimaProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelPrecoCusto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPrecoCusto.setText("Preço de Custo:");

        jTFPrecoCustoProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BtCancelarEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtCancelarEdicao.setText("Cancelar");
        BtCancelarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarEdicaoActionPerformed(evt);
            }
        });

        BtSalvarEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtSalvarEdicao.setText("Salvar");
        BtSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtCancelarEdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtSalvarEdicao))
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
                    .addComponent(jLabelEditarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelEditarProduto)
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
                    .addComponent(BtSalvarEdicao)
                    .addComponent(BtCancelarEdicao))
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

    private void BtSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarEdicaoActionPerformed
        
    }//GEN-LAST:event_BtSalvarEdicaoActionPerformed

    private void BtCancelarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarEdicaoActionPerformed
        new EditarProduto().setVisible(false);
        dispose();
    }//GEN-LAST:event_BtCancelarEdicaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelarEdicao;
    private javax.swing.JButton BtSalvarEdicao;
    private javax.swing.JComboBox<String> jComboBoxTipoProduto;
    private javax.swing.JLabel jLabelEditarProduto;
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
