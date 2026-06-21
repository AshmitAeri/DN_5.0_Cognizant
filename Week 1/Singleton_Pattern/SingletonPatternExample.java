public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger first = Logger.getLogger();
        Logger second = Logger.getLogger();

        first.writeLog("User logged in");
        second.writeLog("Data saved successfully");

        if (first == second) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Different Logger instances created.");
        }
    }
}