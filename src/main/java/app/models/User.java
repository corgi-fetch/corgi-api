package app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import app.interfaces.UserInterface;

@Entity
public class User implements UserInterface{

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    public User(int _id) {
        id = _id;
    }

    public int getRating() {
        return 0;
    }
}