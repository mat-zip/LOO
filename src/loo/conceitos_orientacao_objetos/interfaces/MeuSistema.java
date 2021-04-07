package loo.conceitos_orientacao_objetos.interfaces;

public class MeuSistema {
    public MeuSistema(boolean usarBancoLocal) {
        System.out.println("Sistema inicializado");

        BancoDeDados db;

        if ( usarBancoLocal ) {
            db = new BancoLocal();
        } else {
            db = new BancoRemoto();
        }

        db.gravar("nome=Matheus");
        db.ler();
    }
}
