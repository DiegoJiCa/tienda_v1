package com.tienda_v1.service.impl;

import com.tienda_v1.dao.ClienteDao;
import com.tienda_v1.domain.Cliente;
import com.tienda_v1.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/* Esto es para que el controlador lo identifique como un servicio*/
public class ClienteServiceImpl implements ClienteService {
    //Esto crea una única copia de un objeto clienteDao

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll(); //se obtiene un listado de la tabla cliente y los mando a traer    

    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);

    }

    @Override
    public void deleteCliente(Cliente cliente) {
        clienteDao.delete(cliente);

    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteDao.save(cliente);

    }

}
