import java.util.Scanner;

public class FindASCIIvalueOfCharacter {
    public static void main(String[] args) {
        //program to Find ASCII value of a character
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char ch =input.charAt(0);
        int ascii = ch;
        int castAscii = (int)ch;
        System.out.println("The ASCII value of " +ch+" is:"+ascii);
        System.out.println("The ASCII value of "+ ch+" is:"+castAscii);

/*
            int lowercasea = 97;
            int	lowercaseb = 98;
            int lowercasec = 99;
            int	lowercased = 100;
            int lowercasee = 101;
            int	lowercasef = 102;
            int	lowercaseg = 103;
            int lowercaseh = 104;
            int lowercasei = 105;
            int	lowercasej = 106;
            int	lowercasek = 107;
            int	lowercasel = 108;
            int lowercasem = 109;
            int lowercasen = 110;
            int lowercaseo = 111;
            int lowercasep = 112;
            int	lowercaseq = 113;
            int	lowercaser = 114;
            int	lowercases = 115;
            int lowercaset = 116;
            int lowercaseu = 117;
            int lowercasev = 118;
            int lowercasew = 119;
            int lowercasex = 120;
            int	lowercasey = 121;
            int	lowercasez = 122;
            //upper
            int uppercaseA = 65;
            int	uppercaseB = 66;
            int uppercaseC = 67;
            int	uppercaseD = 68;
            int uppercaseE = 69;
            int uppercaseF = 70;
            int uppercaseG = 71;
            int	uppercaseH = 72;
            int	uppercaseI = 73;
            int uppercaseJ = 74;
            int	uppercaseK = 75;
            int	uppercaseL = 76;
            int	uppercaseM = 77;
            int	uppercaseN = 78;
            int uppercaseO = 79;
            int	uppercaseP = 80;
            int	uppercaseQ = 81;
            int	uppercaseR = 82;
            int	uppercaseS = 83;
            int uppercaseT = 84;
            int uppercaseU = 85;
            int	uppercaseV = 86;
            int uppercaseW = 87;
            int	uppercaseX = 88;
            int uppercaseY = 89;
            int uppercaseZ = 90;*/
    }
}
