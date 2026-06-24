package observer;

// Concrete Observer - Web App
public class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[WebApp - " + appName + "] Dashboard updated: " + stockName + " = $" + price);
    }
}
