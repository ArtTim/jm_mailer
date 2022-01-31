public class MailMessage {
    // implement here
    private String to, from, content;

    public MailMessage(String from, String to, String content) {
        this.to = to;
        this.from = from;
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }
}