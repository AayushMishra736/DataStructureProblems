package LearningBasics;

public class CreateObjectWithCloneMethod implements Cloneable{

	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	String str = "Object Created Through String Method.";
	public static void main(String[] args) {
		CreateObjectWithCloneMethod obj1 = new CreateObjectWithCloneMethod();
		try {
			CreateObjectWithCloneMethod obj2 = (CreateObjectWithCloneMethod) obj1.clone();
			System.out.print(obj1.str);
		}
        catch(CloneNotSupportedException e) {
        	e.printStackTrace();
        }
	}
 }
