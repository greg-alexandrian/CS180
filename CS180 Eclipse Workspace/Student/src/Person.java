
public class Person {
	private String name;
	private static int count;
	
	public Person(String name){
		this.name = name;
		count++;
	}
	public static int getCount(){
		return count;
	}
	public void finalize(){
		System.out.println(name + " is destroyed");
		count--;
		System.out.println("Inside finalizer we set count to " + count);
	}
	
	public static void main(String [] arg){
		System.out.println(getCount());
		Person a = new Person("Greg");
		System.out.println(getCount());
		a = null;
		System.gc();
		int total = 0;
		for (int i = 1; i < 1000000; i++){
			total +=i;
		}
		
		System.out.println(getCount());
		
	}
}
