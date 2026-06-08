class FreqStack {
    private Map<Integer,Integer> freqMap;
    private List<Integer> stack;

    public FreqStack() {
        freqMap = new HashMap<>();
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
    }
    
    public int pop() {
        int maxCnt = Collections.max(freqMap.values());
        int i = stack.size() - 1;
        while(freqMap.get(stack.get(i)) != maxCnt){
            i--;
        }

        int val = stack.remove(i);
        freqMap.put(val, freqMap.get(val) - 1);
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */