package groupId.artifactId.model;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

public class Messages {
    private static Messages firstInstance = null;
    private final LinkedHashMap<LocalDateTime, String> messages = new LinkedHashMap<>();

    public static Messages getInstance() {
        synchronized (Messages.class) {
            if (firstInstance == null) {
                firstInstance = new Messages();
            }
        }
        return firstInstance;
    }

    public LinkedHashMap<LocalDateTime, String> getMessages() {
        return messages;
    }

    public void updateMessages(String message) {
        LocalDateTime temp = LocalDateTime.now();
        messages.put(temp, message);
    }
}
