package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class Personnalite extends DynamicORM<Personnalite> {
    @Id
    Integer id;
    String personnalite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonnalite() {
        return personnalite;
    }

    public void setPersonnalite(String personnalite) {
        this.personnalite = personnalite;
    }

}
