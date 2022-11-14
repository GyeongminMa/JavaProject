package com.yedam.chapter1101;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//HashMap -> Key, Value 데이터를 저장
		//
		HashMap<Key, String> hashmap = new HashMap<>();
		
		//new Key(1) ->1
		hashmap.put(new Key(1), "홍길동");
		
		//Key k1 = new Key(1);
		//Key k2 = new key(1);
		//서로 다른 주소를 가진 객체들
		
		//new Key(1) -> 2
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
		Key key = new Key(1);
		System.out.println(key.toString());
		
	}

}
