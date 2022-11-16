package Impl;

import Interface.IDateSorter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;


public class DataSortedService implements IDateSorter{
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> sortDataWithR = unsortedDates.stream()
                .filter(a->a.getMonth().toString().contains("R"))
                .sorted()
                .collect(Collectors.toList());

        sortDataWithR.addAll(unsortedDates.stream()
                .filter(a -> !a.getMonth().name().contains("R"))
                .sorted(reverseOrder()).toList());


        return sortDataWithR;
    }

}
