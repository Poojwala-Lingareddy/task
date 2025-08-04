//Remove duplicates from an array.
class Remove{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,20,10};
        int[] dup = new int[arr.length];  
        int Count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < Count; j++) {
                if (arr[i] == dup[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                dup[Count] = arr[i];
                Count++;
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < Count; i++) {
            System.out.print(dup[i] + " ");
        }
    }
}