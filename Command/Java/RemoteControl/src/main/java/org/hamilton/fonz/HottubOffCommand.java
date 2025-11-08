package org.hamilton.fonz;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.off();
        hottub.cool();
        hottub.jetsOff();
        hottub.bubblesOff();
    }

    public void undo() {
        hottub.on();
        hottub.heat();
        hottub.jetsOn();
        hottub.bubblesOn();
    }
}
