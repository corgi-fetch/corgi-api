package app.interfaces;

public interface UserInterface extends Comparable<UserInterface>{
	public int getRating();

	default public int compareTo(UserInterface other) {
		return this.getRating() - other.getRating();
	}
}