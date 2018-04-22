def binarySearch(array,search):
    lower = 0
    upper = len(array) - 1
    index = False
    
    while lower <= upper and not index:
        middle = (lower + upper)//2
        if search == array[middle]:
            index = middle;
        else:
            if search < array[middle]:
                upper = middle - 1
            else:
                lower = middle + 1
                
    return index

array = [0, 1, 2, 8, 13, 17, 19, 32, 42]
print(binarySearch(array,2))
        