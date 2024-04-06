package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class Questions extends DynamicORM<Questions> {
    @Id
    Integer id;
    String questions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }
}
