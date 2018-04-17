public class InterpolationSearch 
{
    public int interpolationSearch(int [] sorted, int search)
    {
        int lowerBound = 0;
        int upperBound = sorted.length - 1;
        int index = -1;
        
        while(sorted[lowerBound] <= search && sorted[upperBound] >= search)
        {
            int middle = lowerBound + ((search - sorted[lowerBound])*(upperBound - lowerBound)) / (sorted[upperBound] - sorted[lowerBound]);
            
            if(search == sorted[middle])
            {
                index = middle;
            }
            
            if(search < sorted[middle])
            {
		upperBound = middle - 1;
            }else
            {
		lowerBound = middle + 1;
            }
        }   
        
        if(lowerBound == upperBound && sorted[lowerBound] == search)
        {
            index = lowerBound;
        }
		
        return index;
    }  
    
     public static void main (String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,10,15};
        
        InterpolationSearch search = new InterpolationSearch();
        
        System.out.println("El numero esta en la posicion: " + search.interpolationSearch(array, 3));
    }
}
