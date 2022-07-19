package model;

public class RecursosHumanos implements Setor {

    private static RecursosHumanos instancia = new RecursosHumanos();

    private RecursosHumanos() {
    }

    public static RecursosHumanos getInstancia() {
        return instancia;
    }

    public String receberSugestao(String mensagem) {
        return "O setor de Recursos Humanos agradece pelo feedback: " + mensagem;
    }

    public String receberDuvida(String mensagem) {
        return "Breve o setor de Recursos Humanos enviará um e-mail respondendo a sua dúvida: " + mensagem;
    }

    public String receberIndicacaoDeFuncionario(String mensagem) {
        return "O setor de Recursos Humanos agradece a indicação: " + mensagem;
    }
}
