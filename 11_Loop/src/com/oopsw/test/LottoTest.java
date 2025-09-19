package com.oopsw.test;
import java.util.Date;
import java.util.Random;

//UI ¿ªÈ°
public class LottoTest {
	public static void main(String[] args) {
		System.out.println(new Date().toString());  //1
		System.out.println(Math.random());          //2
		Random r=new Random();                      //3
		System.out.println(r.nextInt(2));
	}
}