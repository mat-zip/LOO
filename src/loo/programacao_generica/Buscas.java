package loo.programacao_generica;

public class Buscas {
    public <T extends Comparable<T>> int binary(T[] elements, T element) {
        int menor = 0;
        int maior = elements.length - 1;
        int meio;

        while (menor <= maior) {
            meio = (menor + maior) / 2;
            if (elements[meio].compareTo(element) < 0) {
                menor = meio + 1;
            } else if (elements[meio].compareTo(element) > 0) {
                maior = meio - 1;
            } else {
                return meio;
            }
        }
        return -1;
    }
}
