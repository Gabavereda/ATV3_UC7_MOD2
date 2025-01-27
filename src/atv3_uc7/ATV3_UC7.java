package atv3_uc7;

import java.util.Scanner;

public class ATV3_UC7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EstadoAluno contexto = new EstadoAluno();
        boolean continuar = true;

        do {
            System.out.println("Qual o tipo de exercício que o aluno irá fazer agora?");
            System.out.println("1 - Corrida\n2 - Musculação\n0 - Sair");

            int opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    contexto.selecionarExercicio(new Resistencia());
                    break;
                case 2:
                    contexto.selecionarExercicio(new Velocidade());
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (continuar);

        entrada.close();
    }
}
