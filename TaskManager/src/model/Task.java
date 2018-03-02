package model;

public class Task extends Doable {

    private String description;
    private String date;
    private String location;


    public Task(String description, String date, String location) {
        super();
        this.description = description;
        this.date = date;
        this.location = location;

    }

    // getters
    public String getDate() { return date; }
    public String getLocation() { return location; }


    // setters
    public void setDate(String date) { this.date = date; }
    public void setLocation(String location) { this.location = location; }

    public String getDescription() {
        return description + " on " + getDate() + " @" + getLocation();
    }

    @Override
    public void complete() {
        if (!isComplete) {
            isComplete = true;
        }
    }

    public void display(String indentSpace) {
        System.out.println(indentSpace + this.getDescription());
    }


}