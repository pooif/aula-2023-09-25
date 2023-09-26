package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
  
  private Semestre semestre;
  private Periodo periodo;
  private List<Aluno> alunos = new ArrayList<>();

  public Turma(Semestre semestre, Periodo periodo) {
    this.semestre = semestre;
    this.periodo = periodo;
  }

  public void matricular(Aluno aluno) {
    if ( ! alunos.contains(aluno)) {
      alunos.add(aluno);
      aluno.sincronizar(this);
    }
  }

  public Semestre getSemestre() {
    return semestre;
  }

  public Periodo getPeriodo() {
    return periodo;
  }

  public List<Aluno> getAlunos() {
    return new ArrayList<>(alunos);
    // return Collections.unmodifiableList(alunos);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Turma) {
      Turma turma = (Turma) o;
      return this.semestre.equals(turma.semestre)
          && this.periodo.equals(turma.periodo);
    }
    return false;
  }

  @Override
  public String toString() {
    return "Turma [semestre=" + semestre + ", periodo=" + periodo + "]";
  }

  
}
