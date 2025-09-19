import java.util.Scanner;

class Node {
    int Seatno;
    Node next;

    Node(int Seatno) {
        this.Seatno = Seatno;
        this.next = null;
    }
}

class Linkedlist {
    Node head;

    public void insert(int Seatno) {
        Node n1 = new Node(Seatno);
        if (head == null) {
            head = n1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Seatno + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class Railway {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        Linkedlist l1 = new Linkedlist();

        System.out.print("Enter number of seats to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " seat numbers:");
        for (int i = 0; i < n; i++) {
            int seat = sc.nextInt();
            l1.insert(seat);
        }

        System.out.println("Railway seats are:");
        l1.show();
    }
}
