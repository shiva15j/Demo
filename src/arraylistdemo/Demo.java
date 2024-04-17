package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(20);
		list.add(56);
		list.add(34);
		list.add(23);

		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

		list.add(39);
		list.add(37);
		list.add(78);
		list.add(65);

		System.out.println(" ");
		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

		list.remove(2);
		System.out.println(" ");
		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

		System.out.println(" ");

		for (Integer ele : list) {
			System.out.println(ele);
		}

	}

}
