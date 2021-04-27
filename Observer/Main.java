package Project1.Observer;
//Utilizatorii care se aboneaza la diferite pagini, primesc notificari pe masura ce acestea fac postari



public class Main {
     public static void main(String[] args) throws InterruptedException {

        PressPage telegraph = new PressPage("The Telegraph");
        PressPage nytimes =new PressPage ("New York Times");
        PressPage adevarul=new PressPage("Adevarul");


        ObserverP user1 = new User("User1");
        ObserverP user2 = new User("User2");
        ObserverP user3 = new User("User3");
        ObserverP user4 = new User("User4");
        ObserverP user5 = new User("User5");


        user1.subscribeTo(telegraph);
        user2.subscribeTo(telegraph);
        user2.subscribeTo(nytimes);
        user3.subscribeTo(telegraph);
        user4.subscribeTo(adevarul);
        user5.subscribeTo(nytimes);
        user5.subscribeTo(adevarul);


        telegraph.postMessage("Joe Biden Inauguration Day");
        nytimes.postMessage("Britain’s Alarm Over Virus");
        adevarul.postMessage("Israelul interzice toate zborurile");
     }
}
