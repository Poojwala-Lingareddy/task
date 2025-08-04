//5. Find the missing number in a series of 1 to N.
class Missing{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6}; 
        int n = 6; 
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        int missing = totalSum - arraySum;
        System.out.println("Missing number is: " + missing);
    }
}
