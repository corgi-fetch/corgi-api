package app.DTOs;

import org.hibernate.validator.constraints.NotEmpty;
import java.util.List;
import javax.validation.constraints.Size;

public final class PostDTO {
    private String id;
	
	private int date;
	private UserDTO owner;
	private TitleDTO title;
	private String description;
	private double payment;
	
	private List<UserDTO> interestedQueue;
	private boolean serviceGiven;
	private boolean serviceReceived;

    public String getId() {
        return this.id;
    }

    public int getDate() {
        return this.date;
    }

    public UserDTO getOwner() {
        return this.owner;
    }

    public TitleDTO getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }
	public double getPayment() {
        return this.payment;
    }
	public List<UserDTO> getInterestedQueue() {
        return this.interestedQueue;
    }
	public boolean getServiceGiven() {
        return this.serviceGiven;
    }
	public boolean getServiceReceived() {
        return this.serviceReceived;
    }

    public void setId(String _id) {
        this.id = _id;
    }

    public void setDate(int _date) {
        this.date = _date;
    }

    public void setOwner(UserDTO _owner) {
        this.owner = _owner;
    }

    public void setTitle(TitleDTO _title) {
        this.title = _title;
    }

    public void setDescription(String _description) {
        this.description = _description;
    }
	public void setPayment(double _payment) {
        this.payment = _payment;
    }
	public void setInterestedQueue(List<UserDTO> _interestedQueue) {
        this.interestedQueue = _interestedQueue;
    }
	public void setServiceGiven(boolean _serviceGiven) {
        this.serviceGiven = _serviceGiven;
    }
	public void setServiceReceived(boolean _serviceReceived) {
        this.serviceReceived = _serviceReceived;
    }
}
