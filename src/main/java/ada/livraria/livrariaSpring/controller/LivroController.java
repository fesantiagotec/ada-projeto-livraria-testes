package ada.livraria.livrariaSpring.controller;

import ada.livraria.livrariaSpring.exceptions.ResourceNotFoundException;
import ada.livraria.livrariaSpring.model.Livro;
import ada.livraria.livrariaSpring.model.Pessoa;
import ada.livraria.livrariaSpring.repository.LivroRepository;
import ada.livraria.livrariaSpring.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public class LivroController {
    //CadastrarLivro/RetrieveLivro/UpdateLivro/DeleteLivro
    private final LivroRepository repository;

    @GetMapping("{id}")
    public Livro getLivro(@PathVariable int id) {
        //Criar pacote exceptions e criar essa classe ResourceNotFoundException
        return repository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @GetMapping
    public List<Livro> getLivros() {
        return repository.findAll();
    }

    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) {

        return repository.save(livro);
    }

    @PostMapping
    public Livro recuperarLivro(@RequestBody Livro livro) {
        //mudar o save?
        return repository.save(livro);
    }

    @PutMapping
    public Livro atualizarLivro(@RequestBody Livro livro) {

        return repository.save(livro);
    }

    @DeleteMapping
    public void excluirLivro(@RequestBody Livro livro) {
        repository.delete(livro);
    }

}
