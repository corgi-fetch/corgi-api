package app.models;

import app.interfaces.*;
import java.util.PriorityQueue;

public class Post implements PostInterface {
	private final long id = 0;
	private final int date = 1;
	private UserInterface owner;
	private String title;
	private String description;
	private double payment;
	private PriorityQueue<UserInterface> interestedQueue = new PriorityQueue<>();
	private boolean serviceGiven;
	private boolean serviceReceived;

	public Post() {

	}

	public long getId() {
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

	public void setTitle(String _title) {
		this.title = _title;
	}

	public String getTitle() {
		return this.title;
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

	public PriorityQueue<UserInterface> getInterested() {
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