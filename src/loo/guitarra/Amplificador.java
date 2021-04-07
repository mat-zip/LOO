package loo.guitarra;

public class Amplificador {
    private Guitarra guitarra;
    private Pedal pedal;

    public Amplificador(Guitarra guitarra, Pedal pedal){
        this.guitarra = guitarra;
        this.pedal = pedal;
    }

    public void setPedal(Pedal pedal){
        this.pedal = pedal;
    }

    public void reproduzirSom(){
        guitarra.tocar();
        pedal.aplicaEfeito();
    }

}
