package org.example.br.com.puc.model.DAO;

import org.example.br.com.puc.model.Aluno;
import org.example.br.com.puc.model.Cursos;

import java.util.List;

public interface IAlunoDAO {
    Aluno create(Aluno aluno);
    Aluno update(Aluno aluno);
    void delete(Long matricula);
    Aluno findById(int id);
    List<Aluno> findAll();
    List<Aluno> findByNome(Cursos cursos);
}
