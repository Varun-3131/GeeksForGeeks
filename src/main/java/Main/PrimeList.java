package Main;

public class PrimeList {
    boolean isprime(int n){
        if(n<=1){
            return false ;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false ;
            }
        }
        return true ;
    }
    Node primeList(Node head){
        Node temp = head ;

        while(temp!=null){
            int n = temp.val ;

            if(n==1){
                temp.val = 2 ;
                temp = temp.next ;
                continue ;
            }

            int left = n ;
            int right = n ;

            while(!isprime(left)){
                left-- ;
            }
            while(!isprime(right)){
                right++ ;
            }

            int dis1 = right - n ;
            int dis2 = n - left ;

            if(dis2>dis1){
                temp.val = right ;
            }
            else if(dis2<dis1){
                temp.val = left ;
            }
            else {
                temp.val = left ;
            }
            temp = temp.next ;
        }
        return head ;
    }
}
