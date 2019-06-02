package kz.idrissov.studio.entity;

import kz.idrissov.studio.action.SortByGenre;

import java.util.ArrayList;
import java.util.Collections;

public class CDDisc extends Disc{
    public static final int MAX_MEMORY = 1800;

    public CDDisc(String name) {
        super(name);
    }

    public void sort() {
        Collections.sort(getCompositions(), new SortByGenre());
    }

    @Override
    public int getOccupiedInSecs() {
        return super.getOccupiedInSecs();
    }

    @Override
    public void setOccupiedInSecs(int occupiedInSecs) {
        super.setOccupiedInSecs(occupiedInSecs);
    }

    @Override
    public ArrayList<Composition> getCompositions() {
        return super.getCompositions();
    }

    @Override
    public void setCompositions(ArrayList<Composition> compositions) {
        super.setCompositions(compositions);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
