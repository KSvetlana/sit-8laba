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
    public Stereo(String name) {
    }
    
    public void on() {
        System.out.println("Stereo on!");        
    }
    
    public void off() {
        System.out.println("Stereo off!");
    }
    
    public void setCd() {
        System.out.println("Set on stereo Cd!");
    }
    
    public void setDvd() {
        System.out.println("Set on stereo Dvd!");
    }
    
    public void setRadio() {
        System.out.println("Set on stereo Radio!");
    }
    
    public void setVolume(int volume) {
        System.out.println("Stereo setVolume is set to " + volume);
    }
}
