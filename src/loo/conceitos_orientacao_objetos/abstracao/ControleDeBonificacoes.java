package loo.conceitos_orientacao_objetos.abstracao;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        System.out.println("Adicionando bonificação do funcionário");
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}
