/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.associacao.dao;

import br.com.associacao.entidade.Fornecedor;
import br.com.utilitario.UtilGerador;

/**
 *
 * @author HP
 */
public class FornecedorDaoImplTest1 {
    
    private Fornecedor fornecedor;
    private FornecedorDaoImpl fornecedorDaoImpl1;
    
    public FornecedorDaoImplTest1() {
        fornecedorDaoImpl1 = new FornecedorDaoImpl();
    }


    public void testSalvar() throws Exception {
        System.out.println("salvar");
        fornecedor = new Fornecedor(null, UtilGerador.gerarCaracter(10), UtilGerador.gerarNumero(14), 
                UtilGerador.gerarNumero(9), UtilGerador.gerarEmail(), UtilGerador.gerarTelefoneFixo());
        
        fornecedorDaoImpl1.salvar(fornecedor);
    }
    
}
