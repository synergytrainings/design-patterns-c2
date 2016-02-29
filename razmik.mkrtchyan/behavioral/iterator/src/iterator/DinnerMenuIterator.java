package iterator;

import model.api.MenuItem;

import java.util.Iterator;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 29, 2016.
 *  
 */
public class DinnerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] meuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] meuItems) {
        this.meuItems = meuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position >= meuItems.length || meuItems[position] == null);
    }

    @Override
    public MenuItem next() {
        return meuItems[position++];
    }

    @Override
    public void remove() {
        if (position == 0) {
            throw new UnsupportedOperationException("Invalid operation");
        }
        int length = meuItems.length;
        System.arraycopy(meuItems, position - 1 + 1, meuItems, position - 1, length - (position - 1));
        meuItems[length] = null;
    }
}
