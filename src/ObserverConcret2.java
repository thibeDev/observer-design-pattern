public class ObserverConcret2 implements Observer {
    @Override
    public void update(Observable o) {
        int state = ((ObservableConcret)o).getStatus();

        //o.notifyObservers();
        System.out.println("Observer 2 : " + state * 5);
    }
}
