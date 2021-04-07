package loo.exceptions.exercicio;

public class ClasseA {

    public void chamarClasse() {
        try {
            System.out.println(Class.forName("c1.ClasseA"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
