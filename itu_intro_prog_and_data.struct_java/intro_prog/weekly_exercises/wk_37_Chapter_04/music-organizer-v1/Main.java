public class Main {
    public static void main(String[] args) {
        /* 
        Write your code below. If you are unsure as to what some of the questions mean, we are ready to help on teams,
        please do write us.
        */
    /* Exercise 4.1 */

        MusicOrganizer musicOrg1 = new MusicOrganizer();

        musicOrg1.addFile("The Doors - LA Woman");
        musicOrg1.addFile("Led Zeppelin - Dazed and Confused");
        musicOrg1.addFile("Van Halen - Jump");
        musicOrg1.addFile("Ramones - Wanna Be Sedated");
        musicOrg1.addFile("Twistd Sister - I Wanna Rock");

        musicOrg1.getNumberOfFiles();

        musicOrg1.listFile(0);

        musicOrg1.listFile(3);
    
   /* Exercise 4.2 */

        MusicOrganizer musicOrg2 = new MusicOrganizer();

        musicOrg2.removeFile(0);

        /* I didn't get an error, but honestly I was expecting one, since I presumed that Java would know 
        if my ArrayList is empty */

    /* Exercise 4.3 */


        MusicOrganizer musicOrg3 = new MusicOrganizer();

        musicOrg3.addFile("Tanya Stephens - It's A Pity");
        musicOrg3.addFile("Bob Marley - Redemption Song");
     
        musicOrg3.listFile(0); musicOrg3.listFile(1);

        musicOrg3.removeFile(0);
        musicOrg3.listFile(0);

        /* the variabe stored in index 1 moved to index 0 after deleting the previous index 1.
            it's not what i expected to happen, but after it did, I rememberd the rule from the book */

    /* Exercise 4.8 */

        /* answer is 10. it's the indexing that is off*/

    /* Exercise 4.9 */

    /*  items.get(4); */         

    /* Exercise 4.10 */

    /*   14                 */

    /* Exercise 4.12 */

    /* dates.remove(2); */

    /* Exercise 4.13 */

    /* 5 */

    /* Exercise 4.14 */

    musicOrg1.checkIndex(3);

    musicOrg2.checkIndex(0);

    /* my method works if my int is zero */

    /* it's done in the music org. classs */

    /* Exercise 4.15 */

    if(musicOrg1.validIndex(4)) {
        System.out.println("TRUE");
    
    }else {

        System.out.println("FALSE");
    }


    if(musicOrg3.validIndex(4)) {
        System.out.println("TRUE");
    
    }else {

        System.out.println("FALSE");
    }

    /* if we test it with a empty array list the result will be a flase statement */

    }

    /* Exercise 4.16 */

}




  
    
