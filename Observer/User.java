package Project1.Observer;


public class User implements ObserverP {

    private String name;
    private SubjectP topic;

    public User(String nm){
        this.name=nm;
    }
    @Override
    public void update(String msg) {

        System.out.println(name+" notification: New post <"+msg+">");
    }

    @Override
    public void subscribeTo(SubjectP sub) {

        sub.register(this);
    }


}
