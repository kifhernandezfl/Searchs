def interpolationSearch(array,search):
    lowerBound = 0
    upperBound = len(array) - 1
    index = False
    
    while sorted[lowerBound] <= search and sorted[upperBound] >= search and not index:
        middle = lowerBound + ((search - sorted[lowerBound])*(upperBound - lowerBound)) // (sorted[upperBound] - sorted[lowerBound])
        
        if search == array[middle]:
            index = middle;
        else:
            if search < array[middle]:
                upperBound = middle - 1
            else:
                lowerBound = middle + 1
              
    return index 

array = [1,2,5,6,8,90,112,562]
print(interpolationSearch(array,5))