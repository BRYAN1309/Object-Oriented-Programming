package queueSystem;

// Enumeration for hotel booking details
enum BookingDetails {
    CONFIRMATION_NUMBER, GUEST_NAME, ROOM_CATEGORY, CHECK_IN_DATE
}

// BookingRecord class representing attribute-value pairs
public class BookingRecord {
    private BookingDetails attribute;
    private String information;

    public BookingRecord(BookingDetails attribute, String information) {
        this.attribute = attribute;
        this.information = information;
    }

    public BookingDetails getAttribute() {
        return attribute;
    }

    public String getInformation() {
        return information;
    }

    @Override
    public String toString() {
        return attribute + ": " + information;
    }
}
