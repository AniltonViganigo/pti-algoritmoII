import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números você deseja cadastrar no vetor: ");
        int N = sc.nextInt();
        int vetor[] = new int[N];

        lerVetor(vetor, N);
        imprimirVetor(vetor);
        calculaDiferencaVetor(vetor);
        System.out.println(verificaOrdenacaoVetor(vetor));

        sc.close();
    }

    private static void calculaDiferencaVetor(int[] vetor) {

        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

        }
        System.out.println("Maior diferença entre os elementos armazenados no vetor é: " + (maior - menor));
    }

    public static String verificaOrdenacaoVetor(int[] vetor) {

        final String VETOR_CRESCENTE_OK = "O vetor está em ordem crescente!";
        final String VETOR_CRESCENTE_NOK = "O vetor não está em ordem crescente!";

        boolean vetorOrdenado = true;

        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                vetorOrdenado = false;
            }
        }
        if (vetorOrdenado == true) {
            return VETOR_CRESCENTE_OK;
        } else {
            return VETOR_CRESCENTE_NOK;
        }
    }


    public static void imprimirVetor(int[] vet) {

        System.out.print("Dados dos vetor: ");

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    public static void lerVetor(int[] vet, int N) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor do Vetor[" + i + "]:");
            vet[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
    }

}





