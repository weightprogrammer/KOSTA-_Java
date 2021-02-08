package kosta.Thread;

import java.util.ArrayList;
import java.util.List;

public class Manger {
	
	List<String> list = new ArrayList<String>();
	
	public synchronized void push(String threadName,String bread) {
		while(list.size() >= 2) {
			try {
				System.out.println(threadName + "´ë±â»óÅÂ");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		list.add(bread);
		this.notify();
		System.out.println(threadName + ":" + bread + "¸¸µë");
		System.out.println("Áø¿­Àå »§ °¹¼ö: "+ list.size());
	}
	
	public synchronized void pop (String threadName) {
		while(list.size() == 0) {
			try {
				System.out.println(threadName + "´ë±â»óÅÂ");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Áø¿­ »§°³¼ö: " + list.size());
		String bread = list.remove (list.size() -1);
		System.out.println(threadName + ":" + bread + "¸¸µë");
		this.notify();
	}
}
