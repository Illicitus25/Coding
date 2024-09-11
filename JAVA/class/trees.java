import java.util.Scanner;

class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
        left=null;
        right=null;
    }
}
public class trees{
    Node root;
    trees(){
        root=null;
    }
    Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.value){
            root.left=insert(root.left,val);
        }
        else if(val>root.value){
            root.right=insert(root.right,val);
        }
        return root;
    }
    Node search(Node root,int key){
        while(root!=null && root.value!=key){
            root=key<root.value?root.left:root.right;
        }
        return root;
    }
    Node delete(Node root, int key){
        if(root==null){
            return root;
        }
        if(key<root.value){
            root.left=delete(root.left,key);
        }
        else if(key>root.value){
            root.right=delete(root.right,key);
        }
        else{
            if(root.left==null){
                Node temp=root.right;
                root=null;
                return temp;
            }
            else if(root.right==null){
                Node temp=root.left;
                root=null;
                return temp;
            }
            else{
                Node parent=root;
                Node succ=root.right;
                while(succ.left!=null){
                    parent=succ;
                    succ=succ.left;
                }
                if(parent!=root){
                    parent.left=succ.right;
                }
                else{
                    parent.right=succ.right;
                }
                root.value=succ.value;
                succ=null;
            }
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
        }
    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    public static void main(String args[]){
        trees obj=new trees();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Nodes:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter node value: ");
            int data = scanner.nextInt();
            obj.root = obj.insert(obj.root, data);
        }

        System.out.println("Enter value to delete:");
        int key = scanner.nextInt();
        System.out.println("In-order traversal before deletion:");
        obj.inorder(obj.root);

        obj.root = obj.delete(obj.root, key);

        System.out.println("\nIn-order traversal after deletion:");
        obj.inorder(obj.root);
        System.out.println("Height of the tree is: "+obj.height(obj.root));
        scanner.close();
    }
}