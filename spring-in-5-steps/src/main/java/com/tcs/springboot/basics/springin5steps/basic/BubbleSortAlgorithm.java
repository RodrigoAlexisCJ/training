package com.tcs.springboot.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
//@Primary
public class BubbleSortAlgorithm implements SortAlgorithms{
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
