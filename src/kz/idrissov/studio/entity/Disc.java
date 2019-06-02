package kz.idrissov.studio.entity;

import java.util.ArrayList;

public class Disc {
    public static final int MAX_MEMORY = 1000;
    private String name;
    private int occupiedInSecs;
    private ArrayList<Composition> compositions;

    public Disc(String name) {
        this.name = name;
        occupiedInSecs = 0;
        compositions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOccupiedInSecs() {
        return occupiedInSecs;
    }

    public void setOccupiedInSecs(int occupiedInSecs) {
        this.occupiedInSecs = occupiedInSecs;
    }

    public ArrayList<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(ArrayList<Composition> compositions) {
        this.compositions = compositions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(name + ": \n");
        for(Composition comp : compositions) {
            sb.append(comp.toString() + "\n");
        }
        return sb.toString();
    }
}
