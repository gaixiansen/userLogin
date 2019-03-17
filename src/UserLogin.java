import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		String userName = "admin";
		String userPasswd = "udn100@HW";
		int maxLoginTimes = 3;
		for (int i = 0; i < maxLoginTimes; i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String userInputName = sc.nextLine();
			System.out.println("请输入用户密码：");
			String userInputPasswd = sc.nextLine();
			if (userName.equals(userInputName) && userPasswd.equals(userInputPasswd)){
				System.out.println("欢迎" + userName);
				break;
			}
			else {
				System.out.println("用户名或密码输入错误");
				if (i == 2){
					System.out.println("三次都输不对，你个智障");
				}
				else {
					System.out.println("你还剩" + (maxLoginTimes-1-i) + "次机会");
				}
			}

		}
	}
}
