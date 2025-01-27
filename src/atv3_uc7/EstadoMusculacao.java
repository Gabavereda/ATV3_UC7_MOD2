package atv3_uc7;

public class EstadoMusculacao implements EstadoExercicio {

    @Override
    public void selecionarExercicio() {

        System.out.println("\t\t===Resistência===");
        TipoExercicio resistencia = new Resistencia();
        resistencia.musculacao();
        System.out.println("\t\t===Velocidade===");
        TipoExercicio velocidade = new Velocidade();
        velocidade.musculacao();
    }
}
