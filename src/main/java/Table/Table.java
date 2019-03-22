package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
//Implement Table<K,V> so that it manages an ArrayList of Entry<K,V>. You must implement
public class Table<K, V> {

    private ArrayList <Entry> entries;

    public Table() {
        entries = new ArrayList();
    }
    //get which takes a key and returns either the entry from the ArrayList with that key, or null if none is found.
    public V get(K foo) {
        for (Entry entry : entries) {
            if (entry.getKey().equals(foo)) {
                return (V) entry.getValue();
            }
        }
        return null;
    }
    //put which takes a key and value and sets the value in the ArrayList to Entry(key, value);
    public void put(K foo, V i) {
        Entry newEntry = new Entry(foo, i);
        for (Entry entry : entries) {
            if (entry.getKey() == foo) {
                entry.setValue(i);
                break;
            }
        }
        entries.add(newEntry);
    }
    //remove which takes a key and removes it from the ArrayList if it's in there. It's a void method; no return type.
    public void remove(K foo) {
        entries.remove(getEntry(foo));
    }

    public Entry getEntry(K foo) {
        for (Entry entry : entries) {
            if (entry.getKey() == foo) {
                return entry;
            }
        }
        return null;
    }
}
