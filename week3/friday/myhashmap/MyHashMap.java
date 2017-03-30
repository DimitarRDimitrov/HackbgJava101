package friday.myhashmap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap <K,V> {
	
	private int capacity;
	private List<List<Entry<K,V>>> buckets;
	private static final double LOAD_FACTOR = 0.75; 
	
	public MyHashMap() {
		capacity = 16;
		buckets = new ArrayList<>(capacity);
		init(buckets, capacity);
	}
	
	/**
	 * Initialises each bucket to contain a linked list of Entries
	 * @param buckets
	 * @param capacity
	 */
	
	private void init(List<List<Entry<K,V>>> buckets, int capacity) {
		for (int i = 0; i < capacity; i++) {
			buckets.add(new LinkedList<Entry<K,V>>());
		}
	}
	
	/**
	 * The hash function which will determine the position - value % capacity
	 * @param key
	 * @return
	 */
	
	private int hash(K key) {
		return Math.abs(key.hashCode() % capacity);
		
	}
	
	/**
	 * Puts a new entry in MyHashMap at the appropriate position
	 * @param key
	 * @param value
	 */
	
	public void put(K key, V value) {
		if (key == null) return;
		
		int position = hash(key);
		List<Entry<K,V>> bucket = buckets.get(position);
		
		if(bucket == null) {
			bucket = new LinkedList<>();
		}
		
		if(checkIfOverloaded()) {
			resize();
		}
		
		for (Entry<K,V> entry: bucket) {
			if(key.equals(entry.getKey())){
				entry.setValue(value);
				return;
			}
		}

		Entry<K,V> newEntry = new Entry<>(key, value);
		bucket.add(newEntry);
	}

	/**
	 * Gets the stored value based on key.
	 * @param key
	 * @return Integer value. Can be null.
	 */
	
	public V get(K key) {
		if (key == null) return null;
		
		int position = hash(key);
		List<Entry<K,V>> bucket = buckets.get(position);
		
		if (bucket == null) return null;
		
		for (Entry<K,V> entry: bucket) {
			if (key.equals(entry.getKey())){
				return entry.getValue();
			}
		}
		
		return null;
	}
	
	/**
	 * Checks if the key is contained within MyHashMap
	 * @param key
	 * @return boolean
	 */
	public boolean containsKey(K key) {
		if (key == null) return false;
		V value = get(key);
		if(value != null) {
			return true;
		}
		return false;
	}
	
	private boolean checkIfOverloaded() {
		int occupied = 0;
		for(List<Entry<K,V>> bucket : buckets) {
			for(Entry<K,V> entry : bucket) {
				if (entry == null) {
					break;
				}
				occupied++;
			}
		}
		
		return (LOAD_FACTOR * capacity < occupied) ? true : false;
	
	}
	
	private void resize() {
		this.capacity *= 2;
		List<Entry<K,V>> oldEntries = new ArrayList<>();
		for (List<Entry<K,V>> bucket: buckets) {
			for (Entry<K,V> entry: bucket) {
				oldEntries.add(entry);
			}
		}
		
		buckets = new ArrayList<>(capacity);
		for (int i=0; i < capacity; i++) {
			buckets.add(new LinkedList<Entry<K,V>>());
		}
		for(Entry<K,V> entry: oldEntries) {
			put(entry.getKey(), entry.getValue());
		}
		
		
	}
	
	public int getCapacity() {
		return capacity;
	}
	
}
