package org.mallick.datastructure.hashtable.main;

import org.mallick.datastructure.hashtable.Person;
import org.mallick.datastructure.hashtable.PersonHashTable;

public class PersonHashTableRunner {

	public static void main(String[] args) {
		Person person1 = new Person("Kajal", "18-15", 24);
		Person person2 = new Person("Sukumar", "18-19", 64);
		Person person3 = new Person("Tania", "18-20", 34);
		Person person4 = new Person("Amit", "18-25", 44);
		

		//PersonLinkedList personList = new PersonLinkedList();
		PersonHashTable personHashTable = new PersonHashTable();
		
		/*personList.insertNode(person1);
		personList.insertNode(person2);
		personList.insertNode(person3);
		personList.insertNode(person4);
		
		personList.show();*/
		
		//System.out.println(personList.findPersonByRollNo("18-19").getPerson());
		
		/*System.out.println(personHashTable.getPersonHashCode(person1));
		System.out.println(personHashTable.getPersonHashCode(person2));
		System.out.println(personHashTable.getPersonHashCode(person3));
		System.out.println(personHashTable.getPersonHashCode(person4));*/
		
		personHashTable.addPerson(person1);
		personHashTable.addPerson(person2);
		personHashTable.addPerson(person3);
		personHashTable.addPerson(person4);
		
		/*System.out.println(personHashTable.getPersonFromHashTable(person1));
		System.out.println(personHashTable.getPersonFromHashTable(person2));
		System.out.println(personHashTable.getPersonFromHashTable(person3));
		System.out.println(personHashTable.getPersonFromHashTable(person4));*/
		
		//System.out.println(person);
		
		personHashTable.showAllData();
	}

}
