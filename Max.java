

public class Max {
    public static void main(String[] args) {
        int[] arr = {6, 10, 7, 8, 2, 1};
        int min = arr[0];
        int max = arr[0];
        int maxIdx = 0,minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                 min = arr[i];
                 minIdx = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }
        System.out.println("max:is" + max + "min is" + min);
        System.out.println(maxIdx+" "+minIdx);
        int k = arr.length;
        int j = 0;
        int[] brr = new int[k + 2];
        for (int i = 0; i < k; i++) {
            brr[j] = arr[i];
            if (i==maxIdx) {
                brr[j + 1] = 5;
                j++;
            }
            if(i==minIdx) {
                brr[j + 1] = 5;
                j++;
            }
            j++;
        }
        for(int i = 0;i < brr.length; i++){
            System.out.print(brr[i]+" ");
        }
    }
}

