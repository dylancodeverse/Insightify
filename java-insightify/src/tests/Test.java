package tests;

import entities.Personnalite;
import entities.Questions;
import entities.ReponsesParQuestion;

public class Test {

    public static void main(String[] args) throws Exception {
        insertReponsesPossibleParQuestion();
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
