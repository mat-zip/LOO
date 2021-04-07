package loo.abstracao_interfaces.lista_de_exercicios;

public class PredioLitoraneo extends Predio implements ImpostoMunicipal{

    protected double distanciaDoMar;

    public PredioLitoraneo(int numeroAlvara, int numeroAndares, double distanciaDoMar) {
        super(numeroAlvara, numeroAndares);
        this.distanciaDoMar = distanciaDoMar;
    }

    public double calculaAltura() {
        return this.numeroAndares * 2.9;
    }

    @Override
    public double calculaIPTU() {
        return this.numeroAndares * 200;
    }
}
