/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkaragodina;

/**
 *
 * @author Светлана
 */
public class TVOffCommand implements Command {
    TV tv;
    
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.off();
    }
    
    public void undo() {
        tv.on();
    }
}
