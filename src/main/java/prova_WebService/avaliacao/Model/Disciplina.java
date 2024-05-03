package prova_WebService.avaliacao.Model;

import jakarta.persistence.*;
import lombok.*;

@Data //lomok ajuda com os métodos: get,set,tostring, @equals
@Builder
@NoArgsConstructor
@AllArgsConstructor
/*lombok*/
/*jpa/hibernate*/
@Entity
@Table(name = "Disciplina")
@EqualsAndHashCode(of = "Codigo")
public class Disciplina {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Codigo;

    private String Descricao;

    private int Carga_horaria;

    private String Ementa;

    private String Bibliografia;

    public void Cadastrar(){}

    @ManyToOne
    @JoinColumn(name = "codigo_curso", referencedColumnName = "Codigo")
    private prova_WebService.avaliacao.Model.Curso curso;
}
