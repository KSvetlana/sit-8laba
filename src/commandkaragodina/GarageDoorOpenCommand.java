/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    
    public GarageDoorOpenCommand(GarageDoor garageDoor) { 
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() { 
        garageDoor.up();
    }
    
    public void undo() {
        garageDoor.down();
    }
    
}
