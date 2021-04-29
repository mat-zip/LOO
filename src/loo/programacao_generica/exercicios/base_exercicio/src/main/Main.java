package loo.programacao_generica.exercicios.base_exercicio.src.main;

import loo.programacao_generica.exercicios.base_exercicio.src.pessoas.Estudante;
import loo.programacao_generica.exercicios.base_exercicio.src.pessoas.Pessoa;
import loo.programacao_generica.exercicios.base_exercicio.src.pessoas.Trabalhador;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    private Calculadora calculadora;

    public Main(){
        calculadora = new Calculadora();

        System.out.println(teste1());
        //Saida esperada:
        //        [
        //        ESTUDANTE:fulano		CPF:1000	RA:4401,
        //        ESTUDANTE:ciclano		CPF:1001	RA:4402,
        //        TRABALHADOR:beltrano	CPF:2000	CTPS:800,
        //        ESTUDANTE:seltrano		CPF:2001	RA:4403]

        System.out.println(teste2());
        //Saida esperada:
        //        [
        //        ESTUDANTE:seltrano		CPF:2001	RA:4403]

        System.out.println(teste3());
        //Saida esperada:
        //        [
        //        ESTUDANTE:fulano		CPF:1000	RA:4401,
        //        ESTUDANTE:ciclano		CPF:1001	RA:4402]

    }

    private ArrayList<? extends Pessoa> teste1(){
        ArrayList<Estudante> arr1 = new ArrayList<>();
        arr1.add(new Estudante(1000,"fulano",4401));
        arr1.add(new Estudante(1001,"ciclano",4402));
        arr1.add(new Estudante(1001,"ciclano2",4402));
        arr1.add(new Estudante(2001,"seltrano",4403));
        arr1.add(new Estudante(2001,"seltrano2",4403));

        ArrayList<Trabalhador> arr2 = new ArrayList<>();
        arr2.add(new Trabalhador(2000,"beltrano",800));
        arr2.add(new Trabalhador(2001,"seltrano",801));
        arr2.add(new Trabalhador(2000,"beltrano2",800));
        arr2.add(new Trabalhador(2001,"seltrano2",801));

        return calculadora.uniao(arr1,arr2);
    }

    private ArrayList<? extends Pessoa> teste2(){
        ArrayList<Estudante> arr1 = new ArrayList<>();
        arr1.add(new Estudante(1000,"fulano",4401));
        arr1.add(new Estudante(1001,"ciclano",4402));
        arr1.add(new Estudante(1001,"ciclano2",4402));
        arr1.add(new Estudante(2001,"seltrano",4403));
        arr1.add(new Estudante(2001,"seltrano2",4403));

        ArrayList<Trabalhador> arr2 = new ArrayList<>();
        arr2.add(new Trabalhador(2000,"beltrano",800));
        arr2.add(new Trabalhador(2001,"seltrano",801));
        arr2.add(new Trabalhador(2000,"beltrano2",800));
        arr2.add(new Trabalhador(2001,"seltrano2",801));

        return calculadora.interseccao(arr1,arr2);
    }

    private ArrayList<? extends Pessoa> teste3(){
        ArrayList<Estudante> arr1 = new ArrayList<>();
        arr1.add(new Estudante(1000,"fulano",4401));
        arr1.add(new Estudante(1001,"ciclano",4402));
        arr1.add(new Estudante(1001,"ciclano2",4402));
        arr1.add(new Estudante(2001,"seltrano",4403));
        arr1.add(new Estudante(2001,"seltrano2",4403));

        ArrayList<Trabalhador> arr2 = new ArrayList<>();
        arr2.add(new Trabalhador(2000,"beltrano",800));
        arr2.add(new Trabalhador(2001,"seltrano",801));
        arr2.add(new Trabalhador(2000,"beltrano2",800));
        arr2.add(new Trabalhador(2001,"seltrano2",801));

        return calculadora.diferenca(arr1,arr2);
    }
}
