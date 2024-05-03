package prova_WebService.avaliacao.Repository;

import prova_WebService.avaliacao.Model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prova_WebService.avaliacao.Model.Avaliacao;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao,Float> {
}
