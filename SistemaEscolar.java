import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8]; // 8 notas no total

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas anuais do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais (cada bimestre tem 2 notas)
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        double mediaSemestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        double mediaSemestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Cálculo da média final anual
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Exibição dos resultados
        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Média do %dº Bimestre: %.2f\n", i + 1, mediasBimestrais[i]);
        }

        System.out.printf("Média do 1º Semestre: %.2f\n", mediaSemestre1);
        System.out.printf("Média do 2º Semestre: %.2f\n", mediaSemestre2);
        System.out.printf("Média Final Anual: %.2f\n", mediaFinal);

        scanner.close();
    }
}

