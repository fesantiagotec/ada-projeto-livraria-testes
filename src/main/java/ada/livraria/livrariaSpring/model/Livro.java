package ada.livraria.livrariaSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "LIVRO")
public class Livro {
    @Id
    @Column(updatable = false)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "AUTOR")
    private String autor;
    @Column(name = "EDICAO")
    private String edicao;
    @Column(name = "PRECO")
    private Double preco;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    public Livro(String nome, String autor, Double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    protected Livro() {

    }

    public String toString() {
        return "Nome: " + nome + " autor: " + autor + " e preco: " + preco;
    }

}
