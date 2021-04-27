package Project1.Observer;


public interface SubjectP {
    public void register(ObserverP obj);
    public void unregister(ObserverP obj);
    public void notifyObservers(String msg);
    public Object getUpdate(ObserverP obj);
}
