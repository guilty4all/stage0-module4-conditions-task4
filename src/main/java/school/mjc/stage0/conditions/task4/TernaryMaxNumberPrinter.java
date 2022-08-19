package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxValue = (first > second && first >third )||
                       (first == second && first > third) ||
                       (first == third && first > second) ? first:
                                second > first && second > third ||
                                second == third && second > first ? second :
                                            third;
        System.out.println(maxValue);


    }
}
