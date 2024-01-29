package socialNetwork;

public class PhotoEntry extends Entry {

    private String filename;

    public PhotoEntry(String author, long timestamp, int likes, String filename) {
        super(author, timestamp, likes);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return this.getAuthor() + " " + this.getTimestamp() + " " + this.getLikes()+ " " + this.getFilename();
    }
}
