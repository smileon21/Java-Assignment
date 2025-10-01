package com.banking;

import java.util.Arrays;
import java.util.List;


public class FiltersNumbers {

	public static void main(String[] args) {
		
    List<Integer> numbers = Arrays.asList(4,5,20,30,6);
    
    //filter and print
    numbers.stream()
           .filter(num -> num % 5 == 0)
           .forEach(num -> System.out.println(num));
	}

}
