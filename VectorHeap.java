/**
 * 
 */

import java.util.Vector;

/**
 * @author loren
 * Referencia: Java Structures: Data Structures for the Principled Developer
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>
{
protected Vector<E> data; // the data, kept in heap order
	public VectorHeap()
	// post: constructs a new priority queue
	{
	data = new Vector<E>();
	}
	public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
	int i;
	data = new Vector<E>(v.size()); // we know ultimate size
	for (i = 0; i < v.size(); i++)
	{ // add elements to heap
	add(v.get(i));
	}
	}
	protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
	return (i-1)/2;
	}
	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
	return 2*i+1;
	}
	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
	return 2*(i+1);
	}
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
