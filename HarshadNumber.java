/*An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.  */

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            int dig=x%10;
            sum+=dig;
            x/=10;
        }
        if(temp%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}
