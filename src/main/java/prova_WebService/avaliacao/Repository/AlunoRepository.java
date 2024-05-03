package prova_WebService.avaliacao.Repository;

import prova_WebService.avaliacao.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    void deleteById(Long id);

    Optional<Aluno> findById(Long id);
}
