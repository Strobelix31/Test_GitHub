package socialNetwork;

import java.util.ArrayList;

public abstract class Entry {

    private String author;
    private long timestamp;
    private int likes;
    private ArrayList<Comment> comment;

    public Entry(String author, long timestamp, int likes, ArrayList<String> comment) {
        this.author = author;
        this.timestamp = timestamp;
        this.likes = likes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
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
