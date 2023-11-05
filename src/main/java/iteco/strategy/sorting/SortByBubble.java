package iteco.strategy.sorting;

import iteco.strategy.algorithms.BubbleSort;

public class SortByBubble implements SortStrategy {

    private final BubbleSort sort;

    public SortByBubble(BubbleSort sort) {
        this.sort = sort;
    }

    @Override
    public boolean sort(int[] array) {
        return false;
    }
}
