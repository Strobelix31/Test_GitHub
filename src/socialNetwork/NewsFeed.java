package socialNetwork;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private List<Entry> entries;

    public NewsFeed() {
        entries = new ArrayList<>();
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void printEntries() {
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }
    public List<Entry> findEntriesByAuthor(String author) {
        List<Entry> results = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getAuthor().equals(author)) {
                results.add(entry);
            }
            System.out.println(this.findEntriesByAuthor(author));
        }
        return results;
    }

    public List<Entry> findPhotosByAuthor(String author) {
        List<Entry> results = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry instanceof PhotoEntry && entry.getAuthor().equals(author)) {
                results.add(entry);
            }
        }
        return results;
    }
}
