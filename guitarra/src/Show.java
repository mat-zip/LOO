public class Show {
    private Amplificador amp;
    private Guitarra guitarra;
    private Pedal pedal;

    public Show(){
        guitarra = new Guitarra();
        pedal = new Pedal();

        amp = new Amplificador(guitarra, pedal);
    }
    public void exercicio4(){
        amp.reproduzirSom();
    }

    public void exercicio6(){
        amp.reproduzirSom();
        System.out.println();

        amp.setPedal(new WhaWha());
        amp.reproduzirSom();
        System.out.println();

        amp.setPedal(new Vibrato());
        amp.reproduzirSom();
    }

    public void exercicio8(){
        amp.setPedal(new PedalAnimal());
        amp.reproduzirSom();
    }

}
