package org.hamilton.fonz;

public interface Command {
    public void execute();
    public void undo();
}
