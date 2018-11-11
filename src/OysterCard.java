public class OysterCard {

    private int value;

    public OysterCard(){
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = this.value + value;
    }

    public void topUp(int amount){
        setValue(amount);
    }
}
