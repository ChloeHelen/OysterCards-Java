public class OysterCard {

    private int value;
    private int maximumValue;

    public OysterCard(){
        value = 0;
        maximumValue = 90;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void topUp(int amount){
        if (this.value + amount > 90) {
            throw new java.lang.Error("Exceeds maximum topup value of 90");
        }
        else {
            this.value += amount;
        }
    }
}
