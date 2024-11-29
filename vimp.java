class vimp{
    public static void main(String args[]){
        int num =8;
        int result=++num;   // pre increment ---first increment and then fetch
        int result2=num++;  // post increment ---first fetch and then increment

        System.out.println(result);
        System.out.println(result2);
    }
}