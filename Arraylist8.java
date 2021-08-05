//8. Write a Java program to sort a given array list.
import java.util.*;
class Arraylist8
{
	public static void main(String args[])
	{
	 List<String> list=new ArrayList();
	 list.add("mango");
	 list.add("banana");
	 list.add("apple");
	 list.add("chiku");
	 System.out.println("list before sort: "+list);
	 Collections.sort(list);
	 System.out.println("list after sort: "+list);
	 }
}