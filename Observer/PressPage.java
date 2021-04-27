package Project1.Observer;


import java.util.ArrayList;
import java.util.List;

public class PressPage implements SubjectP{
    private List<ObserverP> observers=new ArrayList<>();
    private String message;

    private final Object MUTEX= new Object();
    private String name;

    public PressPage(String name) {
        this.name = name;
    }


    @Override
    public void register(ObserverP obj) {
        if(obj == null) throw new NullPointerException("Null Project1.Observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(ObserverP obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers(String message) {

        for (ObserverP obj : observers) {
            obj.update(message);
        }

    }

    @Override
    public Object getUpdate(ObserverP obj) {
        return this.message;
    }


    public void postMessage(String msg){
        System.out.println("Message Posted to "+this.name +": "+msg);
        this.message=msg;

        notifyObservers(msg);
    }
}