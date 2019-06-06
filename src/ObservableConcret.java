import java.util.ArrayList;

public class ObservableConcret implements Observable {

    private ArrayList<Observer> observers = new ArrayList<>();
    private int status;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this);
        }
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int n){
        status = n;
        notifyObservers();
    }
}
