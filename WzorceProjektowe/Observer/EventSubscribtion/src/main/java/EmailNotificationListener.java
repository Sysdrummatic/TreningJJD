import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String mail;

    public EmailNotificationListener(String mail) {
        this.mail = mail;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + mail + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());

    }
}
