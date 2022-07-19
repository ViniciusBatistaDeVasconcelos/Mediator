package model;

public class Financeiro implements Setor {

    private static Financeiro instancia = new Financeiro();

    private Financeiro() {
    }

    public static Financeiro getInstancia() {
        return instancia;
    }

    public String receberSugestao(String mensagem) {
        return "O setor Financeiro agradece pelo feedback: " + mensagem;
    }

    public String receberDuvida(String mensagem) {
        return "Breve o setor Financeiro enviará um e-mail respondendo a sua dúvida: " + mensagem;
    }

    public String enviarInformacaoCalculoDecimoTerceiro() {
        return "O cálculo do 13º salário se dá pela divisão da remuneração integral por 12 " +
                "e a multiplicação do resultado pelo número de meses trabalhados. " +
                "Outras parcelas de natureza salarial, como horas extras, adicionais " +
                "(noturno, de insalubridade e de periculosidade) e comissões também entram nesse cálculo.";
    }

    public String enviarInformacaoSobreDiaPagamento() {
        return "O salário do funcionário deve ser pago até o quinto dia útil do mês, " +
                "conforme dispõe o artigo 459 da CLT, em seu parágrafo primeiro: " +
                "\"Quando o pagamento houver sido estipulado por mês, deverá ser efetuado, " +
                "o mais tardar, até o quinto dia útil do mês subsequente ao vencido\"";
    }
}
