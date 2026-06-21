class Logger {

    private static Logger loggerObject;

    private Logger() {
        System.out.println("Logger object created");
    }

    public static Logger getLogger() {

        if (loggerObject == null) {
            loggerObject = new Logger();
        }

        return loggerObject;
    }

    public void writeLog(String message) {
        System.out.println("LOG : " + message);
    }
}