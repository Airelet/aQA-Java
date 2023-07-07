package homework13;

public class IPhones implements Smartphones {

    private boolean pickedUp = false;

    private int smsStatus = 0;


    @Override
    public void call(int number) {
        int maxWaitingTime = 0;
        System.out.println("✨Sending a signal to nearest cell tower...✨");
        do {
            System.out.println("✨Beeeep...✨");
            maxWaitingTime += 1;
        } while (maxWaitingTime <= 7 || pickedUp);
    }

    @Override
    public void sendSms(int number, String smsText) {
        System.out.println("✨The message gets transmitted to the nearest cell tower...✨");
        System.out.println("Passing to an SMS center "+ smsText);
        setSmsStatus(1);
        System.out.println("SMSC forwards " + smsText + " to a cell tower near the receiving device");
        System.out.println("Tower sends ✨" + smsText + "✨ to the recipient's device");
        setSmsStatus(2);
    }

    @Override
    public void connectToInternet() {
        System.out.println("✨Creating a connection with a central cellular base station or macrocell...✨");
        System.out.println("✨Getting max cellular network standards possible...✨");
    }

    public void setPickedUp(boolean pickedUp) {
        this.pickedUp = pickedUp;
    }

    public void setSmsStatus(int smsStatus) {
        this.smsStatus = smsStatus;
    }

    public int getSmsStatus() {
        return smsStatus;
    }
}
