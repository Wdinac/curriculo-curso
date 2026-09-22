import java.util.ArrayList;
import java.util.List;

public class Modulo implements ComponenteCurricular {

    private String titulo;
    private List<ComponenteCurricular> itens;

    public Modulo(String titulo) {
        this.titulo = titulo;
        this.itens = new ArrayList<>();
    }

    public void adicionar(ComponenteCurricular c) {
        itens.add(c);
    }

    public void remover(ComponenteCurricular c) {
        itens.remove(c);
    }

    @Override
    public void mostrar(String identacao) {
        System.out.println(identacao + "+ Modulo: " + titulo);

        for (ComponenteCurricular item : itens) {
            item.mostrar(identacao + "  ");
        }
    }
}