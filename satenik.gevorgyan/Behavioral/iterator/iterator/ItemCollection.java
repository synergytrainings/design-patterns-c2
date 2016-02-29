package iterator.iterator;

import iterator.domain.Item;
import iterator.domain.Song;


public interface ItemCollection<I,T> {

    public void add(I i);
    public void remove(I i);
    public ItemIterator iterator(T type);
}
