package Main;

public class FirstRepeatingElement {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if(!hm2.containsKey(arr[i]))
                hm2.put(arr[i],i+1);
        }
        int minI = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> m : hm.entrySet())
        {
            if(m.getValue()>1)
            {

                minI = Math.min(minI, hm2.get(m.getKey()));
            }
        }
        if(minI == Integer.MAX_VALUE) return -1;
        return minI;
    }
}
