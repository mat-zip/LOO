package main;

/**
 * Created by andresporfirio on 27/09/18.
 */
public class Musica {
    private int id;
    private String titulo;
    private String cantor;

    public Musica(int id, String titulo, String cantor) {
        this.id = id;
        this.titulo = titulo;
        this.cantor = cantor;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", cantor='" + cantor + '\'' +
                "}\n";
    }

}
