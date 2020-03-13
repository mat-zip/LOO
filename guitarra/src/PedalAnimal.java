public class PedalAnimal extends Pedal{
    private Pedal whawha = new WhaWha();
    private Pedal vibrato = new Vibrato();

    public void aplicaEfeito(){
        System.out.println("Inicio do efeito animal");
        whawha.aplicaEfeito();
        vibrato.aplicaEfeito();
        System.out.println("Fim do efeito animal");
    }
}
