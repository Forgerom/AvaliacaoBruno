package prova_WebService.avaliacao.Repository;

import prova_WebService.avaliacao.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prova_WebService.avaliacao.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
