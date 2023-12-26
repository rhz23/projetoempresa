package br.com.rzaninelli.projetoempresa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity                         // para indicar que a classe corresponde a uma entidade armazenavel
@Table(name="departamento")     // especificar o nome da tabela (caso não coincida com o nome da classe)
public class Departamento {

    @Id                         // informo que o atributo é uma chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // informo que é auto-increment
    @Column(name = "numero_id")     // especifico o nome da coluna
    private int numeroId;

    @Column(name = "name", length = 100, nullable = false)
    private String nome;

    @Column(name = "andar", nullable = false)
    private int andar;

    @OneToMany(mappedBy = "depto", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("depto")
    private List<Funcionario> listFuncionarios;

    public List<Funcionario> getListFuncionarios() {
        return listFuncionarios;
    }

    public void setListFuncionarios(List<Funcionario> listFuncionarios) {
        this.listFuncionarios = listFuncionarios;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
}
