package practise;
import java.util.HashMap;
import java.util.Map;

class Person {
      Person(){}
      Person(Person p) {
            this.name = p.name;
      }
      String name;
}

public class MapExample {
      public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Person();
            Person p3 = new Person();
            p1.name = "person1";
            p2.name = "person2";
            p3.name = "person3";
            
            //Map with key = string, value = object
            Map<String, Person> map = new HashMap<String, Person>();
            map.put("p1", p1);            
            map.put("p2", p2);
            map.put("p3", p3);
            System.out.println("Map with key = string, value = object");
            System.out.println(map);
            
           //Map with key = object, value = string
            Map<Person, String> maprev = new HashMap<Person, String>();
            maprev.put(p1, "p1");         
            maprev.put(p2, "p3");
            maprev.put(p3, "p2");
            
            System.out.println("Map with key = object, value = string");
            System.out.println("p1 : " + maprev.get(p1));
            System.out.println(maprev);
            
            //Map with same ref var with diff objects
            Map<Person, String> maprefvars = new HashMap<Person, String>();
            maprefvars.put(p1, "p1");
            p1 = new Person(p2);//here new object is created this object is not equal to p2
            maprefvars.put(p1, "p2");
            p1 = p3;// same object id referenced here 
            maprefvars.put(p1, "p3");
            
            System.out.println("maprefvars : "+maprefvars);
            System.out.println("p1.name : "+p1.name);//line 49
            p3.name = "pppp";//line 50
            System.out.println("p1.name : "+p1.name);// line 51
            //from line 49 - 51 we can understand same object is referenced by two reference variables
            //i.e., watever changes done in p1 will reflect in p3 also and vice versa.
            
            //Map with Strings
            String one = new String("one");
            String two = new String("two");
            String three = new String("three");
            Map<String, String> mapofStrings = new HashMap<String, String>();
            mapofStrings.put("1", one);
            mapofStrings.put("2", two);
            mapofStrings.put("3", three);
            
            System.out.println(mapofStrings);
            Map<String, String> mapofStringsrev = new HashMap<String, String>();
            mapofStringsrev.put(one, "1");
            mapofStringsrev.put(two, "2");
            mapofStringsrev.put(three, "3");
            
            System.out.println(mapofStringsrev);//unlike object keys of other classes, String object keys set keys as their value but not object reference as key. 
            System.out.println(mapofStringsrev.get(one));
            System.out.println(mapofStringsrev.get(new String("one")));
            
      }
}

