public class Disciplina implements ComponenteCurricular {

    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar(String identacao) {
        System.out.println(identacao + "- Disciplina: " + nome);
    }
}