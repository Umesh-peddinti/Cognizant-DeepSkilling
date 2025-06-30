package Week1_DesignPatternsAndPrinciples.Ex5_DecoratorPatternExample.Code;

// Concrete Decorator for Slack
public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack message: " + message);
    }
}