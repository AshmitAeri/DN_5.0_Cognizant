package observer;

// Test class to demonstrate the Observer Pattern
public class ObserverPatternTest {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern Example ===\n");

        // Create the stock market (subject)
        StockMarket googleStock = new StockMarket("GOOGL", 2800.00);
        StockMarket appleStock = new StockMarket("AAPL", 175.00);

        // Create observers
        Observer mobileApp1 = new MobileApp("StockTracker");
        Observer mobileApp2 = new MobileApp("InvestPro");
        Observer webApp = new WebApp("TradingDashboard");

        System.out.println();

        // Register observers for Google stock
        System.out.println("--- Registering observers for GOOGL ---");
        googleStock.registerObserver(mobileApp1);
        googleStock.registerObserver(webApp);

        // Register observers for Apple stock
        System.out.println("\n--- Registering observers for AAPL ---");
        appleStock.registerObserver(mobileApp2);
        appleStock.registerObserver(webApp);

        // Simulate price changes
        System.out.println("\n--- Simulating Price Changes ---");
        googleStock.setPrice(2850.50);
        appleStock.setPrice(178.25);

        // Deregister an observer
        System.out.println("\n--- Deregistering MobileApp from GOOGL ---");
        googleStock.deregisterObserver(mobileApp1);

        // Another price change - only webApp should be notified for GOOGL
        googleStock.setPrice(2900.00);
    }
}
