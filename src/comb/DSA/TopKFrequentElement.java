package comb.DSA;

import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
//        int[] arr = {3,0,1,0};
//        int k = 1;
//        System.out.println(Arrays.toString(topKFrequentElement.topKFrequent(arr, k)));
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        System.out.println(Arrays.toString(topKFrequentElement.topKFrequent(words, k)));
    }
    public String[] topKFrequent(String[] words, int k) {
        //count frequency
        Map<String, Integer> freq = new HashMap<>();
        for(String str : words){
            freq.put(str, freq.getOrDefault(str, 0)+1);
        }
        System.out.println(freq);

        //create List of List, bucket of number,
        //eg: 1-2, 2-3,4-2,5-3
        //[0->[], 1->[], 2->[1,4], 3->[2,5]]

        List<List<String>> bucket = new ArrayList<>(words.length + 1);
        for (int i = 0; i <= words.length; i++) {
            bucket.add(new ArrayList<>());
        }

        //filling bucket
        for (Map.Entry<String, Integer> entry: freq.entrySet()){
            String word = entry.getKey();
            int frequency = entry.getValue();
            bucket.get(frequency).add(word);
        }
        System.out.println(bucket);

        //traverse in bucket to find top k
        List<String> temp = new ArrayList<>();
        for (int i = bucket.size()-1; i >=0 && temp.size() < k; i--) {
            for (String str : bucket.get(i)){
                temp.add(str);
                if (temp.size()==k){
                    break;
                }
            }
        }

        String[] ans = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }

        return ans;
    }
    public int[] topKFrequent(int[] nums, int k) {
        //count frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        System.out.println(freq);

        //create List of List, bucket of number,
        //eg: 1-2, 2-3,4-2,5-3
        //[0->[], 1->[], 2->[1,4], 3->[2,5]]

        List<List<Integer>> bucket = new ArrayList<>(nums.length+1);
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }

        //filling bucket
        for (Map.Entry<Integer, Integer> entry: freq.entrySet()){
            int number = entry.getKey();
            int frequency = entry.getValue();
            bucket.get(frequency).add(number);
        }
        System.out.println(bucket);

        //traverse in bucket to find top k
        List<Integer> temp = new ArrayList<>();
        for (int i = bucket.size()-1; i >=0 && temp.size() < k; i--) {
            for (int n : bucket.get(i)){
                temp.add(n);
                if (temp.size()==k){
                    break;
                }
            }
        }

        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }

        return ans;
    }
}
