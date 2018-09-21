/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Teste {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Rafael");
        cli.setIdade(25);
        cli.setRg_cliente("MG-14.945.328");

        ClienteController clienteController = new ClienteController();
        clienteController.saveCliente(cli);
    }
}
