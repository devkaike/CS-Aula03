package org.example.br.com.puc.model;


public class Aluno {
    private Long matricula;
    private String nome;

    public Aluno() {
    }

    Boolean maiorIdade;
    Cursos cursos;

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    String sexo;
}
