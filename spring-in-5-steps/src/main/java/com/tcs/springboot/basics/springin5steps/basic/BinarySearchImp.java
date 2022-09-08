package com.tcs.springboot.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImp {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithms sortAlgorithm;
	
//	public BinarySearchImp(SortAlgorithms bubbleSortAlgorithm) {
//		super();
//		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int numberToSearchOf) {
		
		int[] sortNumbers=sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
	@PostConstruct
	public void postConstruct(){
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy(){
		logger.info("preDestroy");
	}
}
