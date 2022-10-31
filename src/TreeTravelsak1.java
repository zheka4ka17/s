import java.util.Arrays;

public class TreeTravelsak1 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addRoot('A');//0 index
        tree.addLeft(0,'B');//0*2+1
        tree.addRight(0,'C');//0*2+2
        tree.addLeft(2,'D');
        tree.addRight(2,'E');
        tree.print();
       // tree.preOrder('A');
        //tree.inOrder('A');
        tree.postOrder('A');
    }
}
class Tree {
    static char[] arr = new char[10];


    public void addRoot(char c) {
        arr[0] = c;
    }

    public void addLeft(int parent, char c) {
        int left = parent * 2 + 1;
        if (arr[parent] == 0)
            return;
        else arr[left] = c;

    }

    public void addRight(int parent, char c) {
        int right = parent * 2 + 2;
        if (arr[parent] == 0)
            return;
        else arr[right] = c;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public int findNode(char key) {
        if (key == 0) return -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) index = i;
        return index;//??
    }

    public char getLeftChild(char key) {
        int node = findNode(key);

        if (key == -1) return 0;
        if (node * 2 + 1 < arr.length)
            return arr[node * 2 + 1];
        else return 0;
    }

    public char getRightChild(char key) {
        int node = findNode(key);
        if (key == -1) return 0;
        if (node * 2 + 2 < arr.length)
            return arr[node * 2 + 2];
        else return 0;
    }

    //Preorder traversal
    public void preOrder(char key) {
        if (key == 0) return;
        System.out.print(key + " ");
        preOrder(getLeftChild(key));
        preOrder(getRightChild(key));
    }

    public void inOrder(char key) {
        if (key == 0) return;
        inOrder(getLeftChild(key));
        System.out.print(key + " ");
        inOrder(getRightChild(key));


    }

    public void postOrder(char key){
        if (key==0) return;
        postOrder(getLeftChild(key));
        postOrder(getRightChild(key));
        System.out.print(key+" ");
    }
}
