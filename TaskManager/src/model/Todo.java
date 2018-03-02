package model;

import java.util.LinkedList;
import java.util.List;


public class Todo extends Doable {

    private String description;
    private List <Doable> subs;
    public Todo(String description) {
        super();
        this.description = description;
        subs = new LinkedList<>();
    }
    public List<Doable> getSubTasks(){return subs;}
    public boolean addDoable(Doable td) {
        if (!subs.contains(td)) {
            subs.add(td);
            return true;
        } else {
            return false;
        }
    }
    public boolean removeDoable(Doable td) {
        if (subs.contains(td)) {
            subs.remove(td);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void complete() {
        boolean isDone = true;
        for (Doable d:subs){
            if(!d.getStatus()){
                isDone = false;
            }
        }
        isComplete = isDone;
    }

    @Override
    public void display(String indentSpace) {
        System.out.println(indentSpace+getDescription());
        for (Doable d:subs)
        {
            d.display(indentSpace+indentSpace);
        }

    }
}