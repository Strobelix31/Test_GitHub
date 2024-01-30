package socialNetwork;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private List<Entry> entries;

    public NewsFeed() {
        entries = new ArrayList<>();
    }
    /**
     * method to create new entries 
     * @param entry
     */
    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    /**
     * method to remove an entry
     * @param index
     */
    public void removeEntry(int index) {
        entries.remove(index);
    }

    /**
     * method to get a entry
     * @return
     */
    public List<Entry> getEntries() {
        return entries;
    }
    
    /** 
     * Outputs all entries in a collection of entries
     */
    public void printEntries() {
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }
    /**
     * method to find the entries
     * @param author
     * @return the result
     */
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

    /**
     * method to find photos
     * @param author
     * @return the result
     */
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
