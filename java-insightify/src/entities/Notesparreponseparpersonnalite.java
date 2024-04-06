package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class Notesparreponseparpersonnalite extends DynamicORM<Notesparreponseparpersonnalite> {

    @Id
    Integer id;
    Integer reponsesparquestion;
    Integer personnalite;
    Double note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReponsesparquestion() {
        return reponsesparquestion;
    }

    public void setReponsesparquestion(Integer reponsesparquestion) {
        this.reponsesparquestion = reponsesparquestion;
    }

    public Integer getPersonnalite() {
        return personnalite;
    }

    public void setPersonnalite(Integer personnalite) {
        this.personnalite = personnalite;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }
}
