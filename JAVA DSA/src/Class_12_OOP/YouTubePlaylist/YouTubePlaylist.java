package Class_12_OOP.YouTubePlaylist;

public class YouTubePlaylist {
    String[] playlist = new String[4];
    String[] visibility = {"Public","Public","Public","Public"};
    int videoCount = 0;

    public void uploadVideo(String s){

        if(videoCount ==4) System.out.println("Playlist is full!");
        else{
            playlist[videoCount++] = s;
            System.out.println(s+" uploaded successfully");
        }
    }

    public void details(){

        if(videoCount ==0) System.out.println("The Playlist is empty!");
        else{
            System.out.println("Total uploaded videos: "+ videoCount);
            for(int i=0; i<4; i++){
                if(!playlist[i].equals(""))System.out.println(playlist[i] +" - "+ visibility[i]);
            }
        }

    }

    public void removeVideo(String k){
        boolean flag = false;
        for(int i=0; i<4; i++){
            if(playlist[i].equals(k)){
                playlist[i] = "";
                videoCount--;
                System.out.println("Successfully removed "+k+" from the playlist");
                flag = true;
            }
        }
        if(!flag) System.out.println("Video not found!");
    }

    public String changeVisibility(String s1, String s2){
        for(int i=0; i<4; i++){
            if(playlist[i].equals(s1)) {
                visibility[i] = s2;
                return s1+" is now "+s2;
            }
        }
        return "";
    }
}
