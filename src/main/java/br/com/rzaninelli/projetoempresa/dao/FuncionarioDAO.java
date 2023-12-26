package br.com.rzaninelli.projetoempresa.dao;

import br.com.rzaninelli.projetoempresa.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer> {


}
