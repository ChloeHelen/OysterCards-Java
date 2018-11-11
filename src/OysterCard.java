public class OysterCard {

    private int value;
    private boolean inJourney;

    public static final int MAXIMUM_VALUE = 90;

    public OysterCard(){
        value = 0;
        inJourney = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isInJourney() {
        return inJourney;
    }

    public void topUp(int amount){
        if (this.value + amount > MAXIMUM_VALUE) {
            throw new IllegalArgumentException("Exceeds maximum topup value of 90");
        }
        else {
            this.value += amount;
        }
    }

    public void deduct(int amount){
        this.value -= amount;
    }

    public void touchIn() {
        this.inJourney = true;
    }

    public void touchOut() {
        this.inJourney = false;
    }
}
