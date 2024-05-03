package prova_WebService.avaliacao.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int Ano;
    private int Semestre;
    private int DiaDaSemana;
    private String Horarios;

    public void AbrirTurma() {}
    public void alocarProfessor() {}
    public void matricularAluno() {}
    public void emitirDiario() {}

    @ManyToOne
    @JoinColumn(name = "Professor_id", referencedColumnName = "id")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "Codigo", referencedColumnName = "Codigo")
    private Disciplina disciplina;

    @ManyToMany
    @JoinTable(name = "turma_aluno",
            joinColumns = @JoinColumn(name = "turma_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private Set<Aluno> alunos = new HashSet<>();
}
