class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] sol = new int[k];

        // create map of how many times each element shows up in the array
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int num : map.keySet()) {
            buckets[map.get(num)].add(num);
        }


        int j = 0;

        for (int i = buckets.length - 1; i > 0; i--) {
            if (!buckets[i].isEmpty() && k > 0) {
                for (int num : buckets[i]) {
                    sol[j] = num;
                    k--;
                    j++;
                }
            }
        }

        return sol;
    }
}
