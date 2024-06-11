import java.util.Scanner;
public class SumOfChars {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          //Write a program that prints whether a given character is upper-case or lower-case.
          int n = Integer.parseInt(scan.nextLine());
          int sum = 0;
            // lower
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
        	int uppercaseZ = 90;

       String sequence = scan.nextLine();

            for (int i = 1; i <= n+1; i++) {
                 char ch = sequence.charAt(i);
                 if(Character.isUpperCase(ch)){
                    if(sequence.charAt(i)== 'A') {
                         sum+= uppercaseA;
                     }else if(sequence.charAt(i)== 'B'){
                         sum+= uppercaseB;
                     }else if(sequence.charAt(i)== 'C'){
                         sum+= uppercaseC;
                     }else if(sequence.charAt(i)== 'D'){
                         sum+= uppercaseD;
                     }else if(sequence.charAt(i)== 'E'){
                         sum+= uppercaseE;
                     }else if(sequence.charAt(i)== 'F'){
                         sum+= uppercaseF;
                     }else if(sequence.charAt(i)== 'G'){
                         sum += uppercaseG;
                     }else if(sequence.charAt(i)== 'H'){
                         sum+= uppercaseH;
                     }else if(sequence.charAt(i)== 'I'){
                         sum+= uppercaseI;
                     }else if(sequence.charAt(i)== 'J'){
                         sum+= uppercaseJ;
                     }else if(sequence.charAt(i)== 'K'){
                         sum+= uppercaseK;
                     }else if(sequence.charAt(i)== 'L'){
                         sum+= uppercaseL;
                     }else if(sequence.charAt(i)== 'M'){
                         sum+= uppercaseM;
                     }else if(sequence.charAt(i)== 'N'){
                         sum+= uppercaseN;
                     }else if(sequence.charAt(i)== 'O'){
                         sum+= uppercaseO;
                     }else if(sequence.charAt(i)== 'P'){
                         sum+= uppercaseP;
                     }else if(sequence.charAt(i)== 'Q'){
                         sum+= uppercaseQ;
                     }else if(sequence.charAt(i)== 'R'){
                         sum+= uppercaseR;
                     }else if(sequence.charAt(i)== 'S'){
                         sum+= uppercaseS;
                     }else if(sequence.charAt(i)== 'T'){
                         sum+= uppercaseT;
                     }else if(sequence.charAt(i)== 'U'){
                         sum+= uppercaseU;
                     }else if(sequence.charAt(i)== 'V'){
                         sum+= uppercaseV;
                     }else if(sequence.charAt(i)== 'W'){
                         sum+= uppercaseW;
                     }else if(sequence.charAt(i)== 'X'){
                         sum+= uppercaseX;
                     }else if(sequence.charAt(i)== 'Y'){
                         sum+= uppercaseY;
                     }else if(sequence.charAt(i)== 'Z'){
                         sum += uppercaseZ;
                     }
                 }
                 if(Character.isLowerCase(ch)){
                     if(sequence.charAt(i)== 'a'){
                         sum += lowercasea;
                     }else if(sequence.charAt(i)== 'b'){
                         sum+=lowercaseb;
                     }else if(sequence.charAt(i)== 'c'){
                         sum+=lowercasec;
                     }else if(sequence.charAt(i)== 'd'){
                         sum+=lowercased;
                     }else if(sequence.charAt(i)== 'e'){
                         sum+=lowercasee;
                     }else if(sequence.charAt(i)== 'f'){
                         sum+=lowercasef;
                     }else if(sequence.charAt(i)== 'g'){
                         sum+=lowercaseg;
                     }else if(sequence.charAt(i)== 'i'){
                         sum+=lowercasei;
                     }else if(sequence.charAt(i)== 'j'){
                         sum+=lowercasej;
                     }else if(sequence.charAt(i)== 'k'){
                         sum+=lowercasek;
                     }else if(sequence.charAt(i)== 'l'){
                         sum+=lowercasel;
                     }else if(sequence.charAt(i)== 'm'){
                         sum+=lowercasem;
                     }else if(sequence.charAt(i)== 'n'){
                         sum+=lowercasen;
                     }else if(sequence.charAt(i)== 'o'){
                         sum+=lowercaseo;
                     }else if(sequence.charAt(i)== 'p'){
                         sum+=lowercasep;
                     }else if(sequence.charAt(i)== 'h'){
                         sum+=lowercaseh;
                     } else if(sequence.charAt(i)== 'q'){
                         sum+=lowercaseq;
                     }else if(sequence.charAt(i)== 'r'){
                         sum+=lowercaser;
                     }else if(sequence.charAt(i)== 's'){
                         sum+=lowercases;
                     }else if(sequence.charAt(i)== 't'){
                         sum+=lowercaset;
                     }else if(sequence.charAt(i)== 'u'){
                         sum+=lowercaseu;
                     }else if(sequence.charAt(i)== 'v'){
                         sum+=lowercasev;
                     }else if(sequence.charAt(i)== 'w'){
                         sum+=lowercasew;
                     }else if(sequence.charAt(i)== 'x'){
                         sum+=lowercasex;
                     }else if(sequence.charAt(i)== 'y'){
                         sum+=lowercasey;
                     }else if(sequence.charAt(i)== 'z'){
                         sum+=lowercasez;
                     }
                 }
                System.out.printf("The sum equals: ",sum);
                        }
                }
                }


