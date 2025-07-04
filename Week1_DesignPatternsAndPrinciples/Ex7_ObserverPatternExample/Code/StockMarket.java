package Week1_DesignPatternsAndPrinciples.Ex7_ObserverPatternExample.Code;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private double stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    // Method to change the stock price
    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers();
    }
}
