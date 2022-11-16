import Impl.DataSortedService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> dateList = Arrays.asList(
                LocalDate.of(2005, 7, 01),
                LocalDate.of(2005, 01, 02),
                LocalDate.of(2005,01,01),
                LocalDate.of(2005,05,03));
        DataSortedService dataSortedService = new DataSortedService();
        System.out.println("After: " +dateList);
        Collection<LocalDate> sortedDataList = dataSortedService.sortDates(dateList);
        System.out.println("Before: " +sortedDataList);

    }
}