/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class RemoteControlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); 
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        /*
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor(); 
        LightOnCommand lightOn = new LightOnCommand(light); 
        GarageDoor garageOpen = new GarageDoor(garageDoor);
        remote.setCommand(lightOn); 
        remote.buttonWasPressed(); 
        remote.setCommand(garageOpen); 
        remote.buttonWasPressed();*/

    }
}
