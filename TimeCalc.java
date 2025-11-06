public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minuts = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int newMinuts = (minuts + Integer.parseInt("" + args[1]));
        hours = (hours + (newMinuts / 60)) % 24;
        newMinuts %= 60;
        if(hours < 10)  System.out.print("0" + hours + ":");
        else  System.out.print(hours + ":");
        if (newMinuts < 10)  System.out.println("0" + newMinuts);
        else  System.out.println(newMinuts);
    }
}
