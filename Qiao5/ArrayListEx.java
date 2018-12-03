import java.util.ArrayList; 
import java.util. Iterator;
import java.util.*;
class ArrayListEx
{ 
public static void main(String args[])
{ 

ArrayList<String> name=new ArrayList<String>(); 
name.add("Ray"); 
name.add("Tom"); 
name.add("Sara"); 
name.add("Mary");
name.add(1,"Twiet");
name.get(0);
//name.set(1,"Tom");
boolean has = name.contains("Tom");
int location = name.indexOf("Twiet");
int Num= name.size();
//name.clear();
name.isEmpty();
Iterator itr = name.iterator();
while(itr.hasNext())
System.out.println(name);



System.out.println(name); 
System.out.println(Num); 
System.out.println(location);
System.out.println(has);
System.out.println(name.isEmpty());

} 
}
