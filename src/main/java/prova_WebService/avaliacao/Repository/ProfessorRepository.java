package prova_WebService.avaliacao.Repository;

import prova_WebService.avaliacao.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prova_WebService.avaliacao.Model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
