package org.hamilton.fonz;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.jetsOn();
        hottub.bubblesOn();
    }

    public void undo() {
        hottub.off();
        hottub.cool();
        hottub.jetsOff();
        hottub.bubblesOff();
    }
}
