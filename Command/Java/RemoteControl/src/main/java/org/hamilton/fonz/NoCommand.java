package org.hamilton.fonz;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("no Command");
    }

    public void undo() {

    }
}
