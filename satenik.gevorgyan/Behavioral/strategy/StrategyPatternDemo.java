package strategy;


import strategy.domain.InsertionSort;
import strategy.domain.SelectionSort;
import strategy.domain.SortingContext;

public class StrategyPatternDemo {
    public static void main(String[] args) {

        int numbers[] = {20, 50, 15, 6, 80};

        SortingContext context = new SortingContext();
        context.setSortingMethod(new InsertionSort());
        context.sortNumbers(numbers);

        context.setSortingMethod(new SelectionSort());
        context.sortNumbers(numbers);

    }
}
