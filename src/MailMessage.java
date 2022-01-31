public class MailMessage extends Mail<String> {

    public MailMessage(String to, String from, String content) {
        super(from, to, content);
    }

    @Override
    public String getTo() {
        return super.getTo();
    }

    @Override
    public String getFrom() {
        return super.getFrom();
    }

    @Override
    public String getContent() {
        return super.getContent();
    }
}