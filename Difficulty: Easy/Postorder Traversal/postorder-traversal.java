/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
   private void postOrderHelper(Node root, ArrayList<Integer> res) {
        if (root == null) return;

        postOrderHelper(root.left, res);   // Visit left subtree
        postOrderHelper(root.right, res);  // Visit right subtree
        res.add(root.data);                // Visit root
    }

    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        postOrderHelper(root, res);
        return res;   
    }
}