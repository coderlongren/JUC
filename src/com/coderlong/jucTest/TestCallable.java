package com.coderlong.jucTest;

import java.util.concurrent.Callable;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��5�� ����10:36:47
* ��˵��: ʵ�� Callable �ӿڡ� �����ʵ�� Runnable �ӿڵķ�ʽ�����������з���ֵ�����ҿ����׳��쳣��
*/
public class TestCallable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class ThreadDemo implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		
		for (int i = 0; i <= 100000; i++) {
			sum += i;
		}
		
		return sum;
	}
	
}
