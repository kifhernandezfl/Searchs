public class RecursiveBinarySearch 
{
    public static int binarySearchRecursive(int[] array, int search, int lowerBound, int upperBound)
    {
	int middle = (lowerBound + upperBound)/2;
		
	if(upperBound < lowerBound)
        {
            return -1;
	} 
        
        if (search < array[middle])
        {
            return binarySearchRecursive(array, search, lowerBound, middle - 1);
	}
		
	if (search > array[middle])
        {
            return binarySearchRecursive(array, search, middle + 1, upperBound);
	}
		
	if (search == array[middle])
        {
            return middle;
	}
		
	return -1;
    }
    
    public static void main (String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,10,15};
        
        RecursiveBinarySearch search = new RecursiveBinarySearch();
        
        System.out.println("El numero esta en la posicion: " + search.binarySearchRecursive(array, 3, 1, 15));
    }
}

