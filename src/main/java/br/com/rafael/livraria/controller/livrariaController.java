package br.com.rafael.livraria.controller;

import br.com.rafael.livraria.model.livrariaModel;
import br.com.rafael.livraria.service.livrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class livrariaController {

    @Autowired
    private livrariaService service; // depende da classe service

    @GetMapping
    public String Home(){
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastroLivro(livrariaModel livro){
        service.cadastrarLivro(livro); // aqui ele enviara os dados para o metodo cadastrarLivro e os dados serao salvos em livro
        return "index"; // o return sempre vai retornar a pagina que voce criou
    }



   @GetMapping("/livros")
   public ModelAndView listarLivro(){
    ModelAndView paginaLivro = new ModelAndView("listarLivro");
  Iterable<livrariaModel>  livro = service.listarLivros();
  paginaLivro.addObject("livro", livro);
    return paginaLivro;
    }

}
