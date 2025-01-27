package atv3_uc7;

public class EstadoCorrida implements EstadoExercicio {

    @Override
    public void selecionarExercicio() {

        System.out.println("\t\t===Resistência===");
        TipoExercicio resistencia = new Resistencia();
        resistencia.corrida();
        System.out.println("\t\t===Velocidade===");
        TipoExercicio velocidade = new Velocidade();
        velocidade.corrida();
    }
}
