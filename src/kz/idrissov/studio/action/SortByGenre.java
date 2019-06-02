package kz.idrissov.studio.action;

import kz.idrissov.studio.entity.Composition;

import java.util.Comparator;

public class SortByGenre implements Comparator<Composition> {
    @Override
    public int compare(Composition o1, Composition o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
