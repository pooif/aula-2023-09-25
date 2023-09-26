package modelo;

// struct
public record Periodo(int ano, int semestre) {

  @Override
  public String toString() {
    return ano + "/" + semestre;
  }

}
/* VALUE OBJECT
final class Periodo {

  private final int ano;
  private final int semestre;

  Periodo(int ano, int semestre) {
    this.ano = ano;
    this.semestre = semestre;
  }

  public int getAno() {
    return ano;
  }

  public int getSemestre() {
    return semestre;
  }

  @Override
  public String toString() {
    return ano + "/" + semestre;
  }// syntax sugar

  @Override
  public boolean equals(Object o) {
    if (o instance Periodo) {
      Periodo periodo = (Periodo) o;
      return periodo.ano == this.ano &&
             periodo.semestre == this.semestre;
    }
    return false;
  }
}
 */