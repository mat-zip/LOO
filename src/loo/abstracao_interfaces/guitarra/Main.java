package loo.abstracao_interfaces.guitarra;

public class Main {
    public static void main(String[] args) {
//        exercicio4();
//        exercicio6();
        exercicio8();
    }

    public static void exercicio4() {
        Guitarra g = new Guitarra();
        Pedal p = new WahWah();

        Amplificador amp = new Amplificador(g, p);
        amp.reproduzirSom();
    }

    public static void exercicio6() {
        Guitarra g = new Guitarra();
        Pedal p = new Vibrato();
        Amplificador amp = new Amplificador(g,p);

        amp.reproduzirSom();

        amp.setPedal(new WahWah());
        amp.reproduzirSom();

        amp.setPedal(new Vibrato());
        amp.reproduzirSom();
    }

    public static void exercicio8(){
        Guitarra g = new Guitarra();
        Pedal p = new PedalAnimal();
        Amplificador amp = new Amplificador(g,p);

        amp.reproduzirSom();
    }
}
