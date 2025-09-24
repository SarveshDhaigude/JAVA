class Queue
{
	int maxSize;
	int QueueArray[];
	int front;
	int rear;
	int count;
	Queue(int size)
	{
		maxSize=size;
		QueueArray=new int[maxSize];
		front=0;
		rear=-1;
		count=0;
	}
	public void enQueue(int value)
	{
		if(rear==maxSize-1)
		{
			System.out.println("Queue is FULL.Can not add item");
		}
		else
		{
			rear=(rear+1) % maxSize;
			QueueArray[rear]=value;
			System.out.println(value +" is added in Queue");
			
			count++;
		}
	}
	public  void deQueue()
	{
		if(rear==-1)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("\n"+QueueArray[front]+"is removed");
			front=(front+1)%maxSize;
			count--;
		}
	}
	public void display()
	{
		if(rear==-1)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Queue Elements are:");
			for(int i=0;i<count;i++)
			{
				int index=(front+1)%maxSize;
				System.out.print(QueueArray[i]+"\t");
			}
		}
	}
}
class QueueDemo2
{
	public static void main(String s[])
	{
		Queue q1=new Queue(5);
		q1.enQueue(12);
		q1.enQueue(11);
		q1.enQueue(10);
		q1.enQueue(8);
		q1.enQueue(7);
		
		q1.display();
	 	q1.deQueue();
	  	q1.deQueue();
	  	q1.deQueue();
	  	
	  	q1.display();
	  	
}		
		
	  	
	 }
			
			
			
			
			
			
			
			
			
			
			
