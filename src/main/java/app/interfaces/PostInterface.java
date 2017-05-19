package app.interfaces;

import java.util.PriorityQueue;

public interface PostInterface {
	public void setId(Integer id);
	public Integer getId();

	public int getDate();
	
	public void setOwner(UserInterface owner);
	public UserInterface getOwner();

	public void setTitle(TitleInterface title);
	public String getTitle();

	public void setDescription(String description);
	public String getDescription();

	public void setPayment(double payment);
	public double getPayment();
	
	public void addInterested(UserInterface interested);
	public PriorityQueue<UserInterface> getInterested();
	
	public void setServiceGiven(boolean serviceGiven);
	public boolean getServiceGiven();
	
	public void setServiceReceived(boolean serviceReceived);
	public boolean getServiceReceived();

}