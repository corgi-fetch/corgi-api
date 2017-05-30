package app.interfaces;

import java.util.PriorityQueue;
import java.util.Set;

public interface PostInterface {

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
	public Set<UserInterface> getInterested();
	
	public void setServiceGiven(boolean serviceGiven);
	public boolean getServiceGiven();
	
	public void setServiceReceived(boolean serviceReceived);
	public boolean getServiceReceived();

}