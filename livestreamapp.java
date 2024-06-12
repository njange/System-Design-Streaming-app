public class livestreamapp {
    
    private Database database;


    public int seekTime(String userId, String videoId){
        WatchedVideo watchedVideo = database.getWatchedVideo(userId, videoId);

        return watchedVideo.getSeekTime();
    }
}
    class Database {

        public WatchedVideo getWatchedVideo(String userId, String videoId) {
            return null;
        }
    }

    class Video {

        

        String id;
        Frame[] frames;
        String jsonMetaData;

        public Frame getFrame(int timestamp) {
            for (int i = 0; i < frames.length; i++) {
                if (frames[i].timestamp <= timestamp &&
                frames[i].timestamp + Frame.frameTime > timestamp) {
                    return frames[i];
                }
        }

        throw new IndexOutOfBoundsException();
    }
}


    class Frame {
        public static int frameTime = 10;

        byte[] bytes;
        int startTimestamp;
        int endTimestamp;
    }

    class User {
        String id;
        String name;
        String email;

        public String getId(){
            return id;
        }
    }

    class WatchedVideo{
        String Id;
        String VideoId;
        String UserId;
        int seekTime;

        public int getSeekTime() {
            return seekTime;
        }
    }