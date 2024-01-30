package socialNetwork;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Entry {

    private String author;
    private LocalDate timestamp;
    private int likes;
    private ArrayList<Comment> comment;

    public Entry(String author) {
        this.author = author;
        this.timestamp = LocalDate.now();
        this.likes = 0;
        this.comment = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

	public ArrayList<Comment> getComment() {
		return comment;
	}

	public void setComment(ArrayList<Comment> comment) {
		this.comment = comment;
	}
	
	/**
	 * added a method to add a like
	 */
	public void addLike() {
		this.likes += 1;
	}
	
	/**
	 * added a method to remove a like
	 */
	public void removeLike() {
		this.likes -= 1;
	}
	
	/**
	 * method to create a comment
	 * @param c 
	 */
	public void createComments (Comment c) {
		this.comment.add(c);
	}
	
	/**
	 * method to remove a comment
	 * @param c
	 */
	public void removeComments (Comment c) {
		this.comment.remove(c);
	}
	
	/**
	 * method to calculate the TimeSpan
	 */
	public void calculateTimeSpan() {
		Period timeSpan = Period.between(timestamp, LocalDate.now());
		System.out.println(timeSpan);
	}
	public abstract String toString();
}
