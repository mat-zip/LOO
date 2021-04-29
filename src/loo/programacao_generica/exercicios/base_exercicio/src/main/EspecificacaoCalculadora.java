package loo.programacao_generica.exercicios.base_exercicio.src.main;



import loo.programacao_generica.exercicios.base_exercicio.src.pessoas.Pessoa;

import java.util.ArrayList;

/**
 * Created by andresporfirio on 04/05/17.
 */
public interface EspecificacaoCalculadora {

    public ArrayList<? extends Pessoa> uniao(ArrayList<? extends Pessoa> arr1, ArrayList<? extends Pessoa> arr2);
    public ArrayList<? extends Pessoa> interseccao(ArrayList<? extends Pessoa> arr1, ArrayList<? extends Pessoa> arr2);
    public ArrayList<? extends Pessoa> diferenca(ArrayList<? extends Pessoa> arr1, ArrayList<? extends Pessoa> arr2);
}
