package com.johnyang;

public class Client {

	public static void main(String[] args) {
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		
		ConcreteObserver girl = new ConcreteObserver();
		girl.setObserverName("黄明的女朋友");
		
		
		ConcreteObserver mum = new ConcreteObserver();
		mum.setObserverName("黄明的老妈");
		
		subject.addObserver(girl);
		subject.addObserver(mum);
		subject.setContent("天气晴，气温28度");
		

	}

}
