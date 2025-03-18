import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int counter;

    @Override
    public void log(String msg) {
        counter++;
        System.out.printf("%s#" + counter + " [" + LocalDateTime.now() + "] " + msg,
                msg.toLowerCase().contains("ошибка") ? "ERROR" : "INFO"
        );
        System.out.println();
    }
}