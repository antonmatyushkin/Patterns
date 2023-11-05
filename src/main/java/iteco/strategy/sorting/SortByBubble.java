package iteco.strategy.sorting;

import iteco.strategy.algorithms.BubbleSort;

public class SortByBubble implements SortStrategy {

    private final BubbleSort sort;

    public SortByBubble() {
        this.sort = new BubbleSort();
    }

    @Override
    public void sort(int[] array) {
        System.out.println("Выполняется сортировка пузырьком.");
        sort.bubbleSort(array);
    }
}
