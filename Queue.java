public interface Queue {
// The number of items in the queue
    int size();
// Returns true if the queue is empty
    boolean isEmpty();
// Adds the new item on the back of the queue, throwing the
// QueueOverflowException if the queue is at maximum capacity. It
// does not throw an exception for an "unbounded" queue, which
// dynamically adjusts capacity as needed.
    void enqueue(String x, int y, String z) throws QueueOverflowException;
// Removes the item in the front of the queue, throwing the
// QueueUnderflowException if the queue is empty.
    Object dequeue() throws QueueUnderflowException;
// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    Object peek() throws QueueUnderflowException;

}