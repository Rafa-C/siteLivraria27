package br.com.rafael.livraria.model;

import javax.persistence.*;

@Entity
@Table(name="Livro")
public class livrariaModel {
    @Id // id fica como chave primaria, ela identifica o resgistro e não pode ser repetida
    @GeneratedValue(strategy = GenerationType.AUTO) // gera id automaticamente, ou seja, cadastro 1 cadastro 2 = id 1 , id 2
    private int id; // id = identificacao,
    @Column // isso que interliga com o banco de dados
    private String nome;
    @Column
    private String autor;
    @Column
    private String descricao;
    // nesta classe os dados serao armarzenados
    // exemplo, se eu digitar harry potter como nome do livro, o nome será salvo na variavel nome


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
