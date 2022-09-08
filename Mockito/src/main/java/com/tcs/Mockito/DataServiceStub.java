package com.tcs.Mockito;


public class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		return new int[]{24,6,15};
	}

}
