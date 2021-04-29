package loo.aulas.exceptions.pesquisa;

public class Pessoa {
    private String name;
    private Integer    age;
    private Double height;

    public Pessoa(String name, Integer age, Double height) {
        if (name == null || age == null || height == null) {
            throw new IllegalArgumentException("Preencha todos os parâmetros corretamente");
        }
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
