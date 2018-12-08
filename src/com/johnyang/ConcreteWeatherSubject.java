package com.johnyang;

import java.util.Observable;
/**
 * 天气目标的具体实现类
 * @author yangyuan
 *
 */
public class ConcreteWeatherSubject extends Observable {
	private String content;//天气情况的内容

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.setChanged();
		this.notifyObservers(content);//推方法的实现
//		this.notifyObservers();//拉的方式
	}
	

}
