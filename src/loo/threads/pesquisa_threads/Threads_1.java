package loo.threads.pesquisa_threads;

public class Threads_1 {
    public static void main(String[] args) {
        //Retorna a Thread que eu estou executando no momento
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        //Nova Thread
        Thread t1 = new Thread(new MeuRunnable());

        //Quando eu chamo o método start(), eu estou instruindo a minha JVM
        //para que ela chame o método run() dessa thread quando for possível

        //t1.run(); Apenas executando na mesma Thread
        t1.start(); //Executando em uma nova Thread

        //Runnable como lambda
        Thread t2 = new Thread(() -> System.out.println("Inscrevase no canal"));
        t2.start();
        //t2.start(); <- ⚠⚠ EU NÃO POSSO FAZER ISSO ⚠⚠
        //Eu não posso iniciar a mesma thread mais de uma vez
        //


    }
}
