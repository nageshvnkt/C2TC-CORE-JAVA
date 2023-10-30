package Generic;

class MyGen<T>
{  
	T a;  
	void add(T a)
	{
		this.a=a;
	}  
	T get()
	{
		return a;
	}  
}  

public class GenericEx1 {

	public static void main(String[] args) {
			MyGen<Integer> m=new MyGen<Integer>();  
			m.add(2);  
	     	System.out.println(m.get());  
	     	
	     	MyGen<String> m2=new MyGen<String>();
	     	m2.add("Manohar");
	     	System.out.println(m2.get());
	}

}
