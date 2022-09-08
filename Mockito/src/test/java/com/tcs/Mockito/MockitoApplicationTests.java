package com.tcs.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class MockitoApplicationTests {

	//Run with Annotations
	@Mock
	DataService mockService;
	
	@InjectMocks
	SomeBusinessImp someBusinessImp;
	
	@Test
	void findTheGreatestValue_3values() {
		//Stub Method
//		SomeBusinessImp someBusinessImp = new SomeBusinessImp(new DataServiceStub());
		
		
		//Mock Method
		//DataService mockService = mock(DataService.class);
		when(mockService.retriveAllData()).thenReturn(new int[] {5,24,15});
		//SomeBusinessImp someBusinessImp = new SomeBusinessImp(mockService);
//		int sum = someBusinessImp.findTheGreatestFromAllData();
		assertEquals(24,someBusinessImp.findTheGreatestFromAllData());
		System.out.println("adios");
	}
	
	@Test
	void findTheGreatestValue_1value() {
		when(mockService.retriveAllData()).thenReturn(new int[] {15});
		assertEquals(15,someBusinessImp.findTheGreatestFromAllData());
		System.out.println("adios");
	}
	
	@Test
	void findTheGreatestValue_novalue() {
		when(mockService.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,someBusinessImp.findTheGreatestFromAllData());
		System.out.println("adios");
	}
	
//	@SuppressWarnings("deprecation")
	@Test
	void mockitoList() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(10);
		assertEquals(10,mockList.size());
		System.out.println("Mockito Size");
	}
	
	@Test
	void mockitoListTwo() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(10).thenReturn(20);
		assertEquals(10,mockList.size());
		assertEquals(20,mockList.size());
		System.out.println("Mockito Size 2");
	}
	
	@Test
	void mockitoGet() {
		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("SomeString");
		assertEquals("SomeString",mockList.get(0));
		assertEquals(null,mockList.get(1));
		System.out.println("Mockito get");
	}
	
	@Test
	void mockitoGetTwo() {
		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString",mockList.get(0));
		assertEquals("SomeString",mockList.get(1));
		System.out.println("Mockito get 2");
	}

}
