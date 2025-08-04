//Find the second largest element in an array.*
class demo{
    public static void main(String[] args){
        int arr[] = {10,13,24,6,19};
        int first = 0;
        int second = 0;
        for (int i:arr) {
            if(i>first){
                second = first;
                first = i;
            }
            else if(i>second && i!=first) {
                second = i;
            }
        }
        System.out.println("The second largest element in an array is "+second);
    }
}
