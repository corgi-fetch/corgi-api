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
    private String title;


    public Title() {
        
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    
}