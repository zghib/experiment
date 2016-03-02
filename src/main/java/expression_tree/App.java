package expression_tree;

import expression_tree.node.AddNode;
import expression_tree.node.LeafNode;
import expression_tree.node.MultiplyNode;
import expression_tree.node.NegateNode;
import expression_tree.node.Node;

public class App {
    public static void main(String [] args){
        Node one = new LeafNode(1);
        Node two = new LeafNode(2);
        Node five = new LeafNode(5);
        Node negateFive = new NegateNode(five);
        Node addNode = new AddNode(one, two);
        Node multiplyNode = new MultiplyNode(negateFive, addNode);
        System.out.println(multiplyNode.item());
    }
}
