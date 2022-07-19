package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("Gabriela Giovanna Peixoto", "787.332.336-67");
    }

    //-----

    @Test
    void enviarSugestaoFinanceiro() {

        String mensagem = "O Atendimento agradece seu contato.\n" +
                "O Setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O setor Financeiro agradece pelo feedback: " +
                "Permitir que o funcionário possa escolher entre vale alimentação ou vale refeição.";
        assertEquals(
                mensagem,
                funcionario.enviarSugestaoFinanceiro("Permitir que o funcionário possa escolher " +
                        "entre vale alimentação ou vale refeição.")
        );
    }

    @Test
    void enviarDuvidaFinanceiro() {
        String mensagem = "A Atendimento agradece seu contato.\n" +
                "O setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>Breve o setor Financeiro enviará um e-mail respondendo a sua dúvida: Como é calculado o acerto de férias?";
        assertEquals(
                mensagem,
                funcionario.enviarDuvidaFinanceiro("Como é calculado o acerto de férias?")
        );
    }

    @Test
    void informacaoCalculoDecimoTerceiro() {
        String mensagem = "A Atendimento agradece seu contato.\n" +
                "A setor Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O cálculo do 13º salário se dá pela divisão da remuneração integral por 12 e a " +
                "multiplicação do resultado pelo número de meses trabalhados. Outras parcelas de natureza salarial, " +
                "como horas extras, adicionais (noturno, de insalubridade e de periculosidade) e " +
                "comissões também entram nesse cálculo.";
        assertEquals(
                mensagem,
                funcionario.informacaoCalculoDecimoTerceiro()
        );
    }

    @Test
    void informacaoSobreDiaPagamento() {
        String mensagem = "A Atendimento agradece seu contato.\n" +
                "A setor Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O salário do funcionário deve ser pago até o quinto dia útil do mês, " +
                "conforme dispõe o artigo 459 da CLT, em seu parágrafo primeiro: " +
                "\"Quando o pagamento houver sido estipulado por mês, deverá ser efetuado, " +
                "o mais tardar, até o quinto dia útil do mês subsequente ao vencido\"";
        assertEquals(
                mensagem,
                funcionario.informacaoSobreDiaPagamento()
        );
    }

    //-----

    @Test
    void enviarSugestaoRecursosHumanos() {
        String mensagem = "O Atendimento agradece seu contato.\n" +
                "O Setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O setor de Recursos Humanos agradece pelo feedback: " +
                "Permitir que o funcionário possa escolher entre vale alimentação ou vale refeição.";
        assertEquals(
                mensagem,
                funcionario.enviarSugestaoRecursosHumanos("Permitir que o funcionário possa escolher " +
                        "entre vale alimentação ou vale refeição.")
        );
    }

    @Test
    void enviarDuvidaRecursosHumanos() {
        String mensagem = "A Atendimento agradece seu contato.\n" +
                "O setor respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>Breve o setor de Recursos Humanos enviará um e-mail respondendo a sua dúvida: Como é calculado o acerto de férias?";
        assertEquals(
                mensagem,
                funcionario.enviarDuvidaRecursosHumanos("Como é calculado o acerto de férias?")
        );
    }

    @Test
    void enviarIndicacaoDeFuncionario() {
        String mensagem = "A Atendimento agradece seu contato.\n" +
                "A setor de Recursos Humanos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O setor de Recursos Humanos agradece a indicação: " +
                "Olá, gostaria de indicar o Adalberto José para a vaga de Chefe de Operações da empresa, obrigado.";
        assertEquals(
                mensagem,
                funcionario.enviarIndicacaoDeFuncionario("Olá, gostaria de indicar o Adalberto José " +
                        "para a vaga de Chefe de Operações da empresa, obrigado.")
        );
    }
}