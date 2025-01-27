package atv3_uc7;

public class Velocidade implements TipoExercicio {

    @Override
    public void executar() {

        musculacao();
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categorias de exercícios recomendadas para musculação:");
    }

    @Override
    public void musculacao() {
        System.out.println("\t\t===Resistência===");
        System.out.println("O aluno vai levantar quantidades de peso de ordem crescente.");
        System.out.println("A fim de estabelecer uma crescente de resistência.");
        System.out.println("\t\t===Velocidade===");
        System.out.println("Quantas séries de levantamento o aluno faz em curtos espaços de tempo.");
    }

    @Override
    public void corrida() {
    }
}
