package socialNetwork;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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
	public void createComments (String user, String message) {
		Comment c = new Comment(user,message);
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
	public static String calculateTimeSpan(LocalDate startDate, LocalDate endDate) {

	    // Datumsdifferenz in Tagen berechnen
	    long daysDiff = ChronoUnit.DAYS.between(startDate, endDate);

	    // Differenz in Stunden berechnen
	    long hoursDiff = ChronoUnit.HOURS.between(startDate.atStartOfDay(), endDate.atStartOfDay());

	    // Differenz in Minuten berechnen
	    long minutesDiff = ChronoUnit.MINUTES.between(startDate.atStartOfDay(), endDate.atStartOfDay());

	    // Differenz in Sekunden berechnen
	    long secondsDiff = ChronoUnit.SECONDS.between(startDate.atStartOfDay(), endDate.atStartOfDay());

	    // Hilfsvariable zur Zeitspanne in Millisekunden
	    long totalMilliseconds = Math.abs(endDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() - startDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());

	    // Ausgabe der Zeitspanne in entsprechender Einheit
	    if (daysDiff > 0) {
	    	if(daysDiff == 1) {
	    		 return daysDiff + " Tag, " + formatTime(hoursDiff, minutesDiff, secondsDiff);
	    	}else {
	    		 return daysDiff + " Tage, " + formatTime(hoursDiff, minutesDiff, secondsDiff);
	    	}
	    } else if (hoursDiff > 0) {
	        return formatTime(hoursDiff, minutesDiff, secondsDiff);
	    } else if (minutesDiff > 0) {
	        return minutesDiff + " Minuten und " + secondsDiff + " Sekunden";
	    } else {
	        return totalMilliseconds + " Millisekunden";
	    }
	}

	// Hilfsmethode zur Formatierung der Zeitspanne in Stunden, Minuten und Sekunden
	private static String formatTime(long hours, long minutes, long seconds) {
	    return hours + " Stunden, " + minutes + " Minuten und " + seconds + " Sekunden";
	}
	
	public abstract String toString();
}
