package prova_WebService.avaliacao.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Pessoa")
@EqualsAndHashCode(of = "id")
public class Pessoa {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Nome;

    private String Endereco;

    private String Telefone;


    public void Cadastrar(){}

}
