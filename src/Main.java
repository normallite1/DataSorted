import Impl.DataSortedService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> dateList = Arrays.asList(
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005,1,1),
                LocalDate.of(2005,5,3));
        DataSortedService dataSortedService = new DataSortedService();
        System.out.println("After: " +dateList);
        System.out.println("Before: " +dataSortedService.sortDates(dateList));


    }
}