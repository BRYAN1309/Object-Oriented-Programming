package queueSystem;

import java.util.LinkedList;

// Circular Queue Implementation
public class CircularQueue<T> {
    private LinkedList<T> queue;
    private int capacity;

    // Constructor with a specified capacity
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    // Get the number of elements in the queue
    public int size() {
        return queue.size();
    }

    // Check if the queue is full
    public boolean isFull() {
        return queue.size() == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Add an element to the queue
    public void add(T element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue.add(element);
    }

    // Remove and return the oldest element in the queue
    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // View the oldest element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    // Display all elements in the queue
    public void display() {
        System.out.println(queue);
    }
}
