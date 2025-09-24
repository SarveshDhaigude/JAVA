class Stack 
{
    int maxSize;
    int stackArray[];
    int top;

    Stack(int size) 
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) 
    {
        if (top == maxSize - 1) 
        {
            System.out.println("Stack is Overflow");
        } 
        else
        {
            stackArray[++top] = value;
            System.out.println(value + " is pushed in Stack");
        }
    }

    public int pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is Underflow");
            return -1;

        } 
        else 
        {
            int value = stackArray[top--];
            System.out.println(value + " is popped from Stack");
            return value;
        }
    }
}

class Stackdemo2 
{
    public static void main(String[] args) 
    {
        Stack s1 = new Stack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60); 

        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop(); 
    }
}
