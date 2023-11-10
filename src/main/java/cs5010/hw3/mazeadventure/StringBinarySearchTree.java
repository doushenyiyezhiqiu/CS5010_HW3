package cs5010.hw3.mazeadventure;

/**
 * This is a binary search tree used for storing string.
 */
public class StringBinarySearchTree {
    TreeNode root;

    public void insert(String value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode current, String value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value.compareTo(current.value) < 0) {
            current.left = insertRecursive(current.left, value);
        } else if (value.compareTo(current.value) > 0) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    public void delete(String value) {
        root = deleteRecursive(root, value);
    }

    private TreeNode deleteRecursive(TreeNode current, String value) {
        if (current == null) {
            return null;
        }

        if (value.equals(current.value)) {
            // Node to delete found
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: 2 children
            String smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.value) < 0) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private String findSmallestValue(TreeNode root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public boolean exists(String name) {
        if (root == null) {
            return false;
        }
        TreeNode current = root;
        while (true) {
            if (name.equals(current.value)) {
                return true;
            } else if (name.compareTo(current.value) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
    }
}
