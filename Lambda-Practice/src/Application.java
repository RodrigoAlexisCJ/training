
public class Application {

	public static void main(String[] args) {
		Human tom = new Human();
		walker(tom);
		Robot walle = new Robot();
		walker(walle);
		//Anonymous Expression
		walker(new Walkable() {

			@Override
			public void walk() {
				System.out.println("Customer Object Walking......");
			}
			
		});
		//Lambda Expression
		walker(()->System.out.println("Customer Object Walking......"));
		
//		walker(()-> {
//			System.out.println("Hello");
//			System.out.println("This");
//			System.out.println("Is");
//			System.out.println("Lambda Expression");
//		});
		
//		ALambdaInterface aBlockOfCode = ()-> {
//			System.out.println("Hello");
//			System.out.println("This");
//			System.out.println("Is");
//			System.out.println("Lambda Expression");
//		};
		
		Walkable aBlockOfCode = ()-> {
			System.out.println("Hello");
			System.out.println("This");
			System.out.println("Is");
			System.out.println("Lambda Expression");
		};
		
		walker(aBlockOfCode);
		
		ALambdaInterface helloVar=()->{
			System.out.println("Hello there");
		};
		
		Reverse rev = (str)->{
			String result = "";
			for(int i = str.length()-1;i>=0;i--) {
				result += str.charAt(i);
			}
			System.out.println(result);
		};
		
		Factorial fac = (num)->{
			int result = 1;
			for(int i=1; i<=num ;i++) {
				result = i*result;
			}
			System.out.println("Factorial of "+num+" is "+result);
		};
		
		NonZero noVar = (a,b) -> b==0?0:a/b;
		
		Calculate sumVar = (a,b)-> a+b;
		
		System.out.println("Calculate of :" + sumVar.compute(4, 5));
		
		helloVar.someMethod();
		
		System.out.println("Result of: "+noVar.nonZeroMethod(9, 8));
		
		rev.reverse("Hola");
		
		fac.fact(8);
	}
	public int nonZeroDiv(int arg1, int arg2) {
		int a = arg2 == 0 ? 0:arg1/arg2;
		return a;
	}
	
	public void sayHello() {
		System.out.println("Hello there....");
	}
	
	public int sum(int a , int b) {
		return a+b;
	}
	
	public void reverseWord(String str) {
		String result = "";
		for(int i = str.length()-1;i>=0;i--) {
			result += str.charAt(i);
		}
		System.out.println(result);
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
	
	public void factorial(int num) {
		int result = 1;
		for(int i=1; i<=num ;i++) {
			result = i*result;
		}
		System.out.println("Factorial of "+num+" is "+result);
	}

}
@FunctionalInterface
interface Calculate{
	public int compute(int a,int b);
}

@FunctionalInterface
interface NonZero{
	public double nonZeroMethod(double a, double b);
}

@FunctionalInterface
interface Reverse{
	public void reverse(String str);
}

@FunctionalInterface
interface Factorial{
	public void fact (int num);
}

@FunctionalInterface
interface MyGenericInterface <T>{
	public T work (T arg);
}