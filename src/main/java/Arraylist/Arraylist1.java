package Arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
	    ArrayList<Integer> lists = new ArrayList<Integer>();
	    lists.add(15);
	    lists.add(14);
	    lists.add(13);
	    lists.add(11);
	    try{
	        FileOutputStream fos = new FileOutputStream("file");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(lists);
	        fos.close();
	        oos.close();
	        FileInputStream fis = new FileInputStream("file");
	        ObjectInputStream Ois = new ObjectInputStream(fis);
	        ArrayList list = (ArrayList)Ois.readObject();
	        System.out.println(list);
	    }catch(Exception exception) {
	    	System.out.println(exception);
	    }

	}

}
