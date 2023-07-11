package LearningBasics;

public class CreateObjectWithNewInstanceMethod {

	void show() {
		System.out.print("Show method using new instance method.");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	try {
		Class cls = Class.forName("CreateObjectWithNewInstanceMethod");
		
		CreateObjectWithNewInstanceMethod obj = (CreateObjectWithNewInstanceMethod) cls.newInstance();
	
		obj.show();
	}
    catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	}

}
