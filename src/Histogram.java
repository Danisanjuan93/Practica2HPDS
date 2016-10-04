import java.util.*;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Anuar on 04/10/2016.
 */
public class Histogram<T> {

    private ArrayList<T> histogram;

    public Histogram(ArrayList<T> histogram){
        this.histogram = histogram;
    }

    public ArrayList<T> getHistogram() {
        return histogram;
    }
    //Esta cosa va genial.
}
