package loo.conceitos_orientacao_objetos.abstracao;

import java.util.Scanner;

public class SistemaInterno {
    public void login(Autenticavel a) {
        int senha = new Scanner(System.in).nextInt();
        boolean ok = a.autentica(senha);

    }
}
