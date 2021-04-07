package loo.conceitos_orientacao_objetos.interfaces;

public class BancoRemoto implements BancoDeDados, ConexaoTCPIP{
    private String dados;

    public BancoRemoto() {
        System.out.println("Inicializado o banco Remoto");
        conectaViaTCPIP();
    }

    @Override
    public void conectaViaTCPIP() {
        System.out.println("Conectando via TCP/IP");
    }

    @Override
    public void gravar(String dados) {
        this.dados = dados;
        System.out.println("Banco Local: gravando " + dados);
    }

    @Override
    public void ler() {
        System.out.println("Banco Local lendo: " + dados);
    }
}
