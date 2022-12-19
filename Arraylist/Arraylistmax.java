package Arraylist;

import java.util.ArrayList;

public class Arraylistmax {

	public static void main(String[] args) {
		ArrayList<Integer> hm = new ArrayList<>();
		hm.add(10000);
		hm.add(11000);
		hm.add(12000);
		hm.add(13000);
		hm.add(14000);
    int max = hm.get(0);
    for(int i = 0;i< hm.size();i++) {
    if(max < hm.get(i)) {
    		max = hm.get(i);
    	    }
        }
    System.out.print(max);
	
    	}

	}


