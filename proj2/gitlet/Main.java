package gitlet;

import org.checkerframework.checker.units.qual.C;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.TreeMap;

import static gitlet.Repository.CWD;
import static gitlet.Repository.GITLET_DIR;
import static javax.swing.UIManager.get;

/** Driver class for Gitlet, a subset of the Git version-control system.
 *  @author TODO
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND1> <OPERAND2> ... 
     */
    public static void main(String[] args) throws IOException {
        // TODO: what if args is empty?
//        String firstArg = args[0];
        String firstArg = "init";
//        String firstArg = "checkout";
        switch(firstArg) {
            case "init":
                // init .geitlet dir
                GITLET_DIR.mkdir();
                Commit commit = new Commit();
                commit.setEmail("haiyex@qq.com");
                commit.setUserName("haiyex");
                commit.setMessage("init");
                String sha1 = Utils.sha1(commit.toString());
                commit.setSha1(sha1);

                // make commit dir
                File sha1Dir = Utils.join(GITLET_DIR, sha1);
                sha1Dir.mkdir();

                TreeMap<Commit, List<File>> commitTreeMap = new TreeMap<>();

                List<File> files = Utils.recursionFiles(Utils.join(CWD, "gitlet"));
                commitTreeMap.put(commit, files);

                // save files
                for (File file : files) {
                    Utils.writeContents(Utils.join(sha1Dir, file.getName()), Files.readAllBytes(file.toPath()));
                }

                // write treeMap
                Utils.writeObject(Utils.join(GITLET_DIR, "commit"), TreeMap.class);
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
                TreeMap treeMapCommit = Utils.readObject(Utils.join(GITLET_DIR, "commit"), TreeMap.class);
                Commit readCommit = (Commit) treeMapCommit.lastEntry().getKey();
                String readSha1 = readCommit.getSha1();

                List<File> readFiles = (List<File>) treeMapCommit.get(readCommit);
                for (File readFile : readFiles) {
                    Utils.writeContents(readFile, Utils.readContents(Utils.join(GITLET_DIR, readSha1, readFile.getName())));
                }

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
