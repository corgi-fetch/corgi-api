package app.models;

import app.interfaces.TitleInterface;


public class Title implements TitleInterface {
	private Integer id;
    private String title;


    public Title() {
        
    }

    public Title(Title _title) {
        id = _title.id;
        title = _title.title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    
}