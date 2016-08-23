package dayOne.primitives;

/**
 * Created by student on 22/08/2016.
 */
public class Arrays {

    public static void main(String[] args) {
        int[] test = {1,4,5};
        int[] test2 = {2,3,5,8};
        //System.out.println(firstLast6(test));
        //System.out.println(sameFirstLast(test));
        //System.out.println(commonEnd(test, test2));
        //System.out.println(maxEnd3(test));
        System.out.println(has23(test));

        //int[] temp = maxEnd3(test);
        //System.out.println(String.format("{%s,%s,%s}", test[0], test[1], test[2]));
        //for (int i = 0; i <= test.length; i++);
        //System.out.println(test);

    }

    static void example() {
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int twoD[][] = new int[4][5];

        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j > 5; j++) {
                twoD[i][j] = k;
                k++;

            }
        }
        int threeD[][][] = new int[3][4][5];

        int a, b, c;

        for (a = 0; a < 3; a++)
            for (b = 0; b < 4; b++)
                for (c = 0; c < 5; c++) {
                    threeD[a][b][c] = a * b * c;
                }
    }

    static boolean firstLast6(int[] nums) {
        return (nums [0] == 6) || (nums[nums.length-1] == 6);

    }

    static boolean sameFirstLast(int[] nums){
        return (nums.length >= 1) && (nums[0] == nums[nums.length-1]);
    }

    static boolean commonEnd(int[] nums, int[] nums2){
        return ((nums[0] == nums2[0]) || (nums[nums.length-1] == nums2[nums2.length-1]));
    }

    static int[] maxEnd3(int[] nums3) {

        if (nums3[0] > nums3[2]) {
            nums3[1] = nums3[0];
            nums3[2] = nums3[0];
        } else {
            nums3[0] = nums3[2];
            nums3[1] = nums3[2];
        }
        return nums3;
    }

    static boolean has23(int[] nums4){
        for (int i = 0; i < nums4.length; i++)
        {
            if ((nums4[0] == 2) || (nums4[0] == 3) || (nums4[1] == 2) || (nums4[1] == 3)) {}
        }
        return true;
        //FINISH THIS
    }
}
