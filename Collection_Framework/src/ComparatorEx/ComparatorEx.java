package ComparatorEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    int age;    
    String name;

    public void setAge(int age){
        this.age=age;    
    }
    public int getAge(){
        return this.age;    
    }
    public void setName(String name){
        this.name=name;    
    }
    public String getName(){    
        return this.name;    
    }
}
 class AgeComparator implements Comparator{

    public int compare(Object ob1, Object ob2){
        int ob1Age = ((Person)ob1).getAge();        
        int ob2Age = ((Person)ob2).getAge();

        if(ob1Age > ob2Age)
            return 1;
        else if(ob1Age < ob2Age)
            return -1;
        else
            return 0;    
    }
 }


public class ComparatorEx {
    public static void main(String args[]){
        /*Person person[] = new Person[3];

        person[0] = new Person();
        person[0].setAge(35);
        person[0].setName("A");

        person[1] = new Person();
        person[1].setAge(30);
        person[1].setName("B");

        person[2] = new Person();
        person[2].setAge(32);
        person[2].setName("C");

        System.out.println("Order of person before sorting is");
        for(int i=0; i < person.length; i++){
            System.out.println( person[i].getName() + "\t" + person[i].getAge());
        }

        Arrays.sort(person, new AgeComparator());
        System.out.println("\n\nOrder of person after sorting by person age is");

        for(int i=0; i < person.length; i++){
            System.out.println( person[i].getName() + "\t" + person[i].getAge());*/


	Person p1=new Person();
		p1.setAge(35);
		p1.setName("Raju");

	Person p2=new Person();
		p2.setAge(40);
		p2.setName("Kiran");

	Person p3=new Person();
		p3.setAge(20);
		p3.setName("Suresh");

	List list=new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);

	Collections.sort(list, new AgeComparator());

	for(Object obj:list)
	{
		Person p=(Person)obj;

		System.out.println(" "+p.getName()+"    "+p.getAge());
	}
        }


}
