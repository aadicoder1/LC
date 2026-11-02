class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s : words) freq.put(s, freq.getOrDefault(s, 0) + 1);
        
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
                if (!a.getValue().equals(b.getValue())) return b.getValue() - a.getValue();
                return a.getKey().compareTo(b.getKey());
        });
        pq.addAll(freq.entrySet());

        List<String> result = new ArrayList<>();
        while (result.size() < k) {
            Map.Entry<String, Integer> entry = pq.poll();
            result.add(entry.getKey());
        }
        return result;
    }
}