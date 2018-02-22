package com.coderlong.jucTest;

import java.util.concurrent.Callable;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月5日 下午10:36:47
* 类说明: 实现 Callable 接口。 相较于实现 Runnable 接口的方式，方法可以有返回值，并且可以抛出异常。
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
