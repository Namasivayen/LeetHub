class Solution {
    public int thirdMax(int[] nums) {
        float m1=Long.MIN_VALUE;
        float m2=Long.MIN_VALUE;
        float m3=Long.MIN_VALUE;
        for(int n:nums){
            if(n>m1){
                m3=m2;
                m2=m1;
                m1=(int)n;
            }
            else if(n>m2 && n<m1){
                m3=m2;
                m2=(int)n;
            }
            else if(n>m3 && n<m2){
                m3=(int)n;
            }
        }
        if(m3==Long.MIN_VALUE){
            return (int)m1;
        }
        return (int)m3;
    }
}