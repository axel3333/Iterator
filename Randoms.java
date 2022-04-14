package Iterator;

import java.util.*;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    int x;

    public Randoms(int min, int max) {
        //...
        this.random = new Random();
        x = random.nextInt((max - min) + 1) + min;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>(){


            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {

                return x;
            }
        };
    }

    //...
}
