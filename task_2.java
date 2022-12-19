public class task_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,6,3,4};
        for (int el: arrDifference(arr1, arr2)
             ) {
            System.out.println(el);
        }
    }

    private static int[] arrDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            System.out.println("Length of arr1 is not equal to arr2");
            return  null;
        } else {
            int[] result =new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] - arr2[i];
            }
            return result;
        }

    }
}
