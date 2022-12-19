public class task_3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{15,21,3,0};
        int[] arr2 = new int[]{1,6,3,9};
        for (int el: arrDivision(arr1, arr2)) {
            System.out.println(el);
        }
    }

    private static int[] arrDivision(int[] arr1, int[] arr2) throws RuntimeException {
        if (arr1.length != arr2.length){
            throw (new RuntimeException("Length of arr1 is not equal to arr2") );
        } else {
            int[] result =new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0){
                    throw (new RuntimeException("Division by zero is impossible"));
                }
                result[i] = arr1[i] / arr2[i];
            }
            return result;
        }

    }
}
