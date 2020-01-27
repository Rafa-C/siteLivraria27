package br.com.rafael.livraria.service;

import br.com.rafael.livraria.model.livrariaModel;
import br.com.rafael.livraria.repository.livrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class livrariaService {
    @Autowired // indeção de dependencia, ou seja, essa classe está dependente de outra
    private livrariaRepository repository; // essa classe esta dependete da classe repository

    public livrariaModel cadastrarLivro(livrariaModel livro) {
        return repository.save(livro); //aqui os dados serao salvos no livro
    }
}
