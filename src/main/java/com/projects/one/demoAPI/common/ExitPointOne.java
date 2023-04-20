package com.projects.one.demoAPI.common;



public class ExitPointOne implements Pointer {

	public ExitPointOne() {
		System.out.println("In constructor :" + getClass().getSimpleName());
		
	}
	
	@Override
	public String getPointer() {
		// TODO Auto-generated method stub
		return "Exiting through Exit Point One";
	}

}