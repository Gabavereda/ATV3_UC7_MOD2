package atv3_uc7;

public class Resistencia implements TipoExercicio {

    @Override
    public void executar() {

        corrida();
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categorias de exercícios recomendadas para corridas:");
    }

    public void corrida() {
        System.out.println("\t\t===Resistência===");
        System.out.println("O aluno irá correr a maior distância que conseguir, apenas calculando a quilometragem percorrida.");
        System.out.println("\t\t===Velocidade===");
        System.out.println("O aluno tem tempo cronometrado para as corridas.");
        System.out.println("O objetivo é correr rápido, buscando diminuir o tempo gasto para alcançar distâncias longas.");
    }

    @Override
    public void musculacao() {
    }
}
