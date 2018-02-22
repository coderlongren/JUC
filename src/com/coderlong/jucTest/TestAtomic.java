package com.coderlong.jucTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��5�� ����9:45:36
* ��˵��: 
*/
public class TestAtomic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicDemo ad = new AtomicDemo();
		
		for (int i = 0; i < 10; i++) {
			new Thread(ad).start();
		}
	}

}
class AtomicDemo implements Runnable{
	
//	private volatile int serialNumber = 0;
	
	private AtomicInteger serialNumber = new AtomicInteger(0);

	@Override
	public void run() {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		
		System.out.println(getSerialNumber());
	}
	
	public int getSerialNumber(){
		return serialNumber.getAndIncrement();
	}
	
	
}
