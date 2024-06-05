package chap_06_class.sec08.exam02;

public class ComputerEx {
    public static void main(String[] args) {
        Computer cp = new Computer();

        int res1 = cp.sum(1,2,3);
        System.out.println("res1 = " + res1);
        int res2 = cp.sum(1,2,3,4,5);
        System.out.println("res2 = " +res2);

        int[] arr = {1,2,3,4,5};
        int res3 = cp.sum(arr);
        System.out.println("res3 = " +res3);

        int res4 = cp.sum(new int[]{1,2,3,4,5});
        System.out.println("res4 = " +res4);
    }
}
