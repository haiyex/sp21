package gitlet;

// TODO: any imports you need here

import java.util.Date; // TODO: You'll likely use this in this class
import java.util.Objects;

/** Represents a gitlet commit object.
 *  TODO: It's a good idea to give a description here of what else this Class
 *  does at a high level.
 *
 *  @author TODO
 */
public class Commit implements Comparable<Commit> {
    /**
     * TODO: add instance variables here.
     *
     * List all instance variables of the Commit class here with a useful
     * comment above them describing what that variable represents and how that
     * variable is used. We've provided one example for `message`.
     */

    /** The message of this Commit. */
    private String message;

    private String userName;

    private String email;

    private String sha1;

    /* TODO: fill in the rest of this class. */

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commit commit = (Commit) o;
        return Objects.equals(sha1, commit.sha1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha1);
    }

    @Override
    public String toString() {
        return "Commit{" +
                "message='" + message + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", sha1='" + sha1 + '\'' +
                '}';
    }


    @Override
    public int compareTo(Commit o) {
        if (o == null) {
            return 1;
        } else if (this.equals(o.toString())) {
            return 0;
        }
        return 1;
    }
}
