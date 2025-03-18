public class Main {
    public static void main(String[] args) {
        SimpleLogger logger = new SimpleLogger();
        logger.log("Привет, мир!");

        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log("Здесь все в порядке!");
        smartLogger.log("Здесь ОШИБКА!");
    }
}