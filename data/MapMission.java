package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		//이름과 점수를 한쌍으로 한 Map 자료구조를 구현하자
		//김자바 : 100, 박 자바 : 50 ~~
		//시험 응시자(key) =>KeySet()
		//점수 (value) =>values() :collention
		
		HashMap<String, Integer>map= new HashMap<String, Integer>();
		
		map.put("니아바",new Integer(100));
		map.put("아타어",new Integer(98));
		map.put("비나다",new Integer(82));
		map.put("내다르",new Integer(77));
		map.put("메타어",new Integer(65));
		
		Set set = map.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry e =(Map.Entry)iter.next();
			System.out.println("이름:" + e.getKey()+",점수" + e.getValue());
		}
		
		set=map.keySet();
		System.out.println("참가자 명단 :" + set);
		
		Collection values = map.values();
		iter = values.iterator();
		
		int total =0;
		
		while(iter.hasNext()) {
			Integer i = (Integer)iter.next();
			total += i.intValue();
		}
		
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + (float)total/set.size());
		System.out.println("최고점수 :" + Collections.max(values));
		System.out.println("최저점수 :" + Collections.min(values));
	}

}
