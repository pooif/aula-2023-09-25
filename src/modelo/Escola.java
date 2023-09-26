package modelo;

public class Escola {

  void teste() {
    Aluno a = new Aluno();
  
  }
  // classe aninhada (nested class)
  private static class Aluno {
    private void a(Turma t) {
      t.b();
    }
  }

  public static class Turma {
    private void b() {

    }
  }
  
}
