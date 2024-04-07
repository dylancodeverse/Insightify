package entities;

import orm.DynamicORM;

public class NoteParPersonnalite extends DynamicORM<NoteParPersonnalite> {
    String personnalite;
    Double noteGenerale; 

    public String getPersonnalite() {
        return personnalite;
    }

    public void setPersonnalite(String personnalite) {
        this.personnalite = personnalite;
    }

    public Double getNoteGenerale() {
        return noteGenerale;
    }

    public void setNoteGenerale(Double noteGenerale) {

        this.noteGenerale = noteGenerale * 100.;
    }
}
