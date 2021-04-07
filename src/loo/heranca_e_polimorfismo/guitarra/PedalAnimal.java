package loo.heranca_e_polimorfismo.guitarra;

public class PedalAnimal extends Pedal{
    private WahWah w = new WahWah();
    private Vibrato v = new Vibrato();

    @Override
    public void aplicaEfeito() {
        System.out.println("[início do efeito animal]");
        w.aplicaEfeito();
        v.aplicaEfeito();
        System.out.println("[fim do efeito animal]");
    }
}
