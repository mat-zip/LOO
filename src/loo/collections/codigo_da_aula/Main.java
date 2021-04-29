package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Musica m1 = new Musica(1, "Hurt", "Johnny Cash");
        Musica m2 = new Musica(2, "Suspicios Minds", "Elvis");
        Musica m3 = new Musica(3, "Infinita Highway", "Engenheiros");
        Musica m4 = new Musica(4, "Velho Casarao", "Teixeirinha");
        Musica m5 = new Musica(5, "Nothing Else Matters", "Metallica");
        Musica m5b = new Musica(5, "Nothing Else Matters", "Metallica");

        ArrayList<Musica> array = new ArrayList<>();
        array.add(m1);
        array.add(m2);
        array.add(m3);
        array.add(m4);
        array.add(m5);
        array.add(m5b);


        //Exemplo 1
        //HashSet<Musica> hs = new HashSet<>();
        //hs.addAll(array);
        //System.out.println(hs);

        //Exemplo 2
        //TreeSet<Musica> ts = new TreeSet<>(new MusicaComparator());
        //ts.addAll(array);
        //System.out.println(ts);

        //Exemplo 3
        //LinkedHashSet<Musica> lhs = new LinkedHashSet<>();
        //lhs.addAll(array);
        //System.out.println(lhs);


        //Exemplo 4
        ComparadorReversoCachorro comp = new ComparadorReversoCachorro();
        //TreeSet<CachorroComparavel> tc = new TreeSet<>(comp);
        TreeSet<CachorroComparavel> tc = new TreeSet<>();
        tc.add(new CachorroComparavel(4, "Toto"));
        tc.add(new CachorroComparavel(5, "Arnold"));
        tc.add(new CachorroComparavel(4, "Toto"));
        tc.add(new CachorroComparavel(1, "Dog"));

        System.out.println(tc);
    }
}
