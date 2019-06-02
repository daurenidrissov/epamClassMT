package kz.idrissov.studio;

import kz.idrissov.studio.entity.CDDisc;
import kz.idrissov.studio.entity.Composition;
import kz.idrissov.studio.exception.OutOfMemoryException;
import kz.idrissov.studio.exception.ReRecordingException;

import java.util.ArrayList;
import java.util.Arrays;

import static kz.idrissov.studio.action.CDDiscAction.addToDisc;
import static kz.idrissov.studio.action.CDDiscAction.findByDurationRange;

public class main {
    public static void main(String[] args) throws OutOfMemoryException, ReRecordingException {
        Composition c1 = new Composition("Eminem", "Mockingbird", "Eminem", "LastAlbum", "Rap", 120);
        Composition c2 = new Composition("Tanir", "Zachem", "Kraim", "DGJ", "Rap", 102);
        Composition c3 = new Composition("Noize MC", "Horosho", "Galustyan", "Novii Mir", "Hip-Hop", 209);
        CDDisc disc1 = new CDDisc("Mixed Disc");
        CDDisc disc2 = new CDDisc("Only Rap Disc");

        addToDisc(c1, disc1);
        addToDisc(c2, disc2);
        addToDisc(c3, disc1);
        addToDisc(c1, disc2);
        addToDisc(c2, disc1);

        System.out.println(disc1.toString());
        System.out.println(disc2.toString());

        System.out.println(disc1.getOccupiedInSecs());
        System.out.println(disc2.getOccupiedInSecs());
        System.out.println();

        disc1.sort();
        System.out.println(disc1.toString());

        ArrayList<Composition> cd = findByDurationRange(disc1, 113, 251);
        System.out.println(Arrays.toString(cd.toArray()));

    }
}
