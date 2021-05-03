package loo.threads.exemplo_da_aula.main;

/**
 * Created by andresporfirio on 05/05/17.
 */
public class Tarefa2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("B");
        }
    }
}
