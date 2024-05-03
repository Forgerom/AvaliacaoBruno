package prova_WebService.avaliacao.Repository;

import prova_WebService.avaliacao.Model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prova_WebService.avaliacao.Model.Disciplina;

@Repository
public interface DisciplinaRepository
        extends JpaRepository<Disciplina, Integer> {
}
