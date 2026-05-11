package Lexicon.Hans.Model;

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

    @Override
    public String toString() {
        return id + ": " + name;
    }
}