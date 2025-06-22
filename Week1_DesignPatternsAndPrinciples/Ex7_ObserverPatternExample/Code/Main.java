package Week1_DesignPatternsAndPrinciples.Ex7_ObserverPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("AppOne");
        Observer mobileApp2 = new MobileApp("AppTwo");
        Observer webApp = new WebApp("WebPortal");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        // Change stock price
        stockMarket.setStockPrice(100.5);
        System.out.println();

        // Change stock price again
        stockMarket.setStockPrice(105.75);
        System.out.println();

        // Remove an observer and change price again
        stockMarket.removeObserver(mobileApp1);
        stockMarket.setStockPrice(110.0);
    }
}