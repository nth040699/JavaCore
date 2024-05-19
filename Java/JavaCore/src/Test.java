
public class Test {
	public static void main(String[] args) {
		Caculator objCaculator =  new Caculator();
		
		int add = objCaculator.add(1, 2);
		int sub = objCaculator.sub(1, 2);
		int div = objCaculator.div(3, 3);
		int mul = objCaculator.mul(3, 1);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}
	