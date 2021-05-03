package loo.threads.outro_exemplo;

import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                executa("Interface", 2);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                executa("Banco de Dados", 4);
            }
        });

        t1.start();
        t2.start();

        System.out.println("Programa Principal");
    }

    private void executa(String s, int segundos){
        System.out.println("inicio "+s);
        try {
            TimeUnit.SECONDS.sleep(segundos);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("fim "+s);
    }
}