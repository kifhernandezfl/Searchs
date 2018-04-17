public class BinarySearch 
{
    public static int binarySearch(int [] array, int search)
    {
        int lower = 0;
        int upper = array.length-1;
        int index = -1;
		
        while(lower <= upper)
        {
            int middle = (lower + upper)/2;
			
            if(search == array[middle])
            {
                index = middle;
            }
			
            if(search < array[middle])
            {
                upper = middle - 1;
            }else
            {
                lower = middle + 1;
            }
	}
		
	if(lower == upper && array[lower] == search)
	{
            index = lower;
	}
		
	return index;
    }
    
    public static void main (String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,10,15};
        
        BinarySearch search = new BinarySearch();
        
        System.out.println("El numero esta en la posicion: " + search.binarySearch(array, 3));
    }
}
