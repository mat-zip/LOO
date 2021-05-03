package loo.threads.exemplo_threads_pi_calculator;

public class TarefaPesadaPi implements Runnable{
    @Override
    public void run() {
        System.out.println( PiCalculator.calc(100000000) );
    }
}
