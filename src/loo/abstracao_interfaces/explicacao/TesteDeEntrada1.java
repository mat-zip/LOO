package loo.abstracao_interfaces.explicacao;

import java.util.ArrayList;

public class TesteDeEntrada1 {

    private ArrayList<InputDevice> devices = new ArrayList<InputDevice>();


    public void leTodaEntrada() {
        for(InputDevice device : devices) {
            if(device instanceof Mouse){
                ((Mouse) device).le();
            }
            if (device instanceof Teclado){
                ((Teclado) device).le();
            }
            if(device instanceof Microfone){
                ((Microfone) device).le();
            }
        }
    }

}
