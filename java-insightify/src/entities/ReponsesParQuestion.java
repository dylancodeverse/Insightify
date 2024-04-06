package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class ReponsesParQuestion extends DynamicORM<ReponsesParQuestion> {
    @Id
    Integer id;
    String reponses;
    Integer questionsid;

    public void insert(String reponses, String questionsId) throws Exception {
        setQuestionsid(questionsId);
        setReponses(reponses);
        insert();
    }

    private void setQuestionsid(String questionsId2) {
        setQuestionsid(Integer.parseInt(questionsId2));
    }

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
