package com.tcs.springboot.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithms {
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
