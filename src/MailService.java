import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Mail> {
    // implement here
    Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object obj) {
            return null;
        }
    };
    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }


    @Override
    public void accept(Mail mail) {

    }
}