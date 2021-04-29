package main;

import java.util.Comparator;

/**
 * Created by andresporfirio on 27/09/18.
 */
public class MusicaComparator implements Comparator<Musica>{
    @Override
    public int compare(Musica o1, Musica o2) {
        if(o1.getId() > o2.getId())
            return 1;
        else if (o1.getId() < o2.getId())
            return -1;
        return 0;
    }
}
