package main;

import java.util.Comparator;

/**
 * Created by andresporfirio on 27/09/18.
 */
public class ComparadorReversoCachorro implements Comparator<CachorroComparavel> {
    @Override
    public int compare(CachorroComparavel o1, CachorroComparavel o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
