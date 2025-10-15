import java.util.Scanner;
public class EmployeeSalary1
{
     public static void employeeSalary(float arr[])//bubbleSort method.
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    float temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
            
        Scanner sc =new Scanner(System.in);
         System.out.println("===You have to Enter at least 5 Employee Salaries!===");
        System.out.println("Enter the Number of Employee:");
        int size=sc.nextInt();
        float arr[]=new float[size];
        System.out.println("Enter the Salaries of the Employee:");
        for(int i=0;i<arr.length;i++)
        {   
            arr[i]=sc.nextFloat();
        }
            
        System.out.println("Employee Salaries before sort:");
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"  ");
            }
            System.out.println("\n");
        }

        employeeSalary(arr);//calling the function of selectionSort

        System.out.println("Employee Salaries after sort");//array after sort
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println("Top 5 Salaries:");
        for (int i = arr.length - 1; i >= arr.length - 5; i--) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        sc.close();
    }
        
}
