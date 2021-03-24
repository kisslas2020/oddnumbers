package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        Integer res = 0;

        for(Integer num : numbers) {
            if(num % 2 != 0) {
                res += num;
            }
        }
        return res;
    }
}