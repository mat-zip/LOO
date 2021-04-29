package loo.programacao_generica.exercicios.base_exercicio.src.main;

import loo.programacao_generica.exercicios.base_exercicio.src.pessoas.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class Calculadora<T> implements EspecificacaoCalculadora{
    @Override
    public ArrayList<? extends Pessoa> uniao(ArrayList<? extends Pessoa> arr1, ArrayList<? extends Pessoa> arr2) {
        Collection<Pessoa> aux = new TreeSet<>(arr1);
        aux.addAll(arr2);
        return arr1;
    }

    @Override
    public ArrayList<? extends Pessoa> interseccao(ArrayList<? extends Pessoa> arr1, ArrayList<? extends Pessoa> arr2) {
        return null;
    }

    @Override
    public ArrayList<? extends Pessoa> diferenca(ArrayList<? extends Pessoa> arr1, ArrayList<? extends Pessoa> arr2) {
        return null;
    }
}
