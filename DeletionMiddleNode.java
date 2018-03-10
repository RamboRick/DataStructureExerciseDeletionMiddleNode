package middleNodeDeletion;

public class DeletionMiddleNode {
	boolean Nodedeletion( LinkedListNode c){
		if (c == null || c.next == null){
			return false;
		}
		LinkedListNode next = c.next;
		c.data = next.data;
		c.next = next.next;
		return true; 		
	}
}
