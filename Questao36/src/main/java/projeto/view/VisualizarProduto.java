package projeto.view;

public class VisualizarProduto extends javax.swing.JFrame {

    public VisualizarProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelVisualizarProduto = new javax.swing.JPanel();
        jLabelVisualizarProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaVisualizarProduto = new javax.swing.JTable();
        jBotaoEditar = new javax.swing.JButton();
        jBotaoExcluir = new javax.swing.JButton();
        jBotaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelVisualizarProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelVisualizarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVisualizarProduto.setText("LISTAR PRODUTO(S)");

        jTabelaVisualizarProduto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabelaVisualizarProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabelaVisualizarProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço de Custo", "Preço de Venda", "Preço com Desconto", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(jTabelaVisualizarProduto);

        jBotaoEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBotaoEditar.setText("Editar");
        jBotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoEditarActionPerformed(evt);
            }
        });

        jBotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBotaoExcluir.setText("Excluir");
        jBotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoExcluirActionPerformed(evt);
            }
        });

        jBotaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBotaoCancelar.setText("Cancelar");
        jBotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelVisualizarProdutoLayout = new javax.swing.GroupLayout(jPainelVisualizarProduto);
        jPainelVisualizarProduto.setLayout(jPainelVisualizarProdutoLayout);
        jPainelVisualizarProdutoLayout.setHorizontalGroup(
            jPainelVisualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelVisualizarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelVisualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVisualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelVisualizarProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBotaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBotaoEditar)))
                .addContainerGap())
        );
        jPainelVisualizarProdutoLayout.setVerticalGroup(
            jPainelVisualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelVisualizarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVisualizarProduto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPainelVisualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoEditar)
                    .addComponent(jBotaoExcluir)
                    .addComponent(jBotaoCancelar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelVisualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelVisualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluirActionPerformed
        
    }//GEN-LAST:event_jBotaoExcluirActionPerformed

    private void jBotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoCancelarActionPerformed
        new VisualizarProduto().setVisible(false);
        dispose();
    }//GEN-LAST:event_jBotaoCancelarActionPerformed

    private void jBotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoEditarActionPerformed
        new EditarProduto().setVisible(true);
            dispose();
    }//GEN-LAST:event_jBotaoEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoCancelar;
    private javax.swing.JButton jBotaoEditar;
    private javax.swing.JButton jBotaoExcluir;
    private javax.swing.JLabel jLabelVisualizarProduto;
    private javax.swing.JPanel jPainelVisualizarProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaVisualizarProduto;
    // End of variables declaration//GEN-END:variables
}
