class Node
{
    int rollno;
    String name;
    int marks;
    int ID;
    Node next;
    Node(int rollno, String name, int marks, int ID)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.ID = ID;
        this.next = null;
    }
}

class Linkedlist
{
    Node head;

    public void insert(int rollno, String name, int marks, int ID)
    {
        Node n1 = new Node(rollno, name, marks, ID);
        if (head == null)
        {
            head = n1;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = n1;
    }

    public void delete(int rollno)
    {
        if (head == null) // empty list
        {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // If head node itself holds the rollno to be deleted
        if (head.rollno == rollno)
        {
            head = head.next;
            System.out.println("Deleted node with rollno: " + rollno);
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.rollno != rollno)
        {
            prev = temp;
            temp = temp.next;
        }

        // If rollno was not found in list
        if (temp == null)
        {
            System.out.println("Node with rollno " + rollno + " not found.");
            return;
        }

        // Unlink the node from linked list
        prev.next = temp.next;
        System.out.println("Deleted node with rollno: " + rollno);
    }

    public void show()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.rollno + " " + temp.name + " " + temp.marks + " " + temp.ID + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class Sample
{
    public static void main(String s[])
    {
        Linkedlist l1 = new Linkedlist();
        l1.insert(16, "sarvesh", 100, 1053);
        l1.insert(20, "Rudresh", 90, 1054);
        l1.insert(30, "prem", 89, 1065);
        l1.insert(40, "YEN", 78, 1066);
        l1.insert(50, "SAM", 79, 1077);
        l1.insert(100, "dentist", 55, 1023);

        System.out.println("Linkedlist is:");
        l1.show();

        // Delete node with rollno 30
        l1.delete(30);

        System.out.println("After deletion:");
        l1.show();

        // Try deleting a non-existing node
        l1.delete(999);
    }
}

