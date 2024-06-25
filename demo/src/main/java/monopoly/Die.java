package monopoly;

public class Die {
    private int faceValue;

    public Die() {
    }
    
    public void roll() {
        this.faceValue = (int) (Math.random() * 6) + 1;
    }
    public int getFaceValue() {
        return this.faceValue;
    }
}