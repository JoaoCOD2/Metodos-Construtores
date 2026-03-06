package projetoaluno;

public class ProjetoAluno {

    public static void main(String[] args) throws InterruptedException {

        Aluno a1 = new Aluno("João", 7.3, 8.2);

        System.out.println("Aluno: " + a1.getNome());
        Thread.sleep(1500);
        System.out.println("Nota 1: " + a1.getNota1());
        Thread.sleep(1500);
        System.out.println("Nota 2: " + a1.getNota2());
        Thread.sleep(1500);
        System.out.println("Média: " + a1.calcularMedia());
        Thread.sleep(1500);
        a1.verificarAprovacao();
        
        System.out.println("-------------------------");

        Aluno a2 = new Aluno("Alice", 4.5, 2.4);

        Thread.sleep(1500);

        System.out.println("Aluno: " + a2.getNome());
        Thread.sleep(1500);
        System.out.println("Nota 2: " + a2.getNota1());
        Thread.sleep(1500);
        System.out.println("Nota 2: " + a2.getNota2());
        Thread.sleep(1500);
        System.out.println("Média: " + a2.calcularMedia());
        Thread.sleep(1500);
        a2.verificarAprovacao();

    }

}
