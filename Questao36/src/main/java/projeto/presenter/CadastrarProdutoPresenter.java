/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.presenter;

import DAO.BancoDeDados;
import javax.swing.JOptionPane;
import projeto.model.Produto;
import projeto.view.CadastrarProduto;

/**
 *
 * @author tabat
 */
public class CadastrarProdutoPresenter implements IPresenter{

    private CadastrarProduto tela = new CadastrarProduto();
    
    public CadastrarProdutoPresenter() {
        configuraView();
    }
    
    @Override
    public void configuraView() {
        tela.getBtSalvarCadastro().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarCadastroActionPerformed();
            }
        });
        
        tela.getBtCancelarCadastro().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarCadastroActionPerformed();
            }
        });
    }
    
    public void BtSalvarCadastroActionPerformed(){
        try{
        Produto produto = new Produto();
        
        if (tela.getjTFNomeProduto().getText().isEmpty() || tela.getjTFPrecoCustoProduto().getText().isEmpty() || tela.getjTFQtdMinimaProduto().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Inválido!");
        } else{
            produto.setNomeProduto(tela.getjTFNomeProduto().getText());
            produto.setPrecoCustoProduto(Double.parseDouble(tela.getjTFPrecoCustoProduto().getText()));
            produto.setQtdMinima(Integer.parseInt(tela.getjTFQtdMinimaProduto().getText()));
        }
        produto.setTipoProduto(String.valueOf(tela.getjComboBoxTipoProduto().getSelectedIndex()));
        
        BancoDeDados banco = BancoDeDados.getInstancia();
        
        banco.add(produto);
        
        JOptionPane.showMessageDialog(null, "Produto salvo");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void BtCancelarCadastroActionPerformed(){
        tela.dispose();
    }

    
    
}
