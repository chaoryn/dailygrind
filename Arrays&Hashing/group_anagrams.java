import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams (String[] strs){
        Hashmap<Integers, List<String>> hm = new Hashmap<>(); //create a hashmap that consists of the given inputs.
        for (int i = 0; i < strs.length; i++) {
            String s1 = strs[i]; // take any string inside the array as reference
            char[] s1_arr  = s1.toCharArray(); //converts s1 into an array form
            Arrays.sort(s1_arr); //sorts the array
            String s1_arr_sorted = new String(s1_arr); //converts sorted array back into a string

            if (hm.containsKey(s1_arr_sorted)){ //if the hashmap consists of this string,
                hm.get(s1_arr_sorted).add(s1); //add this string to the main list, and also add its match.
            }
            else { //if hashmap doesn't consist of this string,
                hm.put(s1_arr_sorted, new ArrayList<>()); //add this string and make an empty array list.
                hm.get(s1_arr_sorted).add(s1);
            }
        }
        return new ArrayList<>(hm.values()); //return the final values in a new array list that consists of grouped similar strings.
    }
}
