package homework13;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        IPhones iPhone = new IPhones();

        int bestFriend = 123456789;

        android.call(bestFriend);
        iPhone.call(bestFriend);
        android.sendSms(bestFriend, "Hi.");
        iPhone.sendSms(bestFriend, "Hiii \uD83D\uDE18");
        android.connectToInternet();
        iPhone.connectToInternet();
    }
}