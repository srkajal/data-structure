package org.mallick.datastructure.hashtable;

import java.util.Arrays;

import org.mallick.datastructure.hashtable.PersonLinkedList.Node;

public class PersonHashTable {
	PersonLinkedList[] hashTable;

	public PersonHashTable() {
		hashTable = new PersonLinkedList[5];
	}
	
	public void addPerson(Person person) {
		int index = getPersonHashCode(person);
		
		if(hashTable[index] != null) {
			hashTable[index].insertNode(person);
		}
		else {
			
			PersonLinkedList pList = new PersonLinkedList();
			
			pList.insertNode(person);
			
			hashTable[index] = pList;
		}
	}
	
	public Person getPersonFromHashTable(Person person) {
		int index = getPersonHashCode(person);
		
		PersonLinkedList pList = hashTable[index];
		
		Node node = pList.findPersonByRollNo(person.getRollNo());
		
		return node.getPerson();
		
	}
	
	public void showAllData() {
		Arrays.stream(hashTable).filter(p->p!=null).forEach(t->t.show());
	}

	public int getPersonHashCode(Person persoon) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((persoon.getRollNo() == null) ? 0 : persoon.getRollNo().hashCode());
		
		result = result %5;
		return result;
	}
}
