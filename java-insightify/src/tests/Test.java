package tests;

import entities.Notesparreponseparpersonnalite;
import entities.Personnalite;
import entities.Questionreponses;
import entities.Questions;
import entities.ReponsesParQuestion;
import entities.ResultatDuTest;

public class Test {

    public static void main(String[] args) throws Exception {
        // assignationDesNotesParQuestionSelonPersonnalite();
        questionnaires();
    }

    // donnees pour les questionnaires

    public static void questionnaires() throws Exception {
        new Questionreponses().select();
    }

    // affich
    public static void getResult() throws Exception {
        ResultatDuTest rs = new ResultatDuTest();
        rs.setNoteParPersonnalite(new String[] { "2", "1" });
        System.out.println(rs.getPersonnaliteLePlusProbable() + " avec une note de: "
                + rs.getNotePersonnaliteLePlusProbable() + "/100 (meilleur score parmi les autres)");
    }

    // les notes possibles pour chaque reponse choisie
    public static void assignationDesNotesParQuestionSelonPersonnalite() throws Exception {
        new Notesparreponseparpersonnalite().insert("2", "1", "0.4");
    }

    // choisir les reponses possible pour chaque question
    public static void insertReponsesPossibleParQuestion() throws Exception {
        new ReponsesParQuestion().insert("Bonbon", "2");
    }

    // nouvelle personnalite (mety tsy de ilaina)
    public static void insertPersonnalite() throws Exception {
        new Personnalite().insert("Enfant");
    }

    // nouvelles questions
    public static void insertQuestions() throws Exception {
        new Questions().insert("Etes ou plutot glace ou bonbon");
    }
}
