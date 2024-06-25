/*
6510405521
Thatpong Wongchaita
 */

package monopoly;

public class Square {
    private String name;
    private int index;

    public Square(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }
    public String getName() {
        return this.name;
    
    }
}
