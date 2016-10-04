import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] vector = {1, 3, 2, 1, 4, 5, 4, 7, 1, 3, 2};

        HashMap<Integer, Integer> histogram = new HashMap<>();

        for (int key : vector) {
            if (!histogram.containsKey(key)) {
				histogram.put(key, 1);
            } else {
                histogram.put(key, histogram.get(key) + 1);
            }
        }

        for (Integer key : histogram.keySet()) {
            System.out.println(key + " ---> " + histogram.get(key));
        }

        System.out.println("Hello World!");
    }
}
