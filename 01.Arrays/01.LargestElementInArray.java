public int largestElementInArray(int[] arr) {
    int largest = Integer.MIN_VALUE;

    for(int i : arr) {
        if(i > largest) {
            largest = i;
        }
    }
    return largest;
}