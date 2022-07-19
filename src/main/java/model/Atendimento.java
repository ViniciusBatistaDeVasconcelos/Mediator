package model;

public class Atendimento {

    private static Atendimento instancia = new Atendimento();

    private Atendimento() {
    }

    public static Atendimento getInstancia() {
        return instancia;
    }

    public String receberSugestao(String mensagem, Setor setor) {
        return "O Atendimento agradece seu contato.\n" +
                "O Setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + setor.receberSugestao(mensagem);
    }

    public String receberDuvida(String mensagem, Setor setor) {
        return "A Atendimento agradece seu contato.\n" +
                "O setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + setor.receberDuvida(mensagem);
    }

    //-----

    public String enviarInformacaoCalculoDecimoTerceiro() {
        return "A Atendimento agradece seu contato.\n" +
                "A setor Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Financeiro.getInstancia().enviarInformacaoCalculoDecimoTerceiro();
    }

    public String enviarInformacaoSobreDiaPagamento() {
        return "A Atendimento agradece seu contato.\n" +
                "A setor Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Financeiro.getInstancia().enviarInformacaoSobreDiaPagamento();
    }

    public String receberIndicacaoDeFuncionario(String mensagem) {
        return "A Atendimento agradece seu contato.\n" +
                "A setor de Recursos Humanos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RecursosHumanos.getInstancia().receberIndicacaoDeFuncionario(mensagem);
    }
}
