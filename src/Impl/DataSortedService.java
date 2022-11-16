package Impl;

import Interface.IDateSorter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

public class DataSortedService implements IDateSorter{
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> sortDataWithR = unsortedDates.stream()
                .filter(a -> !a.getMonth().toString().contains("r"))
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        sortDataWithR.addAll(unsortedDates.stream()
                .filter(a -> a.getMonth().toString().contains("r"))
                .sorted(reverseOrder()).toList());


        return sortDataWithR;
    }

}
