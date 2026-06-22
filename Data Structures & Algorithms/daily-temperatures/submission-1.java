class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[1]){
                int[] top = stack.pop();
                res[top[0]] = i - top[0];
            }
            stack.push(new int[]{i, temperatures[i]});
        }
        return res;
    }
}
