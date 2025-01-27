package atv3_uc7;

public class EstadoAluno {

    private TipoExercicio ultimoExercicioSelecionado;

    public void selecionarExercicio(TipoExercicio exercicio) {
        if (ultimoExercicioSelecionado != null && ultimoExercicioSelecionado.getClass() == exercicio.getClass()) {
            System.out.println("Você já está fazendo este exercício.");
        } else {
            exercicio.mostrarCategoria();
            exercicio.executar();
            ultimoExercicioSelecionado = exercicio;
        }
    }
}
