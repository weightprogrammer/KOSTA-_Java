package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String, String> map =
				new HashMap<String, String>();
		
		map.put("1", "NC");
		map.put("2", "두산");
		map.put("3", "삼성");
		
		System.out.println("요소의 사이즈 :" + map.size());
		
		if(map.containsValue("두산")) {
			map.remove("2");
		}
		System.out.println("요소의 사이즈 :" + map.size());
		//System.out.println(map.get("1"));
		
		//Map 키를 알아야 전체목록을 출력할수 있다.
		//Map => Set => Iterator
		//map.ketset 은 키만 밸류는 밸류만 모두는  entrySet
		Set set = map.entrySet();
		Iterator iter = set.iterator();//map에 키와 밸류가 다 들어있다.
		//Iterator 는 서로 다른 구조들 이랑 일관성있는 데이터 구조를 사용하기 위해서
		while(iter.hasNext()) {
			Map.Entry<String, String> e =
					(Map.Entry<String, String>)iter.next();
			
			System.out.println("Key:" +e.getKey() + 
					"value :"+ e.getValue());
		}
	}

}
