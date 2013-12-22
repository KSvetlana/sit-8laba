/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }
        
    public void on() {
        System.out.println(name+" on!");        
    }
    
    public void off() {
        System.out.println(name+" off!");
    }
    
    public void setCd() {
        System.out.println(name+" Set on Cd!");
    }
    
    public void setDvd() {
        System.out.println(name+" Set on Dvd!");
    }
    
    public void setRadio() {
        System.out.println(name+"Set on Radio!");
    }
    
    public void setVolume(int volume) {
        System.out.println(name+" setVolume is set to " + volume);
    }
}
