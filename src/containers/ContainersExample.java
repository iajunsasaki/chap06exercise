package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainersExample {
	public static void main(String[] args) {
		// 演習１：ArrayListの使い方
		//   下にintarrayとintlistという変数があります。
		//   intarrayの内容をintlistに入れ替えて，内容をすべてSystem.out.printlnで表示させてください
		int[] intarray = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> intlist = new ArrayList<>();
		
		for (int value : intarray) {
			// intlistには基本型のintではなく、クラス型のIntegerを持っているが
			// 自動的に変換される
			intlist.add(value);
		}
		
		System.out.println("1から10まで表示させます START");
		for (Integer value : intlist) {
			System.out.println(value);
		}
		System.out.println("1から10まで表示させます END");

		// 演習２．１：HashMapの使い方
		//   下にusersという配列型の変数があります。userMap.putメソッドを呼び出して、
		//   usersに格納されているデータをすべてuserMapに格納してください。
		User[] users = {
				new User(9, "sato", 22, "sato@classb.com"),
				new User(1, "sakamoto", 20, "sakamoto@classb.com"),
				new User(5, "miura", 30, "miura@classb.com"),
				new User(3, "sakano", 25, "sakano@classb.com"),
				new User(2, "fujimoto", 23, "fujimoto@classb.com"),
				new User(10, "suzuki", 24, "suzuki@classb.com"),
				new User(4, "aoki", 15, "aoki@classb.com"),
				new User(7, "fukumoto", 28, "fukumoto@classb.com"),
				new User(8, "maeda", 43, "maeda@classb.com"),
				new User(6, "kubo", 31, "kubo@classb.com"),
		};

		// userIdとUserオブジェクトのMap
		Map<Integer, User> userMap = new HashMap<>();

		for (User user : users) {
			// user_idを取り出す。
			int userid = user.getId();
			// HashMapはint型のuser_idとUser型のオブジェクトをセットで格納する
			userMap.put(userid, user);
		}
		
		// 演習２．２上記userMapから、IDが4と6のユーザを取り出してそれぞれuser4とuser6変数に
		//   格納してください。user4とuser6をSystem.out.printlnして取り出せていることを確認してください
		User user4 = userMap.get(4);
		System.out.println(user4);
		
		User user6 = userMap.get(6);
		System.out.println(user6);
		
		// 演習３：Collectionsの使い方
		//   上で宣言されているusers変数をsortedListに内容を移し替えてください。
		//   
		List<User> sortedList = new ArrayList<>();
		for (User userholder : users) {
			sortedList.add(userholder);
		}
		
		// 演習４：Comparableについて
		//   UserクラスにcompareToメソッドがありますが、不具合があり、sortしてもIDが大きいものが先頭に来てしまいます。
		//   修正して、IDが小さなものが先頭にくるようにしてください
		Collections.sort(sortedList);
		
		for (User user : sortedList) {
			System.out.println(user);
		}
	}
}
