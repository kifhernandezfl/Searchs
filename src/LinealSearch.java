public class LinealSearch 
{
    public int linealSearch(int [] sorted, int search)
    {
        int index = -1;
        
        for(int i = 0; i < sorted.length; i++)
        {
            if(sorted[i] == search)
                index = i;
        }    
        
        return index;
    }

    public static void main (String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,10,15};
        
        LinealSearch search = new LinealSearch();
        
        System.out.println("El numero esta en la posicion: " + search.linealSearch(array, 3));
    }

}
