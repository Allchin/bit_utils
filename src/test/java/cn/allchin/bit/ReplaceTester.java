package cn.allchin.bit;

import org.junit.Test;

import net.sunyijun.bit.BinStringHelper;
import net.sunyijun.bit.BitBuffer;

public class ReplaceTester {
	BitBuffer buffer = BitBuffer.allocate(32);
	@Test
	public void testPutAtAnyPzt() {
		 
		byte flag = 1;
		int rt = 36524;
		// 设置flag到最左边1位，
		// 设置rt 到右边7位置
		print(); 
		buffer.put(flag, 1);
		print();
		//
		byte[] bts = BitBuffer.allocate(32).put(rt, 32).array();
		System.out.println("rt|" +BinStringHelper.bytesToString(bts)); 	 
		buffer.put(rt ,31); 
		print();
		// repalce 
		buffer.put( (byte) 7 , 3, 3);
		print();
	}
	
	private void print(){
		System.out.println(BinStringHelper.bytesToString(buffer.array()));
	}
}
