
package com.tienda_v1.service;

import com.tienda_v1.domain.Cliente;
import java.util.List;


public interface ClienteService {
    
    //obtiene la lista de registros de la tabla cliente
    //y lo coloca en una lista de objetos Cliente
    public List<Cliente> getClientes();
    
    
    //obtiene el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cliente
    public Cliente getCliente(Cliente cliente);
    
    
    //Elimina el registro de la tabla cliente que tiene el idCliente pasado por el objeto cliente
    public void deleteCliente(Cliente cliente);
    
    //Si el idCliente pasado no existe o es nulo se crea un registro nuevo en la tabla cliente
    //si el idCliente existe...se actualiza la información
    public void saveCliente(Cliente cliente);
}
