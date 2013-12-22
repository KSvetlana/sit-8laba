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
        /*SimpleRemoteControl remote = new SimpleRemoteControl(); 
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        
        remote = new SimpleRemoteControl();
        light = new Light();
        GarageDoor garageDoor = new GarageDoor(); 
        lightOn = new LightOnCommand(light); 
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(lightOn); 
        remote.buttonWasPressed(); 
        remote.setCommand(garageOpen); 
        remote.buttonWasPressed();*/
        
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage door");
        Stereo stereo = new Stereo("Stereo");
        CeilingFan ceilingFan = new CeilingFan("Ceiling fan");
            
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
                    
        remoteControl.setCommand(0,  livingRoomLightOn,  livingRoomLightOff);
        remoteControl.setCommand(1,  kitchenLightOn,  kitchenLightOff);
        remoteControl.setCommand(2,  ceilingFanOn,  ceilingFanOff);
        remoteControl.setCommand(3,  garageDoorOpen,  garageDoorClose);
        remoteControl.setCommand(4,  stereoOn,  stereoOff);
            
        System.out.println(remoteControl);
        System.out.println("*Pushing livingRoom Light ON");
        remoteControl.onButtonWasPushed(0);
        System.out.println("*Pushing livingRoom Light OFF");
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println("*Pushing kitchen Light ON");
        remoteControl.onButtonWasPushed(1);
        System.out.println("*Pushing kitchen Light OFF");
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        System.out.println("*Pushing ceiling Fan ON");
        remoteControl.onButtonWasPushed(2);
        System.out.println("*Pushing ceiling Fan OFF");
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        System.out.println("*Pushing garage Door Open");
        remoteControl.onButtonWasPushed(3);
        System.out.println("*Pushing garage Door Close");
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        System.out.println("*Pushing stereo ON");
        remoteControl.onButtonWasPushed(4);
        System.out.println("*Pushing stereo OFF");
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();

    }
}
