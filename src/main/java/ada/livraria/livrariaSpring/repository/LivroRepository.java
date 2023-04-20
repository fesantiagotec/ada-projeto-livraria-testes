package ada.livraria.livrariaSpring.repository;

import ada.livraria.livrariaSpring.model.Livro;
import ada.livraria.livrariaSpring.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
