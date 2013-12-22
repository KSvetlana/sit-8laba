/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    
    public CeilingFanOffCommand(CeilingFan ceilingFan) { 
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() { 
        ceilingFan.off();
    }
    
    public void undo() {
        ceilingFan.on();
    }
}
