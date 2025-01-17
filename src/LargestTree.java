import java.util.ArrayList;

public class LargestTree {

    public static List<Integer> largestValues(Tree tree) {
        var list = new ArrayList<Integer>();
        solveTree(tree.root, 0, list);
        return list;
    }

    private static void solveTree(final Tree.Node node, final int level, final ArrayList<Integer> list) {

        if (node == null) return;

        if(level == list.size()) {
            list.add(node.value);
        } else {
            list.set(level, Math.max(list.get(level), node.value));
        }

        solveTree(node.left, level+1, list);
        solveTree(node.rigth, level+1, list);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(100);

        tree.insert(10);
        tree.insert(5);

        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(5);

        System.out.println(largestValues(tree));
    }
}
