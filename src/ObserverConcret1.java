public class ObserverConcret1 implements Observer {
    // first implementation
    @Override
    public void update(Observable o) {
        int state = ((ObservableConcret)o).getStatus();
        /*
        some treatments
         */
        //o.notifyObservers();
        System.out.println("Observer 1 : " + state * 3);
    }
}
