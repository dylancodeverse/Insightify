package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class ReponsesParQuestion extends DynamicORM<ReponsesParQuestion> {
    @Id
    Integer id;
    String reponses;
    Integer questionsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReponses() {
        return reponses;
    }

    public void setReponses(String reponses) {
        this.reponses = reponses;
    }

    public Integer getQuestionsid() {
        return questionsid;
    }

    public void setQuestionsid(Integer questionsid) {
        this.questionsid = questionsid;
    }

}
