package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class Notesparreponseparpersonnalite extends DynamicORM<Notesparreponseparpersonnalite> {

    @Id
    Integer id;
    Integer reponsesparquestion;
    Integer personnalite;
    Double note;

    public void insert(String reponsesParQuestion, String personnalite, String note)
            throws NumberFormatException, Exception {
        setReponsesparquestion(reponsesParQuestion);
        setPersonnalite(personnalite);
        setNote(note);
        insert();
    }

    private void setNote(String note2) throws NumberFormatException, Exception {
        setNote(Double.parseDouble(note2));
    }

    private void setPersonnalite(String personnalite2) {
        setPersonnalite(Integer.parseInt(personnalite2));
    }

    private void setReponsesparquestion(String reponsesParQuestion2) {
        setReponsesparquestion(Integer.parseInt(reponsesParQuestion2));
    }

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

    public void setNote(Double note) throws Exception {
        if (0 <= note && note <= 1) {
            this.note = note;
        } else {
            throw new Exception("Le format du note doit etre entre 0 a 1");
        }
    }
}
