package prova_WebService.avaliacao.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Professor")
@Entity(name = "Professor")
@Data
@Builder

@DiscriminatorValue("Professor")
@EqualsAndHashCode(of = "id")
public class Professor extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String TitulacaoMaxima;

    @Override
    public void Cadastrar() {}

    @OneToMany(mappedBy = "professor")
    private Set<Turma> turmas = new HashSet<>();

    @ManyToMany(mappedBy = "professores")
    private Set<Curso> cursos;
}
