package practice;

public class SingletonDriver {

	public static void main(String[] args) {
		
		Singleton X = Singleton.getObject();
		
		Singleton Y = Singleton.getObject();
		
		Singleton Z = Singleton.getObject();
		
		System.out.println(X.hashCode());
		System.out.println(Y.hashCode());
		System.out.println(Z.hashCode());
		
	}
}
