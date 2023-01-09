package br.com.acto.vendinha.entity;

import br.com.acto.vendinha.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoEntity extends GenericEntity<Produto> {

    public List<Produto> produtos;

    public ProdutoEntity() {this.produtos = new ArrayList<>();}

    @Override
    public void cadastrar(Produto produtos) {this.produtos.add(produtos);}

    @Override
    public List<Produto> buscarTodos() {return this.produtos;}

}
