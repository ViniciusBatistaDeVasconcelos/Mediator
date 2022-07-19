package model;

public class Funcionario {
    public String nome;
    public String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //-----

    public String enviarSugestaoFinanceiro(String mensagem) {
        return Atendimento.getInstancia().receberSugestao(mensagem, Financeiro.getInstancia());
    }

    public String enviarDuvidaFinanceiro(String mensagem) {
        return Atendimento.getInstancia().receberDuvida(mensagem, Financeiro.getInstancia());
    }

    public String informacaoCalculoDecimoTerceiro() {
        return Atendimento.getInstancia().enviarInformacaoCalculoDecimoTerceiro();
    }

    public String informacaoSobreDiaPagamento() {
        return Atendimento.getInstancia().enviarInformacaoSobreDiaPagamento();
    }

    //-----

    public String enviarSugestaoRecursosHumanos(String mensagem) {
        return Atendimento.getInstancia().receberSugestao(mensagem, RecursosHumanos.getInstancia());
    }

    public String enviarDuvidaRecursosHumanos(String mensagem) {
        return Atendimento.getInstancia().receberDuvida(mensagem, RecursosHumanos.getInstancia());
    }

    public String enviarIndicacaoDeFuncionario(String mensagem) {
        return Atendimento.getInstancia().receberIndicacaoDeFuncionario(mensagem);
    }
}
