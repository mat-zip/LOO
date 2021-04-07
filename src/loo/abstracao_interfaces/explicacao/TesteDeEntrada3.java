package loo.abstracao_interfaces.explicacao;

import java.util.ArrayList;

public class TesteDeEntrada3 {
    private ArrayList<InputDevice> devices = new ArrayList<InputDevice>();

    public void leTodaEntrada() {
        for(InputDevice device : devices) {
            device.le();
        }
    }
}
