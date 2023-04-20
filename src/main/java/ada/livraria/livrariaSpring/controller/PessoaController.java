package ada.livraria.livrariaSpring.controller;

import ada.livraria.livrariaSpring.exceptions.ResourceNotFoundException;
import ada.livraria.livrariaSpring.model.Pessoa;
import ada.livraria.livrariaSpring.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public class PessoaController {
//CadastrarPessoa/RetrievePessoa/UpdatePessoa
    private final PessoaRepository repository;

    @GetMapping("{id}")
    public Pessoa getPessoa(@PathVariable int id) {
        //Criar pacote exceptions e criar essa classe ResourceNotFoundException
        return repository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @GetMapping
    public List<Pessoa> getPessoas() {
        return repository.findAll();
    }

    @PostMapping
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @PostMapping
    public Pessoa recuperarPessoa(@RequestBody Pessoa pessoa) {
        //mudar o save?
        return repository.save(pessoa);
    }

    @PutMapping
    public Pessoa atualizarPessoa(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }

}
