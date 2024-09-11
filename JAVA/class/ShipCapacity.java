public class ShipCapacity {
    public static void main(String[] args) {
        ShipCapacity solution = new ShipCapacity();
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(solution.shipWithinDays(weights, days));
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = getMax(weights); // minimum capacity needed
        int right = getSum(weights); // maximum capacity needed

        while (left < right) {
            int mid = (left + right) / 2;
            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 1;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                requiredDays++;
                currentLoad = weight;
                if (requiredDays > days) {
                    return false;
                }
            } else {
                currentLoad += weight;
            }
        }

        return true;
    }
    private int getMax(int[] weights) {
        int max = 0;
        for (int weight : weights) {
            if (weight > max) {
                max = weight;
            }
        }
        return max;
    }
    private int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }
}
