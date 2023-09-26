package Tree;

import java.util.List;
import java.util.Optional;

public abstract class TreeNode {

    public String name;
    public TreeNode parent;
    public List<TreeNode> children;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    /*
   return path string (from root to current node)
   */
    public String path(){

        return null;
    }

    /* get a child node of current node */
    public TreeNode getChild(String childName){
        TreeNode first = children.stream().filter(e -> {
            return e.getName() == childName;
        }).findFirst().orElse(null);
        return first;
    }
    /* judge if a child node exist */
    public boolean findChild(String childName){
        return children.stream().filter(e -> e.getName().equals(childName)).findAny().isPresent();
    }
    /* add a child node to current node */
    public boolean addChild(TreeNode child){
        return children.add(child);
    }

    /* remove a child node from current node */
    public boolean deletChild(String childName){
        if (findChild(childName)){
            return children.remove(getChild(childName));
        }
        else return false;
    }

}
