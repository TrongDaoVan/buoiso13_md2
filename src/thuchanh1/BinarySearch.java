package thuchanh1;

public class BinarySearch {
    private static int[] list = {2,3,6,7,11,14,18,22,26,29,33,55,77};

    public static int binarySearch(int[] list, int kay){
        int dau = 0;
        int cuoi = list.length - 1;
        while (cuoi >= dau) {
            int giua = (dau + cuoi)/2;
            if (kay < list[giua]) {
                cuoi = giua - 1;}
            else if (kay == list[giua]) {
                return giua;
            } else {
                dau = giua + 1;
            }
        } return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 12));
        System.out.println(binarySearch(list, 22));
        System.out.println(binarySearch(list, 33));
    }
}
