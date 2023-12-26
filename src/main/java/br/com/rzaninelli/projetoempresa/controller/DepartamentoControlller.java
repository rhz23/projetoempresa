package br.com.rzaninelli.projetoempresa.controller;

import br.com.rzaninelli.projetoempresa.dao.DepartamentoDAO;
import br.com.rzaninelli.projetoempresa.model.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DepartamentoControlller {

    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos() {
        ArrayList<Departamento> lista;
//        lista = (ArrayList<Departamento>)dao.findAll();
        lista = (ArrayList<Departamento>) dao.findByOrderByNome();
        return lista;
    }

    @GetMapping(value = "/departamentos", params = {"andar"})
    public ArrayList<Departamento> recuperarTodosAndar(@RequestParam (value = "andar") int andar) {
        ArrayList<Departamento> lista;
//        lista = (ArrayList<Departamento>)dao.findAll();
        lista = (ArrayList<Departamento>) dao.findByAndar(andar);
        return lista;
    }



}
