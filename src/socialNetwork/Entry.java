package socialNetwork;

import java.time.LocalDate;
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
	
	public abstract String toString();
}
