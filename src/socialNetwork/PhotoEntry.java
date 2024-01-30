package socialNetwork;

public class PhotoEntry extends Entry {

    private String filename;
    private String headline;

    public PhotoEntry(String author, long timestamp, int likes, String filename, String headline) {
        super(author, timestamp, likes);
        this.filename = filename;
        this.headline = headline;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	@Override
    public String toString() {
        return this.getAuthor() + " " + this.getTimestamp() + " " + this.getLikes()+ " " + this.getFilename() +  " " + this.getHeadline();
    }
}
