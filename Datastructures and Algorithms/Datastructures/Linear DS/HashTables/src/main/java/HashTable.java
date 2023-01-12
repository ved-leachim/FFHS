import java.security.Key;
import java.util.LinkedList;

/**
 * Exercise: Build a HashTable from scratch, that contains:
 *  - put (k, v)
 *  - get (k): v
 *  - remove(k)
 *
 *  k: int
 *  v: string
 *
 *  Collisions handling with chaining (Linked Lists)
 *  Hints:  - The basic Array DS saves Linked Lists
 *          - Create a separate class for key and value to be stored in
 */
public class HashTable {

    private LinkedList<KeyValuePair>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var keyValuePair = new KeyValuePair(key, value);

        var savingIndex = hash(key);
        if (!hasCollision(savingIndex))
            saveToHashTable(savingIndex, keyValuePair);
        else {
            var ll = entries[savingIndex];
            var kvp = getKeyValuePair(key, ll);
            if (kvp != null)
                kvp.value = keyValuePair.value;
            else
                ll.add(keyValuePair);
        }
    }

    private KeyValuePair getKeyValuePair(int key, LinkedList<KeyValuePair> ll) {
        for (int i = 0; i < ll.size(); i++) {
            var currentKeyValuePair = ll.get(i);
            if (key == currentKeyValuePair.key)
                return currentKeyValuePair;
        }
        return null;
    }

    private void saveToHashTable (int index, KeyValuePair kvp) {
        var ll = new LinkedList<KeyValuePair>();
        ll.add(kvp);
        entries[index] = ll;
    }

    private boolean hasCollision(int savingIndex) {
        return entries[savingIndex] != null;
    }

    public String get(int key) {
        var savingIndex = hash(key);
        var ll = entries[savingIndex];
        var kvp = getKeyValuePair(key, ll);
        if (kvp == null)
            return null;
        return kvp.value;
    }

    public void remove(int key) {
        var savingIndex = hash(key);
        var ll = entries[savingIndex];
        var kvp = getKeyValuePair(key, ll);
        if (kvp == null)
            throw new IllegalStateException();
        ll.remove(kvp);
    }

    private int hash(int key) {
        String getHashValue = "" + key;
        int hash = getHashValue.hashCode();
        return ((hash % 5) + 5) % 5;
    }

    private class KeyValuePair {
        private int key;
        private String value;

        public KeyValuePair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
