package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;
import jdbc.model.Endereco;
import jdbc.model.Pet;

/**
 *
 * @author edson
 */
public interface IDao {
    public ArrayList<Cliente> consultar();
    public Cliente consultar(int id);
    public Cliente cadastrar(Cliente cliente, Endereco endereco);
    public Pet cadastarPet(Pet pet);
    public boolean excluir(int id);
    public boolean alterar(Cliente cliente, int id);
    public boolean excluirEndereco(int cliente_id);
    
}
