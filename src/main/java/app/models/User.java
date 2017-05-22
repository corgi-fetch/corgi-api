package app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;

import app.interfaces.*;


@Entity
public class User implements UserInterface{

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private int rating;
    private String name;
    private String email;
    @OneToMany(targetEntity = Post.class)
    private Set<PostInterface> postHistory;
    @ManyToOne(targetEntity = Post.class)
    private PostInterface currentPost;
    @OneToMany(targetEntity = Post.class)
    private Set<PostInterface> currentJobs;
    private String creditCardNumber;
    private String bankAccount;

    public User() {

    }

    public void setRating(int _rating) {
        rating = _rating;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String _name) {
        name = _name;
    }
    
    public String getName() {
        return name;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public String getEmail() {
        return email;
    }

    public void setPostHistory(Set<PostInterface> _postHistory) {
        postHistory = _postHistory;
    }

    public Set<PostInterface> getPostHistory() {
        return postHistory;
    }

    public void setCurrentPost(PostInterface _currentPost) {
        currentPost = _currentPost;
    }

    public PostInterface getCurrentPost() {
        return currentPost;
    }

    public void setCurrentJobs(Set<PostInterface> _currentJobs) {
        currentJobs = _currentJobs;
    }

    public Set<PostInterface> getCurrentJobs() {
        return currentJobs;
    }
    
    public void setCreditCardNumber(String _creditCardNumber) {
        creditCardNumber = _creditCardNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setBankAccount(String _bankAccount) {
        bankAccount = _bankAccount;
    }

    public String getBankAccount() {
        return bankAccount;
    }


}