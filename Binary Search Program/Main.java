public class Main {
    public static void main(String[] args) {
        String[] array1 = { "about", "best", "create", "establish", "jump", "more", "power", "rest", "tower", "very" };
        String[] array2 = {};
        if (BinarySearch.binarysearch(array1, "great")) {
            System.out.print("The value is true.");
        } else {
            System.out.print("The value is false.");
        }
    }

}
