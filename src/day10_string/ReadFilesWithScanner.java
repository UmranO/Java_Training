package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main (String[] args) throws IOException {

      //Scanner scan=new Scanner(); To check what kind of arguments Sc. Constructor will accept Control+Space in()
                                  //Or Control+hoover over Scanner+click show what kind of args can be given to Scan
                                  //Can give the file object or file path-To give the file object we need to create
                                  //another object from File Class that came from another package

                                                                        //Scanner compile error veriyordu
    Scanner scan=new Scanner(Path.of("src/day10_string/Test.txt"));//Add exception to ()signature option'ini sectik

        System.out.println(scan.nextLine());  //Everytime we call nextLine() it only takes 1 line

        System.out.println(scan.nextLine());

        System.out.println(scan.hasNext());
        scan.close();

    }
}
/*
Bu sekilde netLine()'dan once next() yapinca o ilk kelimeyi okuyor. Nextline()'da ilk kelimeden sonraki bosluktan
itibaren aliyor. Pespese iki Nextline() verince herbiri 1 satir aliyor
System.out.println(scan.next());  //Everytime we call nextLine() it only takes 1 line
System.out.println(scan.nextLine());

scan.hasNext(), hasNextLine()...--Bununla file empty mi degil mi turu check edilebiliyormus

 */