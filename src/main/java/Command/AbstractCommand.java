package Command;

import java.io.IOException;

public abstract class AbstractCommand {

    String roughInput;
    int[] fromCords;
    int[] toCords;

    abstract void processCommand();
    public abstract void getCommandFromUser() throws IOException;

    public int[] getFromCords() {
        return fromCords;
    }

    public int[] getToCords() {
        return toCords;
    }
}
