package prova_WebService.avaliacao.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "Avaliacao")

public class Avaliacao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Avaliacao;

    private Float Nota1;

    private Float Nota2;

    private Float NotaProvaFinal;

    private int Frequencia;

    public void lancarAvaliacao(){}

    public void calcularAprovacao(){}

    @ManyToOne
    @JoinColumn(name = "id")
    private prova_WebService.avaliacao.Model.Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_turma")
    private prova_WebService.avaliacao.Model.Turma turma;



}
