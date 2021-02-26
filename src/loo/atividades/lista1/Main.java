package loo.atividades.lista1;

public class Main {
    public static void main(String[] args) {
//        Book b1 = new Book("Irmãos Deitel", "Java como programar", 1000);
//        Book b2 = new Book("Loiane Gronner", "EDD com Javascript", 500);
//
//        b1.setNumReference("123");
//        b2.setNumReference("234");
//        b1.printDetails();
//        b2.loan();
//        b2.printDetails();

        Heater h = new Heater(3, 18);
        h.setIncrement(3);
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();//no effect
        System.out.println("Temperature:"+h.getTemperature());
        h.cool();//no effect
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();//no effect
        System.out.println("Temperature:"+h.getTemperature());
        h.warmUp();//no effect
        System.out.println("Temperature:"+h.getTemperature());




    }
}
