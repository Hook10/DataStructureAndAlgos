package org.hook.ds.hashtable;

public class HashTable {

  private HashNode[] buckets;
  private int numOfBuckets;
  private int size;

  public HashTable() {
    this(10);
  }

  public HashTable(int capacity) {
    this.numOfBuckets = capacity;
    buckets = new HashNode[numOfBuckets];
    this.size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void put(Integer key, String value) {
    if (key == null || value == null) {
      throw new IllegalArgumentException("Key or Value is null!");
    }
    int bucketIndex = getBucketIndex(key);
    HashNode head = buckets[bucketIndex];
    while (head != null) {
      if (head.key.equals(key)) {
        head.value = value;
        return;
      }
      head = head.next;
    }
    size++;
    head = buckets[bucketIndex];
    HashNode node = new HashNode(key, value);
    node.next = head;
    buckets[bucketIndex] = node;
  }

  private int getBucketIndex(int key) {
    return key % numOfBuckets; // buckets.length
  }

  public String get(Integer key) {
    if (key == null) {
      throw new IllegalArgumentException("Key is null");
    }
    int bucketIndex = getBucketIndex(key);
    HashNode head = buckets[bucketIndex];
    while (head != null) {
      if (head.key.equals(key)) {
        return head.value;
      }
      head = head.next;
    }
    return null;
  }

  public String remove(Integer key) {
    return null;
  }


  private class HashNode {
    private Integer key;
    private String value;
    private HashNode next;

    public HashNode(Integer key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  public static void main(String[] args) {
    HashTable table = new HashTable(10);
    table.put(105, "Tom");
    table.put(21, "Sana");
    table.put(11, "Harry");
    System.out.println(table.size);
    String s = table.get(21);
    System.out.println(s);
  }

}