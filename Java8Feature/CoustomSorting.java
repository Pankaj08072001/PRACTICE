package Java8Feature;
import java.util.*;

public class CoustomSorting{
	public static void main(String[] args) {
		// List <Integer> al = new ArrayList<>();
		// al.add(5);
		// al.add(4);
		// al.add(6);
		// al.add(2);
		// al.add(1);
		// al.add(5);
		// al.add(9);
		// al.add(11);
		// al.add(7);
		// al.add(13);
		//  Collections.sort(al , (a,b)-> (b-a)); with the help of comparator
		//  System.out.println(al);
		Student s1 = new Student(1, "Pankaj");
		Student s2 = new Student(4, "Muskan");
		Student s3 = new Student(3, "Manisha");
		Student s4 = new Student(2, "Aman");

// Object sorting with lambdaExpression and Compartaor
		List <Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al, (a,b)->b.id -a.id);
		System.out.println(al);
		
	}
	static class Student{
		public Integer id;
		public String name ;
	
	
		public Student(Integer id , String name){
			this.id=id;
			this.name=name;
		}
		public String toString(){
			return this.id + " "+ this.name;
		}
	} 
}
