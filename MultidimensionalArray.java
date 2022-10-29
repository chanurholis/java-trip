public class MultidimensionalArray {
    public static void main() {
        int[][] numbers = {{1, 2, 3}, {4,5,6}};
        for (int[] number : numbers) {
            for (int n : number) {
                System.out.println(n);
            }
        }
    }
}
