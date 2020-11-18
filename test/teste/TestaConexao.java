/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import br.com.associacao.dao.ClienteDaoImpl;
import br.com.associacao.entidade.Cliente;
import br.com.utilitario.UtilGerador;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class TestaConexao {
    
    private static Cliente cliente;
    private static ClienteDaoImpl clienteDaoImpl;

    public TestaConexao() {
        clienteDaoImpl = new ClienteDaoImpl();
    }
    
    
    public static void main(String[] args) throws SQLException {
        testeSalvar();
        
//        System.out.println(!FabricaConexao.abrirConexao().isClosed());
//        Connection conexao = FabricaConexao.abrirConexao();
//        System.out.println(conexao.isClosed());
    }
    
    public static void testeSalvar() throws SQLException{
        System.out.println("salvar");
        clienteDaoImpl = new ClienteDaoImpl();

        cliente = new Cliente(null, UtilGerador.gerarCaracter(10), UtilGerador.gerarEmail(), 
                UtilGerador.gerarTelefoneFixo(), Double.parseDouble(UtilGerador.gerarNumero(3)));

        clienteDaoImpl.salvar(cliente);
    }
    
    public void testAlterar() throws Exception {
        System.out.println("alterar");
         cliente = new Cliente(1, UtilGerador.gerarCaracter(10), UtilGerador.gerarEmail(), 
                UtilGerador.gerarTelefoneFixo(), Double.parseDouble(UtilGerador.gerarNumero(3)));
         clienteDaoImpl.alterar(cliente);
    }
    
}
