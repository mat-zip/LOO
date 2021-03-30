package loo.aulas.exceptions.conta_bancaria;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ContaBancaria conta_corrente = new ContaBancaria("MATHEUS",1000);
            ContaBancaria conta_bancaria = new ContaBancaria("ROCHA", 1200);

            conta_corrente.saca(1000);
            conta_bancaria.saca(1000);


            conta_bancaria.deposita(200);

        } catch (SaldoIsuficienteException e) {
            System.out.println(e.getMessage());

        } catch (CaractereNaoELetraException e){
            System.out.println(e.getMessage());

        } catch(LetraNaoEMaiusculaException e) {
            System.out.println(e.getMessage());

        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }catch (SaldoNegativoException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            //Finalizando seção...
        }

    }
}
