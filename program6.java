// Find the majority element in an array.
class majority{
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,3,2};
        int n = arr.length;
        int majorityCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                System.out.println("Majority element is: " + arr[i]);
                break;
            }
        }
    }
}

