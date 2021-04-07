package loo.abstracao_interfaces.lista_de_exercicios;

public abstract class Construcao implements ImpostoMunicipal{

    protected int numeroAlvara;

    public Construcao(int numeroAlvara) {
        this.numeroAlvara = numeroAlvara;
    }

    public abstract double calculaAltura();
    public abstract double calculaIPTU();

    /**
     * Nao altere o metodo toString.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (Alvará: "+numeroAlvara+")";
    }
}
