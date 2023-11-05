package iteco.strategy;

import iteco.strategy.data.DataGeneration;
import iteco.strategy.data.SortContext;
import iteco.strategy.sorting.SortByBubble;
import iteco.strategy.sorting.SortByMerge;
import java.io.IOException;

public class Sorter {

    public static void main(String[] args) throws IOException {
        int[] array = new DataGeneration().dataGeneration();
        SortContext context;
        if (array.length < 100) {
            context = new SortContext(new SortByBubble());
            context.sort(array);
        }   else {
            context = new SortContext(new SortByMerge());
            context.sort(array);
        }
    }
}
