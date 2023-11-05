package iteco.strategy.sorting;

import iteco.strategy.algorithms.MergeSort;

public class SortByMerge implements SortStrategy {

    private final MergeSort sort;

    public SortByMerge() {
        this.sort = new MergeSort();
    }

    @Override
    public void sort(int[] array) {
        System.out.println("Выполняется сортировка слиянием.");
        sort.mergeSort(array, 1, 2);
    }
}
