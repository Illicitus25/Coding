/**
 * floorandceiling
 */
public class floorandceiling {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 8, 10};
        int target = 5;
        
        int floorValue = findFloor(array, target);
        int ceilingValue = findCeiling(array, target);
        
        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nTarget: " + target);
        System.out.println("Floor value: " + (floorValue != -1 ? floorValue : -1));
        System.out.println("Ceiling value: " + (ceilingValue != -1 ? ceilingValue : -1));
    }
    public static int findFloor(int[] array, int target) {
        int floorValue = -1;
        for (int num : array) {
            if (num <= target) {
                if (floorValue == -1 || num > floorValue) {
                    floorValue = num;
                }
            }
        }
        return floorValue;
    }

    public static int findCeiling(int[] array, int target) {
        int ceilingValue = -1;
        for (int num : array) {
            if (num >= target) {
                if (ceilingValue == -1 || num < ceilingValue) {
                    ceilingValue = num;
                }
            }
        }
        return ceilingValue;
    }
}