package SingletonDesignPattern;
public class Singleton {
	private static Singleton single;

	private Singleton() {
		if (single != null)
			throw new RuntimeException("Exception: Cannot Initialize object using Reflection since object already created.");
	}
	public static Singleton getSingleton(){
		if(single==null){
			synchronized(Singleton.class){
				if(single==null){
					single=new Singleton();
				}
			}
		}
		return single;
	}
	
	public void print(){
		System.out.println("Welcome Singleton Object");
	}
	
	public static void main(String[] args)throws Exception{
		Singleton s=getSingleton();
		s.print();
		System.out.println(s);
		
	}
}