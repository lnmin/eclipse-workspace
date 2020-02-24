package com.heima.List;

import java.util.Enumeration;
import java.util.Vector;

public class Demo5_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.addElement("a");
		v.addElement("v");
		v.addElement("c");
		v.addElement("f");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
