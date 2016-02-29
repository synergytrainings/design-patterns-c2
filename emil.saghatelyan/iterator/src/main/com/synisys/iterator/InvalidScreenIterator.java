package main.com.synisys.iterator;

/**
 * Created by emil.saghatelyan on 2/29/2016.
 */
public interface InvalidScreenIterator<T> {
	boolean hasNext();

	T next();
}
