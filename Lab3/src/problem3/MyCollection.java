package problem3;

public interface MyCollection<E> {
	int size();
	boolean isEmpty();
	boolean contains(Object o);
	boolean add(E e);
	boolean remove(Object o);
	void clear();
}
