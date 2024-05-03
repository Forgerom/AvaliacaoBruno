package prova_WebService.avaliacao.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Curso")
@Table(name = "Curso")
@EqualsAndHashCode(of = "Codigo")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;

    private String Descricao;

    public void Cadastrar() {
        // Método para cadastrar o curso
    }

    @ManyToOne
    @JoinColumn(name = "disciplina_id", referencedColumnName = "Codigo")
    private Disciplina disciplina;

    @ManyToMany
    @JoinTable(name = "Curso_Professor",
            joinColumns = @JoinColumn(name = "curso_id", referencedColumnName = "Codigo"),
            inverseJoinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id")
    )
    private Set<Professor> professores;
}
