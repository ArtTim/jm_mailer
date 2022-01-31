public abstract class Mail<T> {
    private String to, from;
    private T content;

    public Mail(String to, String from, T content) {
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

    public T getContent() {
        return content;
    }

}
