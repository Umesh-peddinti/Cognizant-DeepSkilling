package Week1_DesignPatternsAndPrinciples.Ex5_DecoratorPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        // Base notifier: Email
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack on top of Email + SMS
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a message
        slackNotifier.send("This is a test notification.");
    }
}
