public class SingersTest {
    public static void main(String[] arg) {
        //object singer1 with no-argument constructor and print default values
        Singers singer1 = new Singers();
        System.out.println("Singer's Id: " + singer1.singerId + "\n" +
                            "Singer's Name: " + singer1.singerName + "\n" +
                            "Singer's Address: " + singer1.singerAddress + "\n" +
                            "Singer's Birthday: " + singer1.singerBirthday + "\n" +
                            "Singer's Publish Number: " + singer1.numPublish + "\n");
        //another print
//        System.out.println(singer1.singerId);
//        System.out.println(singer1.singerName);
//        System.out.println(singer1.singerAddress);
//        System.out.println(singer1.singerBirthday);
//        System.out.println(singer1.numPublish);

        //set the values by setAll
        singer1.setAll(1, "Hanren", "Toronto", 1990, 1);
        //display1
        System.out.println("Singer's Id: " + singer1.singerId + "\n" +
                "Singer's Name: " + singer1.singerName + "\n" +
                "Singer's Address: " + singer1.singerAddress + "\n" +
                "Singer's Birthday: " + singer1.singerBirthday + "\n" +
                "Singer's Publish Number: " + singer1.numPublish + "\n");

        //set the values individually
        singer1.setSingerName("Henry");
        singer1.setSingerId(2);
        singer1.setSingerBirthday(1991);
        singer1.setSingerAddress("Canada");
        singer1.setNumPublish(2);
        //display2
        System.out.println(singer1.getInfo());
    }
}
