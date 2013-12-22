/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;
    
    public CeilingFanOnCommand(CeilingFan ceilingFan) { 
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() { 
        ceilingFan.on();
    }
    
    public void undo() {
        ceilingFan.off();
    }
}
