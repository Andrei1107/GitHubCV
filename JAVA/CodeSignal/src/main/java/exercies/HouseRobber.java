package exercies;


/*
You are planning to rob houses on a specific street,
 and you know that every house on the street has a certain
 amount of money hidden. The only thing stopping you from robbing
  all of them in one night is that adjacent houses on the street
   have a connected security system. The system will automatically
    trigger an alarm if two adjacent houses are broken into on the same night.

Given a list of non-negative integers nums representing the amount
 of money hidden in each house, determine the maximum amount of money
  you can rob in one night without triggering an alarm.
 */
public class HouseRobber {

    public static void main(String[] args) {
    int [] input={1, 1, 2, 1};
        System.out.println(houseRobber(input));

    }

  static   int houseRobber(int[] nums) {
            int money=0;
        if(nums.length %2 ==0){
            for(int i=0;i<nums.length;i++){
                if(i %2 == 0 ){
                    money+=nums[i];

                }
            }

        }


        if(nums.length%2 != 0){
            for(int i=0;i<nums.length;i++){
                if(i%2 ==0){
                    money+=nums[i];
                }
            }

        }

        if(nums.length ==1){
            return nums[0];
        }


        return money;
    }

}
