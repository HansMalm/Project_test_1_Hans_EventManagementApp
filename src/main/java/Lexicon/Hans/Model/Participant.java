package Lexicon.Hans.Model;

//Consider creating code for the role value "individual" so it is not spelled incorrectly by users.
public class Participant {

    int id;
    String name;
    //String role;

    public Participant(int id, String name) {
        this.id = id;
        this.name = name;
        //this.role = role;
    }

    public Participant(String name) {
        this.name = name;
        //this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }*/

    //Rewrite this method, it is currently tailored for participant menu.
    @Override
    public String toString() {
        return id + ": " + name;
    }
}