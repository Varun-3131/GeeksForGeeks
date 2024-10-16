package Main;

public class LeftMostAndRightMostIndex {

    public pair indexes(long v[], long x)
    {
        // Your code goes here
        //Complexity O(LogN) approach using binary Search Method
        long first=-1;
        int start=0;
        int end=v.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(v[mid]==x){
                first=mid;
                end=mid-1;
            }
            else if(v[mid]<x) start=mid+1;
            else end=mid-1;
        }
        long second=-1;
        int low=0;
        int high=v.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(v[mid]==x){
                second=mid;
                low=mid+1;
            }
            else if(v[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return new pair(first,second);
    }
}
