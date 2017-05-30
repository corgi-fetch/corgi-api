package app.models;

import app.interfaces.*;
//import java.util.PriorityQueue;
import java.util.List;
import org.springframework.data.annotation.Id;

public final class Post /*implements PostInterface */{
	

	@Id private String id;
	
	private int date;
	private User owner;
	private Title title;
	private String description;
	private double payment;
	
	private List<User> interestedQueue;
	private boolean serviceGiven;
	private boolean serviceReceived;

	private Post(Builder _builder) {
		this.date = _builder.date;
		this.owner = _builder.owner;
		this.title = _builder.title;
		this.description = _builder.description;
		this.payment = _builder.payment;

		this.interestedQueue = _builder.interestedQueue;
		this.serviceGiven = _builder.serviceGiven;
		this.serviceReceived = _builder.serviceReceived;
	}

	public static Builder getBuilder(int _date, User _owner, Title _title, String _description, double _payment) {
		return new Builder(_date, _owner, _title, _description, _payment);
	}

	public int getDate() {
		return this.date;
	}

	public User getOwner() {
		return this.owner;
	}

	public Title getTitle() {
		return this.title;
	}

	public String getDescription() {
		return this.description;
	}

	public double getPayment() {
		return this.payment;
	}

	public List<User> getInterestedQueue() {
		return this.interestedQueue;
	}

	public boolean getServiceGiven() {
		return this.serviceGiven;
	}

	public boolean getServiceReceived() {
		return this.serviceReceived;
	}

	public void update(Builder _builder) {
		this.date = _builder.date;
		this.owner = _builder.owner;
		this.title = _builder.title;
		this.description = _builder.description;
		this.payment = _builder.payment;

		this.interestedQueue = _builder.interestedQueue;
		this.serviceGiven = _builder.serviceGiven;
		this.serviceReceived = _builder.serviceReceived;
	}

	public static class Builder {
		
		private int date;
		private User owner;
		private Title title;
		private String description;
		private double payment;
		
		private List<User> interestedQueue;
		private boolean serviceGiven = false;
		private boolean serviceReceived = false;

		private Builder() {}

		public Builder(int _date, User _owner, Title _title, String _description, double _payment) {
			this.date = _date;
			this.owner = _owner;
			this.title = _title;
			this.description = _description;
			this.payment = _payment;
		}

		public Builder interestedQueue(List<User> _interestedQueue) 
			{ this.interestedQueue = _interestedQueue;	return this; }
		public Builder serviceGiven(boolean _serviceGiven)
			{ this.serviceGiven = _serviceGiven; return this; }
		public Builder serviceReceived(boolean _serviceReceived)
			{ this.serviceReceived = _serviceReceived; return this; }

		public Post build() {
			return new Post(this);
		}
		
	}

	
}