class MinStack {
    List<Integer> list;

    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return Collections.min(list);
    }
}