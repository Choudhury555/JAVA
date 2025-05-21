package BASIC;

public class LCM {
    public static void main(String[] args) {
        System.out.println(calculateLCM(6,8));
    }

    public static int calculateLCM(int a,int b){
        if(a<0 || b<0){
            return -1;
        }

        if(a==0 || b==0){
            return 0;
        }

        int maxEle=Math.max(a,b);
        int lcm = maxEle;

        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm=lcm+maxEle;
        }
    }
}
