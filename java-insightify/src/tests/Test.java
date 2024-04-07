package tests;

import entities.Notesparreponseparpersonnalite;
import entities.Personnalite;
import entities.Questions;
import entities.ReponsesParQuestion;
import entities.ResultatDuTest;

public class Test {

    public static void main(String[] args) throws Exception {
        // assignationDesNotesParQuestionSelonPersonnalite();
        getResult();
    }

    public static void getResult() throws Exception {
        new ResultatDuTest().setNoteParPersonnalite(new String[] { "2", "1" });
    }

    public static void assignationDesNotesParQuestionSelonPersonnalite() throws Exception {
        new Notesparreponseparpersonnalite().insert("2", "1", "0.4");
    }

    public static void insertReponsesPossibleParQuestion() throws Exception {
        new ReponsesParQuestion().insert("Bonbon", "2");
    }

    public static void insertPersonnalite() throws Exception {
        new Personnalite().insert("Enfant");
    }

    public static void insertQuestions() throws Exception {
        new Questions().insert("Etes ou plutot glace ou bonbon");
    }
}
