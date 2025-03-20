package queueSystem;
 //Bryan Thanaya -2702334784
public class Main {
    public static void main(String[] args) {
    	//a generic circular queue that can handle any data type and can perform operations such as peeking, pushing, popping, getting the size, 
    	//and displaying the queue.
        // Instantiate a circular queue with a capacity of 5
        CircularQueue<BookingRecord> hotelQueue = new CircularQueue<>(4);

        // Add booking details to the queue
        hotelQueue.add(new BookingRecord(BookingDetails.CONFIRMATION_NUMBER, "CN12345"));
        hotelQueue.add(new BookingRecord(BookingDetails.GUEST_NAME, "Alice Smith"));
        hotelQueue.add(new BookingRecord(BookingDetails.ROOM_CATEGORY, "Deluxe"));
        hotelQueue.add(new BookingRecord(BookingDetails.CHECK_IN_DATE, "2024-12-20"));

        // Display the size of the queue
        System.out.println("Queue size: " + hotelQueue.size());

        // Display the contents of the queue
        System.out.println("Current Queue: ");
        hotelQueue.display();

        // Peek at the first element
        System.out.println("First in line: " + hotelQueue.peek());

        // Remove the first element
        System.out.println("Removing: " + hotelQueue.remove());

        // Display the queue after removal
        System.out.println("Queue after removal: ");
        hotelQueue.display();

        // Add another element to demonstrate circular behavior
        hotelQueue.add(new BookingRecord(BookingDetails.CONFIRMATION_NUMBER, "CN54321"));
        System.out.println("Queue after adding new booking: ");
        hotelQueue.display();
    }
}
