class FlightSearch
{
    public static int linearSearch(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == key) 
            {
                return i;
            }
         }
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] flights = {301, 445, 112, 738, 619, 718, 231};
        int[] searchKeys = {301, 117, 112};

        for (int key : searchKeys)
        {
            int pos = linearSearch(flights, key);
            if (pos != -1) 
            {
                System.out.println("Flight " + key + " found at index " + pos);
            } 
            else
            {
                System.out.println("Flight " + key + " not found");
            }
        }
     }
}
