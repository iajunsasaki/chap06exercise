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

		// 演習２．２上記userMapから、IDが4と6のユーザを取り出してそれぞれuser4とuser6変数に
		//   格納してください。user4とuser6をSystem.out.printlnして取り出せていることを確認してください
		User user4;
		User user6;
		
		// 演習３：Collectionsの使い方
		//   上で宣言されているusers変数をsortedListに内容を移し替えてください。
		//   
		List<User> sortedList = new ArrayList<>();
		
		// 演習４：Comparableについて
		//   UserクラスにcompareToメソッドがありますが、不具合があり、sortしてもIDが大きいものが先頭に来てしまいます。
		//   修正して、IDが小さなものが先頭にくるようにしてください
		Collections.sort(sortedList);
		
		for (User user : sortedList) {
			System.out.println(user);
		}
	}
}
