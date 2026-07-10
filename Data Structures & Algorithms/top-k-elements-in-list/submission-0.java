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

        // create priority queue to sort 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));

        for (int num : map.keySet()) {
            maxHeap.add(num);
        }

        for (int i = 0; i < k; i++) {
            sol[i] = maxHeap.poll();
        }

    
        return sol;

    }
}
