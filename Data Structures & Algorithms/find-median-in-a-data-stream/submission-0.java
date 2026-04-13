class MedianFinder {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
         maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {

        maxHeap.add(num);

        if(!minHeap.isEmpty() && minHeap.peek() < maxHeap.peek()){
            minHeap.add(maxHeap.poll());
        }

        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.poll());
        }else if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
        
    }
    
    public double findMedian() {

        if(minHeap.size() == maxHeap.size())
            return (maxHeap.peek() + minHeap.peek())/2.0;
        else{
            return maxHeap.peek();
        }
        
    }
}
