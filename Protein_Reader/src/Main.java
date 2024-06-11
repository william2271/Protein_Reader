import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Determine if there is a protein in a strand of DNA.
//A: Adenine
//C: Cytosine
//G: Guanine
//T: Thymine

        Scanner myObj = new Scanner(System.in);
      System.out.println("Type a strand of DNA to read if it contains a protain") ;
      System.out.println("Examples of strans of DNA are: ");
        System.out.println("Each letter means: A: Adenine ");
        System.out.println("C: Cytosine ");
        System.out.println("G: Guanine");
        System.out.println("T: Thymine");
        System.out.println("1. ATGCGATACGCTTGA");
        System.out.println("2. ATGCGATACGTGA");
        System.out.println("3. ATTAATATGTACTGA ");


        String dna=myObj.nextLine();
        int length = dna.length();
        System.out.println("Length: " + length);
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
            System.out.println("The 3 conditions are satisfied.");
            String protein = dna.substring(start, stop+3);
            System.out.println("Protein: " + protein);
        } else{
            System.out.println("No protein found");
        }
    }
}