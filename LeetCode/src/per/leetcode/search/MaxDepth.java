package per.leetcode.search;

import javafx.util.Pair;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * N叉树的最大深度
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * 例如，给定一个?3叉树?:
 * 1
 * |  |  \
 * 3   2   4
 * | \
 * 5   6
 * 我们应返回其最大深度，3。
 */
public class MaxDepth {
    //递归
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else if (root.children.isEmpty()) {
            return 1;
        } else {
            List<Integer> height = new LinkedList<>();
            for (Node node : root.children) {
                height.add(maxDepth(node));
            }
            return Collections.max(height)+1;
        }
    }

    //迭代
    public int maxDepth_1(Node root) {
        Queue<Pair<Node, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<Node, Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                for (Node c : root.children) {
                    stack.add(new Pair(c, current_depth + 1));
                }
            }
        }
        return depth;
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
