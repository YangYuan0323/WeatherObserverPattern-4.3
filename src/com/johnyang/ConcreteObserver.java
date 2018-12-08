package com.johnyang;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者对象
 * @author yangyuan
 *
 */
public class ConcreteObserver implements Observer {
	private String observerName;

	@Override
	public void update(Observable o, Object arg) {
		//推的方式
		System.out.println(observerName+"收到了消息，目标推送过来的是"+arg);
		System.out.println(observerName+"收到了消息，主动到目标对象中去拉，拉的内容是"+((ConcreteWeatherSubject)o).getContent());
		
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
	
}
