package projetofuncionario;

public class ProjetoFuncionario {

    public static void main(String[] args) {

        System.out.println("----- Dados dos Funcionários -----");

        Funcionario f1 = new Funcionario("João", 7.598, "Programador");

        f1.exibirDados();

        Funcionario f2 = new Funcionario("Alice", 7.990, "Farmacêutica");

        f2.aumentarSalario(10);
        f2.exibirDados();

        Funcionario f3 = new Funcionario ("Carlos", -1459 ,"Gerente");
        
        f3.exibirDados();
    }
}
