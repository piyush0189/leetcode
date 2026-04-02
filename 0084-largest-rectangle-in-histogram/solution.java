class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        //Next smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i=heights.length-1; i>=0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next smaller Left
         s = new Stack<>();

        for(int i=0; i<heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Current Area: width = nsr[i] - ns[j] -1;
        for(int i=0; i<heights.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int currArea = heights[i] * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
