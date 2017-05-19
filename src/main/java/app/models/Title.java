package app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import app.interfaces.TitleInterface;

@Entity
public class Title implements TitleInterface {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    public Title(int _id) {
        id = _id;
    }
    public String getTitle() {
        return "";
    }
}