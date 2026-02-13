package com.projeto.cadastro.Missoes;

import com.projeto.cadastro.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private RankDaMissao rank;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
