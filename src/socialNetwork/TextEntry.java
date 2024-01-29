package socialNetwork;

public class TextEntry extends Entry {

    private String text;

    public TextEntry(String author, long timestamp, int likes, String text) {
        super(author, timestamp, likes);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.getAuthor() + " " + this.getTimestamp() + " " + this.getLikes() + " " + this.getText();
    }
}