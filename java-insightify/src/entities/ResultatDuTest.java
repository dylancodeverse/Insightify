package entities;

public class ResultatDuTest {
    NoteParPersonnalite[] noteParPersonnalites;

    public void setNoteParPersonnalite(String[] choixReponse) throws Exception {
        // gestion exception
        if (choixReponse.length == 0 || choixReponse == null) {
            throw new Exception("Aucune reponse pour 0 choix");
        }
        // cast String [] to Integer []
        Integer[] is = new Integer[choixReponse.length];
        for (int i = 0; i < is.length; i++) {
            is[i] = Integer.parseInt(choixReponse[i]);
        }
        // get SQL to invoke
        String sql = getSQLForCalculation(is);

        System.out.println(sql);
        // invoke the result
        setNoteParPersonnalites(new NoteParPersonnalite().select(sql));
    }

    public String getSQLForCalculation(Integer[] is) {
        String s = "select personnalite , avg(note) as noteGenerale from Completnotesparreponseparpersonnalite where ";
        for (Integer integer : is) {
            s += "reponsesparquestion =" + integer + " or ";
        }
        s = s.substring(0, s.lastIndexOf("or"));

        s += " group by personnalite order by noteGenerale desc , personnalite asc";

        return s;

    }

    public String getPersonnaliteLePlusProbable() {
        return noteParPersonnalites[0].getPersonnalite();
    }

    public Double getNotePersonnaliteLePlusProbable() {
        return noteParPersonnalites[0].getNoteGenerale();
    }

    public NoteParPersonnalite[] getNoteParPersonnalites() {
        return noteParPersonnalites;
    }

    public void setNoteParPersonnalites(NoteParPersonnalite[] noteParPersonnalites) {
        this.noteParPersonnalites = noteParPersonnalites;
    }
}
