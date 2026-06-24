package observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockName;
    private double price;

    public StockMarket(String stockName, double initialPrice) {
        this.stockName = stockName;
        this.price = initialPrice;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registered for " + stockName);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer deregistered from " + stockName);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void setPrice(double newPrice) {
        System.out.println("\n[StockMarket] " + stockName + " price changed: $" + price + " -> $" + newPrice);
        this.price = newPrice;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }

    public String getStockName() {
        return stockName;
    }
}
