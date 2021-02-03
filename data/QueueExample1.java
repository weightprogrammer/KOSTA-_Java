package kosta.data;

import java.util.LinkedList;

public class QueueExample1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("토끼");
		queue.offer("사자");
		queue.offer("하마");
		while(!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}

	}

}
