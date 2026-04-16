class Solution {
    public static void print_divisors(int n) {
        List<Integer> result= new ArrayList<>();
       for(int i=1;i*i<=n; i++){
           if(n%i==0){
               result.add(i);
           
          if(i!=n/i){
              result.add(n/i);
          
       }
       }
       }
       Collections.sort(result);
       for(int i=0;i<result.size();i++){
       System.out.print(result.get(i)+ " ")  ;
}
    }
}
