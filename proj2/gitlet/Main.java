package gitlet;

/** Driver class for Gitlet, a subset of the Git version-control system.
 *  @author TODO
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND1> <OPERAND2> ... 
     */
    public static void main(String[] args) {
        // TODO: what if args is empty?
        String firstArg = args[0];
        switch(firstArg) {
            case "init":
                // TODO: handle the `init` command
                break;
            case "add":
                // TODO: handle the `add [filename]` command
                break;
            // TODO: FILL THE REST IN
            case "commit":
                // TODO: handle the `add [filename]` command
                break;
            case "rm":
                // TODO: handle the `add [filename]` command
                break;
            case "log":
                // TODO: handle the `add [filename]` command
                break;
            case "global-log":
                // TODO: handle the `add [filename]` command
                break;
            case "find":
                // TODO: handle the `add [filename]` command
                break;
            case "status":
                // TODO: handle the `add [filename]` command
                break;
            case "checkout":
                // TODO: handle the `add [filename]` command
                break;
            case "branch":
                // TODO: handle the `add [filename]` command
                break;
            case "rm-branch":
                // TODO: handle the `add [filename]` command
                break;
            case "reset":
                // TODO: handle the `add [filename]` command
                break;
            case "merge":
                // TODO: handle the `add [filename]` command
                break;
        }
    }
}
