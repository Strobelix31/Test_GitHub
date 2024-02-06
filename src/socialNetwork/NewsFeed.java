package socialNetwork;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private ArrayList<Entry> entries;

    /**
     * Creates a new news feed; The news feed is initially empty
     */
    public NewsFeed() {
        entries = new ArrayList<>();
    }
    
    /**
     * method to create new entries 
     * @param the entry to be added
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
     * Returns the collection of entries
     * @return the collection of entries
     */
    public ArrayList<Entry> getEntries() {
        return entries;
    }
    
    /** 
     * Outputs all entries in a collection of entries
     */
    public void printEntries(String author) {
        for (Entry entry : entries) {
        	if(entry.getAuthor().equals(author)) {
            System.out.println(entry);
        }
       }
    }
    
    /**
     * method to find the entries
     * @param author
     * @return the result
     */
    public ArrayList<Entry> findEntriesByAuthor(String author) {
        ArrayList<Entry> results = new ArrayList<>();
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
    public ArrayList<Entry> findPhotosByAuthor(String author) {
        ArrayList<Entry> results = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry instanceof PhotoEntry && entry.getAuthor().equals(author)) {
                results.add(entry);
            }
        }
        return results;
    }
}
