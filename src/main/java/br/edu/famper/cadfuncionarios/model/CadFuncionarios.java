package br.edu.famper.cadfuncionarios.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "tbl_funcionarios")
@Data

public class CadFuncionarios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "funcionario_id")
    private Long funcionario_id;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "cpf", length = 20)
    private String cpf;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "endereco", length = 200)
    private String endereco;

    @Column(name = "cargo", length = 150)
    private String cargo;

    @Column(name = "departamento", length = 150)
    private String departamento;

    @Column(name = "datacontrat", length = 150)
    private Date datacontrat;
}
