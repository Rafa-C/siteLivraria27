package br.com.rafael.livraria.repository;

import br.com.rafael.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel, String> {
    // extends ele herda o conteudo da classe livrariaModel
}
