package jdbc.service;

import java.util.ArrayList;
import jdbc.dao.ClienteDao;
import jdbc.model.Cliente;
import jdbc.model.Endereco;

public class ClienteService {
    private ClienteDao clienteDao;
    
    public ClienteService(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }
    public ArrayList<Cliente> consultar(){
        return clienteDao.consultar();
    }
    public Cliente consultar(int id){
        return clienteDao.consultar(id);
        /*
        Cliente cli = new Cliente(1, "Edson", "12315", "12124456", 
                "edson.feitosa@facens.br", "(15)9914445", "(15)15848", 
                "18015000", "rua teste", "123", "", "bairro teste", 
                "Sorocaba", "SP");
        return cli;
        */
    }
    public Cliente cadastrar(Cliente cliente, Endereco endereco){
        return clienteDao.cadastrar(cliente,endereco );
    }
    public boolean excluir(int id){
        return clienteDao.excluir(id);
    }
    public boolean alterar(Cliente cliente, int id){
        return clienteDao.alterar(cliente, id);
    }
    
    public boolean excluirEndereco(int cliente_id){
        return clienteDao.excluirEndereco(cliente_id);
    }
    
}
