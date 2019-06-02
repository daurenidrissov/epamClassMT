package kz.idrissov.studio.action;

import kz.idrissov.studio.entity.CDDisc;
import kz.idrissov.studio.entity.Composition;
import kz.idrissov.studio.exception.OutOfMemoryException;
import kz.idrissov.studio.exception.ReRecordingException;

import java.util.ArrayList;

public class CDDiscAction {
    public static void addToDisc(Composition comp, CDDisc cd) throws OutOfMemoryException, ReRecordingException {
        if(cd.getOccupiedInSecs() + comp.getDurationInSec() > cd.MAX_MEMORY) {
            throw new OutOfMemoryException("Not enough memory on disc!");
        }
        for(Composition c : cd.getCompositions()) {
            if(c.equals(comp)) {
                throw new ReRecordingException("Such composition exists in the disc!");
            }
        }
        cd.getCompositions().add(comp);
        cd.setOccupiedInSecs(cd.getOccupiedInSecs() + comp.getDurationInSec());
    }

    public static ArrayList<Composition> findByDurationRange(CDDisc cd, int min, int max) {
        ArrayList<Composition> result = new ArrayList<>();
        for(Composition comp : cd.getCompositions()) {
            if(comp.getDurationInSec() >= min && comp.getDurationInSec() <= max) {
                result.add(comp);
            }
        }
        return result;
    }
}
