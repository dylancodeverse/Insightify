package tests;

import entities.Notesparreponseparpersonnalite;
import entities.Personnalite;
import entities.Questions;
import entities.ReponsesParQuestion;

public class Test {

    public static void main(String[] args) throws Exception {
        assignationDesNotesParQuestionSelonPersonnalite();
    }

    public static void assignationDesNotesParQuestionSelonPersonnalite() throws Exception {
        new Notesparreponseparpersonnalite().insert("1", "1", "0.0");
    }

    public static void insertReponsesPossibleParQuestion() throws Exception {
        new ReponsesParQuestion().insert("Je ne sais pas", "1");
    }

    public static void insertPersonnalite() throws Exception {
        new Personnalite().insert("Parent");
    }

    public static void insertQuestions() throws Exception {
        new Questions().insert("Etes ou plutot choco ou fraise");
    }
}
