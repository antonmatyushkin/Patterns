package iteco.strategy.sorting;

import iteco.strategy.algorithms.MergeSort;

public class SortByMerge implements SortStrategy {

    private final MergeSort sort;

    public SortByMerge(MergeSort sort) {
        this.sort = sort;
    }

    @Override
    public boolean sort(int[] array) {
        return false;
    }
}
