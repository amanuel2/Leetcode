class Solution {
    public List<Integer> getRow(int rowIndex) {

        if (rowIndex == 0)
            return Arrays.asList(1);
        if (rowIndex == 1)
            return Arrays.asList(1, 1);
        ArrayList<Integer> list = new ArrayList<Integer>();

        // row = [1 , 1]
        // row = [1, 2, 1]
        // row = [1, 3, 3, 1]
        list.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = list.size() - 1; j > 0; j--) {
                list.set(j, list.get(j - 1) + list.get(j));
            }
            list.add(1);
        }

        return list;

    }
}