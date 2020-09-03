package chapter19.persistant.tree;

public class TreeProcessor {
    public static int lookup(String k, int defaultVal, Tree t) {
        if (t == null) return defaultVal;
        if (k.equals(t.getKey())) return t.getVal();
        return lookup(k, defaultVal, k.compareTo(t.getKey()) < 0 ? t.getLeft() : t.getRight());
    }

    public static void update(String k, int newVal, Tree t) {
        if (t == null) { // 새 노드를 추가해야한다.
        } else if (k.equals(t.getKey())) t.setVal(newVal);
        else update(k, newVal, k.compareTo(t.getKey()) < 0 ? t.getLeft() : t.getRight());
    }

    public static Tree update2(String k, int newVal, Tree t) {
        if (t == null) {
            t = new Tree(k, newVal, null, null);
        } else if (k.equals(t.getKey())) {
            t.setVal(newVal);
        } else if (k.compareTo(t.getKey()) < 0) {
            t.setLeft(update2(k, newVal, t.getLeft()));
        } else {
            t.setRight(update2(k, newVal, t.getRight()));
        }
        return t;
    }

    public static Tree fupdate(String k, int newVal, Tree t) {
        return (t == null) ?
                new Tree(k, newVal, null, null) :
                k.equals(t.getKey()) ?
                        new Tree(k, newVal, t.getLeft(), t.getRight()) :
                        k.compareTo(t.getKey()) < 0 ?
                                new Tree(t.getKey(), t.getVal(), fupdate(k, newVal, t.getLeft()), t.getRight()) :
                                new Tree(t.getKey(), t.getVal(), t.getLeft(), fupdate(k, newVal, t.getRight()));
    }
}
