import java.util.HashSet;
//import java.util.Map;
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num:arr){
            int complement = target -num;
            if(seenNumbers.contains(complement)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}