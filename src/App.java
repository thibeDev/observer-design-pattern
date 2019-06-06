public class App {
    public static void main(String[] args){
        ObservableConcret subject = new ObservableConcret();
        ObserverConcret1 o1 = new ObserverConcret1();
        ObserverConcret2 o2 = new ObserverConcret2();

        subject.addObserver(o1);
        subject.addObserver(o2);

        subject.setStatus(2);
        System.out.println("-------------------------------------");
        subject.setStatus(4);
        System.out.println("-------------------------------------");
        subject.deleteObserver(o1);

        subject.setStatus(5);

    }
}
