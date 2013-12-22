/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class GarageDoor{
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }
    
    public void up(){
        System.out.println(name+" is Open");
    }
    
    public void down(){
        System.out.println(name+" is Close");
    }
    
    public void stop(){
        System.out.println(name+" is Stoped");
    }
    
    public void lightOn(){
        System.out.println(name+" Light is On");
    }
    
    public void lightOff(){
        System.out.println(name+" Light is Off");
    }
}
