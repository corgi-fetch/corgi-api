package app.models;


import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;

import app.interfaces.*;



public class User /*implements UserInterface*/{

    
	private Integer id;
    private int rating;
    private String name;
    private String email;
    
    private Set<Post> postHistory;
    
    private Post currentPost;
    
    private Set<Post> currentJobs;
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

    public void setPostHistory(Set<Post> _postHistory) {
        postHistory = _postHistory;
    }

    public Set<Post> getPostHistory() {
        return postHistory;
    }

    public void setCurrentPost(Post _currentPost) {
        currentPost = _currentPost;
    }

    public Post getCurrentPost() {
        return currentPost;
    }

    public void setCurrentJobs(Set<Post> _currentJobs) {
        currentJobs = _currentJobs;
    }

    public Set<Post> getCurrentJobs() {
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