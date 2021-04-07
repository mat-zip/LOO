package loo.abstracao_interfaces.explicacao;

import java.util.ArrayList;

public class TesteDeEntrada2 {
    private ArrayList<Mouse> mouses = new ArrayList<Mouse>();
    private ArrayList<Teclado> teclados = new ArrayList<Teclado>();
    private ArrayList<Microfone> microfones = new ArrayList<Microfone>();

    public void leTodaEntrada() {
        for(Mouse m : mouses)
            m.le();
        for(Teclado t : teclados)
            t.le();
        for(Microfone m: microfones)
            m.le();
    }
}
