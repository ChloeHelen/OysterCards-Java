public class OysterCard {

    private int value;

    public static final int MAXIMUM_VALUE = 90;

    public OysterCard(){
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void topUp(int amount){
        if (this.value + amount > MAXIMUM_VALUE) {
            throw new IllegalArgumentException("Exceeds maximum topup value of 90");
        }
        else {
            this.value += amount;
        }
    }
}
