import java.util.*;
public class main {
	static class Node {
		public int value;
		public Node next;
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
	static class LinkedList {
		public Node head;
		public Node tail;
		public int size;
		public LinkedList() {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		public void insert(int value) {
			if (size == 0) {
				this.head = new Node(value);
				this.tail = this.head;
			} else {
				Node temp = this.tail;
				this.tail = new Node(value);
				temp.next = this.tail;
			}
			size++;
		}
		public void print() {
			Node current = head;
			while (current != null) {
				System.out.print(current.value + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		a.insert(7);
		a.insert(1);
		a.insert(6);
		LinkedList b = new LinkedList();
		b.insert(5);
		b.insert(9);
		b.insert(2);
		Node current1 = a.head;
		Node current2 = b.head;
		boolean carrier = false;
		LinkedList c = new LinkedList();
		while (current1 != null || current2 != null) {
			int sumDigit = (current1 == null ? 0 : current1.value) + (current2 == null ? 0 : current2.value);
			int sumDigitWithCarrier = sumDigit + (carrier ? 1 : 0);
			if (sumDigitWithCarrier >= 10) {
				c.insert(sumDigitWithCarrier%10);
				carrier = true;
			} else {
				c.insert(sumDigitWithCarrier);
				carrier = false;
			}
			if (current1 != null) current1 = current1.next;
			if (current2 != null) current2 = current2.next;
		}
		if (carrier == true) c.insert(1);
		c.print();
	}

}
