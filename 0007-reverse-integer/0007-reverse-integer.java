class Solution {
    public int reverse(int x) {
        long r = 0;
        while(x!=0){
            int y = x%10;
            r= r*10 + y;
            x=x/10;
        }
        if(r >= Math.pow(-2,31) && r < Math.pow(2, 31)){
            return (int)r;
        }
        return 0;
    }
}