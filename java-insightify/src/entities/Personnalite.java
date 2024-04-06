package entities;

import orm.DynamicORM;
import orm.annotations.Id;

public class Personnalite extends DynamicORM<Personnalite> {
    @Id
    Integer id;
    String personnalite;

    public void insert(String personnalite) throws Exception {
        setPersonnalite(personnalite);
        this.insert();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonnalite() {
        return personnalite;
    }

    public void setPersonnalite(String personnalite) throws Exception {
        if (!personnalite.isBlank()) {
            this.personnalite = personnalite.trim();
        } else
            throw new Exception("Input vide non valide");
    }

}
