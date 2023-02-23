package sun.algo;

public class xor {
    public void printOddTimesNum(int[] arr){
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        int rightValue = eor & (~eor +1);
        int onlyvalue = 0;
        for (int i = 0; i < arr.length; i++) {
           if ((arr[i] & rightValue) != 0){
               onlyvalue = arr[i];
           }
        }
        System.out.println("两个特殊的数是：" + onlyvalue +" " + (eor ^ onlyvalue));;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,99,88,6};
        new xor().printOddTimesNum(arr);

    }
}
