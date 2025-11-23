class Solution {
    public int maxSumDivThree(int[] nums) {
        int total=0;
        List<Integer> r1 = new ArrayList<>();  
        List<Integer> r2 = new ArrayList<>();  
        for (int num : nums) {
            total += num;
            if (num % 3 == 1) r1.add(num);
            else if (num % 3 == 2) r2.add(num);
        }
        if (total % 3 == 0) return total;
        Collections.sort(r1);
        Collections.sort(r2);
        int result = 0;

        if (total % 3 == 1) {
            int option1 = r1.size() >= 1 ? total - r1.get(0) : 0;
            int option2 = r2.size() >= 2 ? total - (r2.get(0) + r2.get(1)) : 0;
            result = Math.max(option1, option2);
        } else {
            int option1 = r2.size() >= 1 ? total - r2.get(0) : 0;
            int option2 = r1.size() >= 2 ? total - (r1.get(0) + r1.get(1)) : 0;
            result = Math.max(option1, option2);
        }
        return result;
    }
}
