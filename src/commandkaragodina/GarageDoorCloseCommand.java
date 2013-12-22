/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;
    
    public GarageDoorCloseCommand(GarageDoor garageDoor) { 
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() { 
        garageDoor.down();
    }
}
