public class livestreamapp {
    
}

    class Video {

        public static int frameTime = 10;

        String id;
        Frame[] frames;
        String jsonMetaData;

        public Frame getFrame(int timestamp) {
            for (int i=0; i<frames.length; i++) {
                if (frames[i].timestamp <= timestamp &&
                frames[i].timestamp+frameTime > timestamp) {
                    return frames[i];
                }
        }

        throw new IndexOutOfBoundsException();
    }
}


    class Frame {
        byte[] bytes;
        int timestamp;
    }

    class User {
        String id;
    }