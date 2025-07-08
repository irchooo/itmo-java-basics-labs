package itmo.java.basics.lab9.task2;

import java.util.List;

public class RandomAccessTask implements Runnable{
    private final List<Integer> list;
    private final int elementsNumber;

    public RandomAccessTask(List<Integer> list, int elementsNumber) {
        this.list = list;
        this.elementsNumber = elementsNumber;
    }

    @Override
    public void run() {
        Comparison.selectRandomElements(list, elementsNumber);
    }
}
