package iterator.domain;


public class Song implements Item{
    private SongTypeEnum TYPE;
    private String singer;
    private String song;

    public Song(SongTypeEnum TYPE, String singer, String song) {
        this.TYPE = TYPE;
        this.singer = singer;
        this.song = song;
    }

    public SongTypeEnum getTYPE() {
        return TYPE;
    }

    public String getSinger() {
        return singer;
    }

    public String getSong() {
        return song;
    }

    public void itemDetails(){
        System.out.println("Song " + song + ", singer - " + singer);
    }
}
