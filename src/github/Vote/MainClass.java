package github.Vote;

public class MainClass {

    public static void main(String[] args) {

        Vote voteLocation1 = new Vote();
        Vote voteLocation2 = new Vote();
        Vote voteLocation3 = new Vote();

        Thread location1 = new Thread(voteLocation1, "Location1");
        Thread location2 = new Thread(voteLocation2, "Location2");
        Thread location3 = new Thread(voteLocation3, "Location3");

        location1.start();
        location2.start();
        location3.start();
    }

}
