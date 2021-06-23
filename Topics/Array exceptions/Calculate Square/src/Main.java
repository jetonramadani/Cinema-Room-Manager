class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if (index >= 0 && array != null && index < array.length) {
            System.out.println(array[index] * array[index]);
        } else {
            System.out.println("Exception!");
        }
    }
}