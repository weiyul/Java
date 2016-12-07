
public abstract class BinaryTree<E> {
	protected Node<E> root;
	public String preorder(){
		return preorder(root);
	}
	private String preorder(Node<E> n){
		if(n==null) return null;
		return (n+" "+preorder(n.left)+ " "+ preorder(n.right)).trim();
	}
	
	public String inorder(){
		return inorder(root);
	}
	private String inorder(Node<E> n){
		if(n==null) return null;
		return (inorder(n.left)+ " "+n+" "+ inorder(n.right)).trim();
	}
	
	public String Postorder(){
		return Postorder(root);
	}
	private String Postorder(Node<E> n){
		if(n==null) return null;
		return (Postorder(n.left)+" "+ Postorder(n.right)+ " "+n).trim();
	}
	protected static class Node<T>{
		protected T data;
		protected Node<T> right, left, parent;
		protected Node(T data, Node<T> parent){
			this.data = data;
			this.parent = parent;
		}
		public String toString(){
			return data.toString();
		}
		
		
	}
	
}
