import java.util.Date;

public class Singers {
    // instance variables
    int singerId;
    String singerName;
    String singerAddress;
    int singerBirthday;
    int numPublish;

    // constructor0
    public Singers(){}

    // constructor1
    public Singers(int singerId){
        this.singerId = singerId;
    }

    // constructor2
    public Singers(int singerId, String singerName){
        this.singerId = singerId;
        this.singerName = singerName;
    }

    // constructor3
    public Singers(int singerId, String singerName, String singerAddress){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
    }

    // constructor4
    public Singers(int singerId, String singerName, String singerAddress, int singerBirthday){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.singerBirthday = singerBirthday;
    }

    // constructor5
    public Singers(int singerId, int numPublish, String singerName, String singerAddress, int singerBirthday){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.singerBirthday = singerBirthday;
        this.numPublish = numPublish;
    }

    //setters
    public void setSingerId(int singerId) { this.singerId = singerId;}
    public void setSingerName(String singerName) { this.singerName = singerName;}
    public void setSingerAddress(String singerAddress) { this.singerAddress = singerAddress;}
    public void setSingerBirthday(int singerBirthday) { this.singerBirthday = singerBirthday;}
    public void setNumPublish(int numPublish) {this.numPublish = numPublish;}

    //setAll
    public void setAll(int singerId, String singerName, String singerAddress, int singerBirthday, int numPublish){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.singerBirthday = singerBirthday;
        this.numPublish = numPublish;
    }

    //getters
    public int getSingerId() {return singerId;}
    public String getSingerName() {return singerName;}
    public String getSingerAddress() {return singerAddress;}
    public int getSingerBirthday() {return singerBirthday;}
    public int getNumPublish() {return numPublish;}

    //getInfo
    public String getInfo() {
        return "Singer's ID: " + singerId + "\n" +
                "Singer's Name: " + singerName + "\n" +
                "Singer's Address: " + singerAddress + "\n" +
                "Singer's Date of birth: " + singerBirthday + "\n" +
                "Number of albums published: " + numPublish;
    }
}
