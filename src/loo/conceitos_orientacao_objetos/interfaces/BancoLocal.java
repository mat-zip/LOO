package loo.conceitos_orientacao_objetos.interfaces;

public class BancoLocal implements BancoDeDados, ConexaoFileIO{
    private String dados;

    public BancoLocal() {
        System.out.println("Inicializado o banco Local");
    }

    @Override
    public void gravar(String dados) {
        this.dados = dados;
        abrirArquivo("database.db");
        System.out.println("Banco Local: gravando " + dados);
        fecharArquivo();
    }

    @Override
    public void ler() {
        abrirArquivo("database.db");
        System.out.println("Banco Local lendo: " + dados);
        fecharArquivo();
    }

    @Override
    public void abrirArquivo(String nomeDoArquivo) {
        System.out.println("Abrindo o arquivo: " + nomeDoArquivo);
    }

    @Override
    public void fecharArquivo() {
        System.out.println("Fechando todos os arquivos abertos");
    }
}
