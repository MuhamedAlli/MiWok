package feed.r.miwok;

public class Word {
    private String engTrans;
    private String miwokTrans;
    private static int is_here=-1;
    private int imageId=is_here  ;
    private int audioId;
    public Word(String engTrans , String miwokTrans)
    {
        this.engTrans = engTrans;
        this.miwokTrans = miwokTrans;
    }
    public Word(String engTrans , String miwokTrans, int imageId , int audioId)
    {
        this.engTrans = engTrans;
        this.miwokTrans = miwokTrans;
        this.imageId = imageId;
        this.audioId = audioId;
    }
    public Word(String engTrans , String miwokTrans, int audioId)
    {
        this.engTrans = engTrans;
        this.miwokTrans = miwokTrans;
        this.audioId = audioId;
    }
    public String getEngTrans()
    {
        return engTrans;
    }
    public  String getMiwokTrans()
    {
        return miwokTrans;
    }

    public int getImageId() {
        return imageId;
    }
    public boolean is_image_here()
    {
        return   imageId != is_here;
    }

    public int getAudioId() {
        return audioId;
    }
}
