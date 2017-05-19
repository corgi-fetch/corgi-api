package app.models;

import app.interfaces.*;
//import java.util.PriorityQueue;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post implements PostInterface {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private final int date = 1;
	@ManyToOne(targetEntity = User.class)
	private UserInterface owner;
	@ManyToOne(targetEntity = Title.class)
	private TitleInterface title;
	private String description;
	private double payment;
	@OneToMany(targetEntity = User.class)
	private Set<UserInterface> interestedQueue;
	private boolean serviceGiven;
	private boolean serviceReceived;

	public Post() {

	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public int getDate() {
		return date;
	}

	public void setOwner(UserInterface _owner) {
		this.owner = _owner;
	}

	public UserInterface getOwner() {
		return this.owner;
	}

	public void setTitle(TitleInterface _title) {
		this.title = _title;
	}

	public String getTitle() {
		return this.title.getTitle();
	}

	public void setDescription(String _description) {
		this.description = _description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setPayment(double _payment) {
		this.payment = _payment;
	}

	public double getPayment() {
		return this.payment;
	}

	public void addInterested(UserInterface _interested) {
		this.interestedQueue.add(_interested);
	}

	public Set<UserInterface> getInterested() {
		return this.interestedQueue;
	} 

	public void setServiceGiven(boolean _serviceGiven) {
		this.serviceGiven = _serviceGiven;
	}

	public boolean getServiceGiven() {
		return this.serviceGiven;
	}

	public void setServiceReceived(boolean _serviceReceived) {
		this.serviceReceived = _serviceReceived;
	}

	public boolean getServiceReceived() {
		return this.serviceReceived;
	}
}