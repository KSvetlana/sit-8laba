/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class TV {
    String name;
    
    public TV(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(name + " on!");
    }
    
    public void off() {
        System.out.println(name + " off!");
    }
}
