package prova_WebService.avaliacao.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/*lombok*/
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Aluno")
@Entity
@Data //lomok ajuda com os métodos: get,set,tostring, @equals
@Builder


/*lombok*/
/*jpa/hibernate*/


@DiscriminatorValue("Aluno")
@EqualsAndHashCode(callSuper = true)

public class Aluno extends prova_WebService.avaliacao.Model.Pessoa {


    private String Matricula;

    private String Situacao;
    //*----------------------------------------------------------------------------*//
    public void MatricularCurso(){}

    public void trancar(){}

    public void formar(){}

    public void evadir(){}

    public void obterAvaliacoes(){}

    public void emitirHistorico(){}

    @ManyToMany(mappedBy = "alunos")
    private Set<prova_WebService.avaliacao.Model.Turma> turmas = new HashSet<>();

}
