import modelo.Aluno;
import modelo.Periodo;
import modelo.Semestre;
import modelo.Turma;

class App {
  public static void main(String[] args) {
    Semestre s = Semestre.QUINTO;
    System.out.println(s.ordinal());
    Periodo p = new Periodo(2023, 2);
    System.out.println(p);

    Aluno a1 = new Aluno(1234, "Maryene");
    Aluno a2 = new Aluno(5678, "John");

    Turma t1 = new Turma(Semestre.QUARTO, new Periodo(2024, 1));
    Turma t2 = new Turma(Semestre.QUINTO, new Periodo(2024, 1));

    System.out.println(a1.getTurmas());
    System.out.println(t1.getAlunos());
    
    t1.matricular(a1);
    t1.matricular(a2);
    t2.matricular(a2);
    // a1.matricular(t1);

    System.out.println(t1.getAlunos()); // [Mary]
    System.out.println(a1.getTurmas()); // [QUARTO 2024/1]

    System.out.println(a2.getTurmas());


  }
}