public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("sysdrummatic@gmail.com"));

        try {
            editor.openFile("text.txt");
            editor.saveFile();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
