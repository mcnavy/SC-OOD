package model;

public abstract class  Doable {
    protected boolean isComplete;
    public Doable(){isComplete = false;}
    public boolean getStatus(){return isComplete;}
    public abstract String getDescription();
    public abstract void complete();
    public abstract void display(String indentSpace);


}
