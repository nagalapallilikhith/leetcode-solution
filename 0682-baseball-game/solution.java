class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String i : operations) {
            switch (i) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "+":
                    int a = stack.pop();
                    int b = stack.peek();
                    int sum = a + b;
                    stack.push(a);         
                    stack.push(sum);      
                    break;
                default:
                    stack.push(Integer.parseInt(i));
            }
        }
        int total = 0;
        for (int x : stack) total += x;
        return total;
    }
}
