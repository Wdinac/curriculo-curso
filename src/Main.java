public class Main {

    public static void main(String[] args) {

        // Criando disciplinas
        Disciplina java = new Disciplina("Programacao em Java");
        Disciplina bancoDados = new Disciplina("Banco de Dados");
        Disciplina engenharia = new Disciplina("Engenharia de Software");
        Disciplina redes = new Disciplina("Redes de Computadores");
        Disciplina sistemas = new Disciplina("Sistemas Operacionais");

        // Criando módulos
        Modulo programacao = new Modulo("Programacao");
        Modulo infraestrutura = new Modulo("Infraestrutura");
        Modulo curso = new Modulo("Curso de Sistemas de Informacao");

        // Adicionando disciplinas aos módulos
        programacao.adicionar(java);
        programacao.adicionar(bancoDados);

        infraestrutura.adicionar(redes);
        infraestrutura.adicionar(sistemas);

        // Adicionando uma disciplina diretamente ao módulo principal
        curso.adicionar(engenharia);

        // Adicionando módulos dentro do módulo principal
        curso.adicionar(programacao);
        curso.adicionar(infraestrutura);

        // Exibindo a estrutura curricular
        curso.mostrar("");
    }
}