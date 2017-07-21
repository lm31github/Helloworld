package com.entertainment.test;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

import com.entertainment.Catalog;
import com.entertainment.ColorTelevision;
import com.entertainment.PortableTelevision;
import com.entertainment.Television;
import com.entertainment.Volume;

public class TelevisionTest {

	public static void main(String[] args) {		
		
		// Set the specific values 
		//Television tv1 = new Television();
		//tv1.setBrand("RCA");
		//tv1.setVolume(10);
		
		Television[] tvArray = new Television[args.length];
		
		
		for (int p = 0; p < args.length; p=p+2){
			tvArray[p] = new Television(args[p],Integer.parseInt(args[p + 1]),"0");
			tvArray[p].gotoChannel("12");
			System.out.println(tvArray[p].toString());	
		}
		
		ColorTelevision colorTelevision;
		colorTelevision = new ColorTelevision("Sony",12,"10",4);
		
		PortableTelevision portableTelevision;
		portableTelevision = new PortableTelevision("RCA",12,"11",100);
		
		ColorTelevision colorTelevision2;
		colorTelevision2 = new ColorTelevision("RCA",12,"10",4);
		
		System.out.println("Poloymorphism: ");
		System.out.println(colorTelevision.toString()); 
		System.out.println(portableTelevision.toString());
		
		Volume[] volumes = new Volume[3];
		
		volumes[0] = colorTelevision;
		volumes[1] = portableTelevision;
		volumes[2] = colorTelevision2;
		
		
		for(Volume volume : volumes) {
			volume.setVolume(4);
			System.out.println(volume.toString());
		}
		
		Catalog.searchByBrand("RCA");

		ArrayList<Television> arrayList = new ArrayList();
		arrayList.add(colorTelevision); 
		arrayList.add(colorTelevision2);
		arrayList.add(colorTelevision); 
		arrayList.add(colorTelevision2);
		
		System.out.println("Array List size is " + arrayList.size());
		
		HashSet<Television> hashSet = new HashSet<Television>();
		hashSet.add(colorTelevision);
		hashSet.add(colorTelevision);
		hashSet.add(colorTelevision2);
		hashSet.add(colorTelevision2);
		
		System.out.println("Hash Set size is " + hashSet.size());
		
		PreparedStatement ps = PreparedStatment("TEST");
		
		ps.setSQLXML(parameterIndex, xmlObject);
		
		// Set the values via constructors. 
		/*
		Television tv1 = new Television();
		Television tv2 = new Television("Hitachi", 17);
		Television tv3 = new Television("Over Max", 110);
		Television tv4 = new Television("Under Min", -2);
		*/
		
		// System.out.println("Brand = " + tv1.getBrand() + " Volume = " + tv1.getVolume());
		/* System.out.println("Brand = " + tv1.brand + " Volume = " + tv1.volume);*/  // Field is not visible
		// System.out.println(tv1.toString());
		
		
		/*
		System.out.println(tv2);
		System.out.println(tv3);
		System.out.println(tv4);
		*/
	}

}
