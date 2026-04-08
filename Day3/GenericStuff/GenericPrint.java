package GenericStuff;

public class GenericPrint<T> {
    T thingsToPrint;
    
    public GenericPrint(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(this.thingsToPrint);
    }
}
