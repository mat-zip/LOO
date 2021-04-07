package loo.conceitos_orientacao_objetos.abstracao;

// abstract impede que a classe seja instanciada
public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double getBonificacao();

}
