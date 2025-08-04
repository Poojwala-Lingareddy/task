// Rotate an array to the right by K steps
class Rotate{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;
        int rotated[] = new int[n];
        k = k % n;
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        System.out.print("Array after right rotation: ");
        for (int val : rotated) {
            System.out.print(val + " ");
        }
    }
}
