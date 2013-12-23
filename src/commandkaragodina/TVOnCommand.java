/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class TVOnCommand implements Command {
    TV tv;
    
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.on();
    }
    
    public void undo() {
        tv.off();
    }
}
