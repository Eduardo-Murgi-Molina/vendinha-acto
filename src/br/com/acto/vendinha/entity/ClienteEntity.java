package br.com.acto.vendinha.entity;

import br.com.acto.vendinha.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteEntity extends GenericEntity<Cliente> {

    public List<Cliente> clientes;

    public ClienteEntity() {this.clientes = new ArrayList<>();}

    @Override
    public void cadastrar(Cliente clientes) {this.clientes.add(clientes);}

    @Override
    public List<Cliente> buscarTodos() {return this.clientes;}

}