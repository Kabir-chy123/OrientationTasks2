
public class Main {
    public static void main(String[] args) {

        EventList eventList = new EventList();

        // Add events with time and type
        eventList.addEvent(new Event(5.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(2.0, EventType.EXIT));
        eventList.addEvent(new Event(8.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(3.0, EventType.EXIT));

        // Print all events
        System.out.println("All events:");
        eventList.printEvents();

        // Remove the next event
        System.out.println("\nNext event:");
        System.out.println(eventList.getNextEvent());

        // Print remaining events
        System.out.println("\nRemaining events:");
        eventList.printEvents();
    }
}
