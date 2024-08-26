package Main;

public class NonRepeatingElement {
    public static int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 1: Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the first non-repeating element
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }

        // If no non-repeating element is found, return 0
        return 0;
    }
}
