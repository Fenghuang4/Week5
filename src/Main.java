// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String sentence = "The Constitutional Convention in Philadelphia met between May and September of 1787 to address the problems of the weak central government that existed under the Articles of Confederation.";
        String words[] = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals("convention")){
                System.out.println("index: " + i);
            }
        }
    }

}