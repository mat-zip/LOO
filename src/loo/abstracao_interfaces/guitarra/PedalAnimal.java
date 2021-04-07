package loo.abstracao_interfaces.guitarra;
public class PedalAnimal implements Pedal{
    private WahWah w = new WahWah();
    private Vibrato v = new Vibrato();

    public void aplicaEfeito() {
        System.out.println("[início do efeito animal]");
        w.aplicaEfeito();
        v.aplicaEfeito();
        System.out.println("[fim do efeito animal]");
    }
}
