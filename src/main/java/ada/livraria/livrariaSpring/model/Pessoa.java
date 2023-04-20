package ada.livraria.livrariaSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/*
Crie um projeto de uma loja virtual de livros. Ele deve conter uma parte para realizar o cadastro de pessoas e livros e também ser capaz de realizar a venda de livros da nossa loja para as pessoas.

Para transação se realizar, a pessoa deve ter saldo.

Sugestão de classes:

Pessoa

Nome
DataNascimento
CPF
email
telefone
Saldo
Livro

Nome
Edicao
Autor
Preco
Quantidade
Transacao

Comprador ( Pessoa )
livros ( Lista de livros )
Avaliação

O projeto deve ser hospedado no GitHub e possuir uma cobertura de pelo menos 60% de testes, contendo testes unitários e de integração.

O projeto deverá ser realizado em um grupo de 3 a 5 pessoas e no dia 24/04 deverá ser realizada uma apresentação, contendo ao menos um relatório de cobertura de testes e mostrando um teste unitário e de integração realizado.

Lembrando que o foco desse módulo são os testes. Então caso não seja possível implementar todas as funcionalidades desejadas, o que será avaliado serão apenas os testes. Porém lembrem-se também que esse é o último módulo então tentem praticar ao máximo e fazer tudo que for possível.

Em um último caso aonde a implementação da lógica esteja sendo o limitante, vocês podem utilizar o projeto do Banco que foi passado em sala e criar apenas realizar a cobertura de testes desse projeto. Porém evitem isso pois vocês vão deixar de praticar algo importante.
* */
@Setter
@Getter
@Entity
@Table(name = "PESSOA")
public class Pessoa {
    @Id
//    @SequenceGenerator(name = "pessoaSequenceGenerator", sequenceName = "PESSOA_SQ", initialValue = 100)
//    @GeneratedValue(generator = "pessoaSequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(updatable = false)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;
    @Column(name = "CPF")
    private String cpf;

    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "SALDO")
    private Double saldo;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
        this.cpf = cpf;
        this.nome = nome;
    }

    protected Pessoa() {

    }

    public String toString() {
        return "Nome: " + nome + " telefone: " + telefone + " e cpf: " + cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.plusYears(18).isAfter(LocalDate.now())) {
            //throw new ValorInvalidoException();
        } else {
            this.dataNascimento = dataNascimento;
        }
    }
}
