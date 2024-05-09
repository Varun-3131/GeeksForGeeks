package Main;

public class CombinationSum_III {
    public static void function(ArrayList<Integer> arr,int n,int allowedLength,int target,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> l,int i,int sum)
    {
        if(i>n-1)
        {
            if(sum==target && l.size()==allowedLength)
            {
                ans.add(new ArrayList(l));
            }
            return;
        }
        if(arr.get(i)<=target && sum<=target)
        {
            sum+=arr.get(i);
            l.add(arr.get(i));
            function(arr,n,allowedLength,target,ans,l,i+1,sum);
            sum-=arr.get(i);
            l.remove(l.size()-1);
        }

        function(arr,n,allowedLength,target,ans,l,i+1,sum);
    }
    public static ArrayList<ArrayList<Integer>> combinationSum(int K, int N)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<9;i++)
        {
            arr.add(i+1);
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        function(arr,9,K,N,ans,l,0,0);
        return ans;
    }
}
