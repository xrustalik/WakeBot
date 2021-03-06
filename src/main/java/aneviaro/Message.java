package aneviaro;

enum Messages {

    BestTimeToWakeUp("The best time to wake up is:\n"), BestTimeToGoToSleep(
            "The best time to go to sleep is:\n"), Greetings(
            "Greeting my dear sleep friend. Let's be friends! Please, type in the time in the next format: I.e. *22:15*. You'll be asked to choose if it's a *Wake up* or *Go To Sleep* time. Then I will provide the best time for you to go to sleep or wake up. Let's start!"), ClarificationQuestion(
            "Is it wake up time or go to sleep time?");

    private final String message;

    Messages(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return this.message;
    }
}
