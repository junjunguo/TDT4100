package test;


public class Apple {
    
    private String color;
    private int    amount;
    
    public Apple(String color, int amount) {
        this.color = color;
        this.amount = amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
        System.out.println("class Apple: amount " + amount);
    }
    
    public void setColor(String color) {
        this.color = color;
        System.out.println("class Apple: color " + color);
    }
    
    public String toString() {
        String s = "color: " + color + " amount: " + amount;
        return s;
    }
}
