package exam24;

// K와 V, 두 개의 타입을 파라미터로 정의 
public class Entry<K, V> {
	private K key;
	private V value;
	
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getvalue() { return value; }
	
	public void display() {
		System.out.println("Key: "  + key + 
				" (Type: " + key.getClass().getSimpleName() + ")");
		System.out.println("value: " + value + 
				" (Type: " + value.getClass().getSimpleName() + ")");
	}
}
