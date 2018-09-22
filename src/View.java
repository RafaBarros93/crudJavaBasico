

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafael
 */
public class View {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Alexandre");
        cli.setIdade(30);
        cli.setRg_cliente("MG-25.145.120");
        cli.setMatricula(14659887);

        List<Cliente> clientes = new ArrayList();
        clientes.add(cli);

        EnderecoCliente endereco = new EnderecoCliente();
        endereco.setCiadade("Neves");
        endereco.setBairro("Logoa");
        endereco.setCep("666-35446");
        endereco.setNumero(802);
        endereco.setRua("Rua 11");

        endereco.setEnderecos(clientes);

        cli.setEndereco(endereco);

      //  ClienteController cliController = new ClienteController();
      //  cliController.saveCliente(cli);

        EnderecoClienteController enController = new EnderecoClienteController();
        enController.saveEnderecoCliente(endereco);
    }
}
