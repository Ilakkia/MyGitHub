
package test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class collectionex {
public static void main(String[] args){
	//creating list
	List<Integer> l1=new ArrayList<Integer>();
	//adding elements to list
	l1.add(1);
	l1.add(2);
	l1.add(1);
	l1.add(3);
	l1.add(4);
	l1.add(1);
	l1=Collections.unmodifiableList(l1);//Read-Only collection
	//Collections.replaceAll(l1, 1, 100);
	
	int size=l1.size();
	//traversing collection
	Iterator<Integer> iterator = l1.iterator();
	System.out.println("collection list");
	System.out.println("List Size:"+ " "+size);//returns size of list
	while (iterator.hasNext())
	System.out.println(iterator.next());
	
	// creating map with integer key and integer value
	Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
	//adding elemnts to map
	m1.put(1,8);
	m1.put(1,3);//overwrites the value of  key 1 from 8 to 3
	m1.put(2,4);
	m1.remove(2);//deletes the element with key 2
	m1.put(3,5);
	m1.put(4,7);

	//iterating collection to return values
	Collection<Integer> c1=m1.values();
	Iterator<Integer> iterator1=c1.iterator();
	System.out.println("Map ValueList");
	while(iterator1.hasNext())
	System.out.println(iterator1.next());
	
	//iterating collection to return keyset
	Collection<Integer> c2=m1.keySet();
	Iterator<Integer> iterator2=c2.iterator();
	System.out.println("Map Keylist");
	while(iterator2.hasNext())
	System.out.println(iterator2.next());
	
	//iterating collection to return entry set
	Set<Entry<Integer, Integer>> c3=m1.entrySet();
	Iterator<Entry<Integer, Integer>> iterator3=c3.iterator();
	System.out.println("Map Entryset Values");
	while(iterator3.hasNext())
	System.out.println(iterator3.next());
	
//creating a map with key of string type and values of list type
Map<String,List<String>> mp=new HashMap<String,List<String>>();


List<String> frstmap=new ArrayList<String>();
frstmap.add("Apple");
frstmap.add("Banana");
frstmap.add("Orange");

List<String> secmap=new ArrayList<String>();
secmap.add("Bus");
secmap.add("Train");
secmap.add("Car");

mp.put("Fruits", frstmap);
mp.put("Vehicle", secmap);


System.out.println("frstmap values:: "+mp.get("Fruits"));
Set<Entry<String, List<String>>> c4=mp.entrySet();
Iterator<Entry<String, List<String>>> iterator4=c4.iterator();
System.out.println("MultiMap Entryset Values");
while(iterator4.hasNext())
System.out.println(iterator4.next());



Map<List<String>,String> mp1=new HashMap<List<String>,String>();

mp1.put(frstmap,"Fruits");
mp1.put(secmap,"Vehicle");
System.out.println(mp1);
//Collection<List<String>,String>cp=m1.values();

System.out.println("frstmap values:: "+mp1.get("frstmap"));
for(List<String>key: mp1.keySet()){
	System.out.println("Multi keyset Values");
    System.out.println(key  +" :: "+ mp1.get(key));
    
}
}
}