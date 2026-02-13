package com.projeto.cadastro.Ninjas;


import com.projeto.cadastro.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long id;

    private String nome;
    private String email;
    private int idade;
    private List<MissoesModel> missoes;

    @ManyToOne
    @JoinColumn(name= "missoes_id") //foreign key
    private MissoesModel missoesModel;
}
