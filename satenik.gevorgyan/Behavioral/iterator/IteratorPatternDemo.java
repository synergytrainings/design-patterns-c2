package iterator;

import iterator.domain.*;
import iterator.iterator.ChannelCollectionImpl;
import iterator.iterator.ItemCollection;
import iterator.iterator.ItemIterator;
import iterator.iterator.SongCollectionImpl;


public class IteratorPatternDemo {

    public static void main(String[] args) {
        ChannelCollectionImpl channels = populateChannels();
        SongCollectionImpl songs = populateSongs();

        ItemIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Item item = baseIterator.next();
            item.itemDetails();
        }
        System.out.println("******");
        // Channel Type Iterator
        ItemIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Item item = englishIterator.next();
            item.itemDetails();
        }

        ItemIterator songIterator = songs.iterator(SongTypeEnum.CLASSIC);
        while (songIterator.hasNext()) {
            Item item = songIterator.next();
            item.itemDetails();
        }
    }

    private static ChannelCollectionImpl populateChannels() {
        ChannelCollectionImpl channels = new ChannelCollectionImpl();
        channels.add(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.add(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.add(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.add(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.add(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }

    private static SongCollectionImpl populateSongs() {
        SongCollectionImpl songs = new SongCollectionImpl();
        songs.add(new Song(SongTypeEnum.CLASSIC, "Vivaldi","Four season of year"));
        songs.add(new Song(SongTypeEnum.POP, "Shakira","Some song"));
        songs.add(new Song(SongTypeEnum.COUNTY, "Eric Clapton","County song"));

        return songs;
    }
}
