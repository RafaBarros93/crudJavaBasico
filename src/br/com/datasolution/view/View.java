package br.com.datasolution.view;

import br.com.datasolution.controller.EnderecoClienteController;
import br.com.datasolution.controller.ClienteController;
import br.com.datasolution.model.EnderecoCliente;
import br.com.datasolution.model.Cliente;
import java.util.ArrayList;
import java.util.List;


public class View {

    public static void main(String[] args) {
     
        Cliente cli = new Cliente();
        cli.setNome("Cassaro");
        cli.setIdade(21);
        cli.setRg_cliente("MG-25.145.120");
        cli.setMatricula(14659887);

        List<Cliente> clientes = new ArrayList();
        clientes.add(cli);

        EnderecoCliente endereco = new EnderecoCliente();
        endereco.setCiadade("Contagem");
        endereco.setBairro("Europa");
        endereco.setCep("666-35446");
        endereco.setNumero(802);
        endereco.setRua("Rua 11");

        endereco.setEnderecos(clientes);

        cli.setEndereco(endereco);

       EnderecoClienteController enController = new EnderecoClienteController();
       enController.saveEnderecoCliente(endereco);
        
      

       
    }
}
