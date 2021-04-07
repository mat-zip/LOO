package loo.conceitos_orientacao_objetos.classeobjeto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();

        empresa1.setNome("Kapchuk Empreendimentos");
        empresa1.setCnpj("13.456.123/0001-21");
        empresa1.setDataFundacao(new Date());
        empresa1.setEndereco("Avenida do Estado, 561");
        empresa1.setFaturamento(5000000);
        empresa1.imprimir();

        Empresa empresa2 = new Empresa();
        empresa2.setNome("Camila Finanças");
        empresa2.setCnpj("55.874.999/0001-45");
        empresa2.setDataFundacao(new Date());
        empresa2.setEndereco("Rua Dubai, 561");
        empresa2.setFaturamento(700000);
        empresa2.imprimir();


        Empresa empresa3 = new Empresa();
        empresa3.setNome("Camila Finanças");
        empresa3.setCnpj("55.874.999/0001-45");
        empresa3.setDataFundacao(new Date());
        empresa3.setEndereco("Rua Dubai, 561");
        empresa3.setFaturamento(700000);
        empresa3.imprimir();
    }
}
