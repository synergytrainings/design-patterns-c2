package iterator.iterator;

import iterator.domain.Song;
import iterator.domain.SongTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class SongCollectionImpl implements ItemCollection<Song,SongTypeEnum> {

    private List<Song> songs;

    public SongCollectionImpl() {
        songs = new ArrayList<>();
    }

    public void add(Song c) {
        this.songs.add(c);
    }

    public void remove(Song c) {
        this.songs.remove(c);
    }

    public ItemIterator iterator(SongTypeEnum type) {
        return new SongIteratorImpl(type, this.songs);
    }

    private class SongIteratorImpl implements ItemIterator {
        private SongTypeEnum type;
        private List<Song> songs;
        private int position;

        public SongIteratorImpl(SongTypeEnum ty, List<Song> songsList) {
            this.type = ty;
            this.songs = songsList;
        }

        @Override
        public boolean hasNext() {
            while (position < songs.size()) {
                Song c = songs.get(position);
                if (c.getTYPE().equals(type)) {
                    return true;
                } else position++;
            }
            return false;
        }

        @Override
        public Song next() {
            Song c = songs.get(position);
            position++;
            System.out.println("ON next play song.");
            return c;
        }
    }
}
