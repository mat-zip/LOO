package loo.exceptions.conta_bancaria;

public class Main {

    public static void main(String[] args) {
	    Conta c = new Conta();
	    c.deposita(100);
	    c.setLimite(100);

        System.out.println(c);

        //c.saca(100);

        try {
            c.saca(1000);
        }catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println(c);
    }
}
