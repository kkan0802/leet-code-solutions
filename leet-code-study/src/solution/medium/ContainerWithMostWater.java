package solution.medium;

public class ContainerWithMostWater {

    /*
     * 11. Container With Most Water
     */
    public int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, Math.multiplyExact(j - i, Math.min(height[j], height[i])));
            }
        }

        return max;
    }
}
