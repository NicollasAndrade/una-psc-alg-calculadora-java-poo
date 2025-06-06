import java.util.Scanner;

public class Calculadora {

    private double numeroUm;
    private double numeroDois;

    public void setNumeros(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public String dividir() {
        if (numeroDois == 0) {
            return "Impossível realizar uma divisão por zero.";
        }
        return String.valueOf(numeroUm / numeroDois);
    }

    public double potencia() {
        // qualquer número elevado a zero é 1
        if (numeroDois == 0) {
            return 1;
        }
        return Math.pow(numeroUm, numeroDois);
    }

    public String raizQuadrada() {
        if (numeroUm < 0) {
            return "Não existe raiz de número negativo.";
        }
        return String.valueOf(Math.sqrt(numeroUm));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        String opcao;

        System.out.println("=== CALCULADORA JAVA - POO ===");

        do {
            System.out.print("\nDigite o primeiro número: ");
            double numeroUm = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numeroDois = scanner.nextDouble();

            calc.setNumeros(numeroUm, numeroDois);

            System.out.println("\nResultado das Operações:");
            System.out.println("Soma: " + calc.somar());
            System.out.println("Subtração: " + calc.subtrair());
            System.out.println("Multiplicação: " + calc.multiplicar());
            System.out.println("Divisão: " + calc.dividir());
            System.out.println("Potência: " + calc.potencia());
            System.out.println("Raiz Quadrada do primeiro número: " + calc.raizQuadrada());

            System.out.print("\nDeseja realizar outra operação? (Digite 'Q' para sair ou qualquer tecla para continuar): ");
            opcao = scanner.next();
        } while (!opcao.equalsIgnoreCase("Q"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

