import java.util.Scanner;

public class Calculator1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("計算を行います");
	System.out.print("1つ目の値を入力してください：");
	double num1 = scanner.nextDouble();
	
	System.out.print("２つ目の値を入力してください：");
	double num2 = scanner.nextDouble();
	
	System.out.println("演算子を選択してください。");
	System.out.println("１：足し算＋");
	System.out.println("２：引き算－");
	System.out.println("３：掛け算×");
	System.out.println("４：割り算÷");
	System.out.print("数字を入力して選択してください。：");
	int operator = scanner.nextInt();
	
	switch(operator){
	case 1:
		double addition = num1 + num2;
		System.out.println("答えは" + addition + "です。");
		break;
	case 2:
		double subtraction = num1 - num2;
		System.out.println("答えは" + subtraction + "です。");
		break;
	case 3:
		double multiplication = num1 * num2;
		System.out.println("答えは" + multiplication + "です。");
		break;
	case 4:
		if (num2 == 0) {
		    System.out.println("エラー：割る数は0以外を入力してください。");
		    break;
		}

		double division = num1 / num2;
		System.out.println("答えは" + division + "です。");
		break;
		
		default:
			System.out.println("無効な数字です。１～４を入力してください");	
			break;
		
	}
	scanner.close();
 }
}
