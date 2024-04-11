package Main;

public class LargestSubarrayWith0Sum {
    int maxLen(int arr[], int n)
    {
        // Your code here
        int sum = 0;
        int max_len = 0;
        int i = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(sum, -1);

        while(i < n)
        {
            sum = sum + arr[i];

            if(hm.containsKey(sum))
            {
                int temp_len = i - hm.get(sum);

                max_len = temp_len > max_len ? temp_len : max_len;
            }
            else
            {
                hm.put(sum, i);
            }

            i = i + 1;
        }

        return max_len;
    }
}
