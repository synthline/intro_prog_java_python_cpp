public class EventPosts extends Post {
    private String event;

    public EventPosts(String author, String eventname) {
        super(author);
        event = eventname;

    }

    public String getEvent() {
        return event;

    }

}