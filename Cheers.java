// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String name = "" + args[0];
            name = name.toUpperCase();
            int cheerCount = Integer.parseInt(args[1]);
            String lettersForAn = "AEFHILMNORSX";
            for(int i = 0; i < name.length(); i++) {
                char nameChar = name.charAt(i);
                System.out.print("Give me ");
                if(lettersForAn.indexOf(nameChar) != -1)  System.out.print("an ");
                else  System.out.print("a  ");
                System.out.println(nameChar + ": " + nameChar + "!");
            }
            System.out.println("What does that spell?");
            while(cheerCount > 0) {
                System.out.println(name + "!!!");
                cheerCount--;
            }
        }
}
