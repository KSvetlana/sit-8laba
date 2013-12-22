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
