package entities;

import orm.DynamicORM;

public class Questionreponses extends DynamicORM<Questionreponses> {
    Integer questionsid;
    String questions;
    Integer[] reponsesids;
    String[] reponses;

    public Integer getQuestionsid() {
        return questionsid;
    }

    public void setQuestionsid(Integer questionsid) {
        this.questionsid = questionsid;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public Integer[] getReponsesids() {
        return reponsesids;
    }

    public void setReponsesids(String reponsesids) {
        String[] ss = reponsesids.split("fakooo");
        Integer[] is = new Integer[ss.length];
        for (int i = 0; i < is.length; i++) {
            is[i] = Integer.parseInt(ss[i]);
        }
        this.reponsesids = is;
    }

    public String[] getReponses() {
        return reponses;
    }

    public void setReponses(String reponses) {
        this.reponses = reponses.split("fakooo");
    }
}
