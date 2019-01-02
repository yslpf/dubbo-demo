package com.test.service;

public class TestServiceImpl implements TestService {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		System.out.println("test success");
		return "提供者1实现具体接口逻辑";
	}

}
