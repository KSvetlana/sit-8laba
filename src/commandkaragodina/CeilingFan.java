/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class CeilingFan {
    String name;
    int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    public void high() {
        System.out.println(name + " is HIGH");
        speed = HIGH;
    }
    
    public void medium() {
        System.out.println(name + " is MEDIUM");
        speed = MEDIUM;
    }
    
    public void low() {
        System.out.println(name + " is LOW");
        speed = LOW;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    CeilingFan(String name) {
        this.name = name;
    }
     
    public void on(){
        System.out.println(name+" On");
    }
    
    public void off(){
        System.out.println(name+" Off");
    }
}
