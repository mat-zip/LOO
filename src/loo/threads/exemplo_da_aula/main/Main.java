package loo.threads.exemplo_da_aula.main;

public class Main {

    public static void main(String[] args) {

        /*
        long timerInicio = System.currentTimeMillis();

        Tarefa1 t1 = new Tarefa1();
        //t1.run();

        Tarefa2 t2 = new Tarefa2();
        //t2.run();

        Thread tr1 = new Thread(t1);
        Thread tr2 = new Thread(t2);

        tr1.start();
        tr2.start();

        long timerFim = System.currentTimeMillis();

        while (tr1.isAlive() && tr2.isAlive());

        System.out.println("Tempo total:"+(timerFim-timerInicio));
        */

        System.out.println( escolhe('a','b',false) );
        System.out.println( escolhe(1.5f,2.5f, 2.4f) );
        System.out.println( escolhe(144,655, "1") );
    }

    private static <T,E> T escolhe(T valor1, T valor2, E valor3){
        if( valor3 instanceof Number )
            return valor1;
        else
            return valor2;
    }
}
