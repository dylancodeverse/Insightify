package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class Questions extends DynamicORM<Questions> {
    @Id
    Integer id;
    String questions;

    public void insert(String questions) throws Exception {
        setQuestions(questions);
        insert();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) throws Exception {
        if (questions.isBlank()) {
            throw new Exception("Input vide non valide");
        }
        this.questions = questions;
    }
}
