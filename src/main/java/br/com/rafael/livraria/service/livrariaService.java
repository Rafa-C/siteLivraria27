package br.com.rafael.livraria.service;

import br.com.rafael.livraria.model.livrariaModel;
import br.com.rafael.livraria.repository.livrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class livrariaService {
    @Autowired // injeção de dependencia, ou seja, essa classe está dependente de outra
    private livrariaRepository repository; // essa classe esta dependete da classe repository

    public livrariaModel cadastrarLivro(livrariaModel livro) {
        return repository.save(livro); //aqui os dados serao salvos no livro
    }

    public Iterable<livrariaModel> listarLivros(){ //Aqui estamos criando um metodo, Iterable vai criar uma lista,
    Iterable<livrariaModel>  livro = repository.findAll(); // aqui chamamos o repositorio e usamos o find.all, ele é do tipo Iterable, e vai puxar tudo que foi cadastrado no formato de lista
    return livro; // variavel livro que esta a cima
    }

}
