/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD_2.dataStructures;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author David
 */
public class TreeNode<E> {
    private E content;
    private List<Tree<E>> children;

    public TreeNode(E content) {
        this.content = content;
        this.children = new LinkedList<>();
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public List<Tree<E>> getChildren() {
        return children;
    }

    public void setChildren(List<Tree<E>> children) {
        this.children.addAll(children);
    }
    
}
