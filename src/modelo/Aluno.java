package modelo;

import java.util.ArrayList;
import java.util.List;
// visibilidade:
// public, private, protected, default (internal, module, ...)
public class Aluno {

  private Integer matricula;
  private String nome;
  private List<Turma> turmas = new ArrayList<>();

  public Aluno(Integer matricula, String nome) {
    this.matricula = matricula;
    this.nome = nome;
  }
  
  public Integer getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public List<Turma> getTurmas() {
    return new ArrayList<>(turmas);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Aluno) {
      Aluno outro = (Aluno) o;
      return this.matricula.equals(outro.matricula);
    }
    return false;
  }

  @Override
  public String toString() {
    return nome;
  }

  // default => privado do pacote
  void sincronizar(Turma turma) {
    if ( ! turmas.contains(turma)) {
      turmas.add(turma);
      turma.matricular(this);
    }
  }
}