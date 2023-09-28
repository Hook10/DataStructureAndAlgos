package org.hook.ds.priorityqueue;

public class MaxPQ {
  Integer[] heap;
  int n;

  public MaxPQ(int capacity) {
    heap = new Integer[capacity + 1];
    n = 0;
  }

  public boolean isEmpty() {
    return n == 0;
  }

  public int size() {
    return n;
  }

  public void insert(int x ) {
    if (n == heap.length - 1) {
      resize(2 * heap.length);
    }
    n++;
    heap[n] = x;
    swim(n);
  }

  private void swim(int k) {
    while (k > 1 && heap[k/2] < heap[k]) {
      int temp = heap[k];
      heap[k] = heap[k/2];
      heap[k/2] = temp;
      k = k/2; // we need to continue to shifting up till new value inserted is at correct position
    }
  }

  private void resize(int capacity) {
    Integer[] temp = new Integer[capacity];
    for (int i = 0; i < heap.length; i++) {
      temp[i] = heap[i];
    }
    heap = temp;
  }

  public void printMaxHeap() {
    for (int i = 1; i <= n; i++) {
      System.out.print(heap[i] + " ");
    }
  }

  public int deleteMax() {
    int max = heap[1];
    swap(1, n);
    n--;
    sink(1);
    heap[n + 1] = null;
    if (n > 0 && (n == (heap.length - 1) / 4)) {
      resize(heap.length / 2);
    }
    return max;
  }

  private void sink(int k) {
    while (2*k <= n) {
      int j = 2*k;
      if (j < n && heap[j] < heap[j + 1]) {
        j++;
      }
      if (heap[k] >= heap[j]) {
        break;
      }
      swap(k, j);
      k = j;
    }
  }

  public void swap(int a, int b) {
    int temp = heap[a];
    heap[a] = heap[b];
    heap[b] = temp;
  }

  public static void main(String[] args) {
    MaxPQ pq = new MaxPQ(3);
    pq.insert(10);
    pq.insert(9);
    pq.insert(8);
    pq.insert(7);
    pq.insert(6);
    pq.insert(5);
    pq.insert(4);
    pq.printMaxHeap();
    pq.deleteMax();
    System.out.println();
    pq.printMaxHeap();
  }

}
