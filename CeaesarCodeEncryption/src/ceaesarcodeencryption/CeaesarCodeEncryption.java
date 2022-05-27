package ceaesarcodeencryption;
import java.util.Scanner;
public class CeaesarCodeEncryption {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,num,num1,high,x;        
        String str ;        
        char s,first,last = 0;
        System.out.println("Enter your message :");
        str = input.nextLine();
        char[] ch = str.toCharArray();        
        System.out.println(ch[0]);
        System.out.println("Enter number to change alphabetical order");
        num1 = input.nextInt();
        
        
        char [] alpha = new char[122];
        char [] bh = new char[alpha.length];
        System.out.println("the encrypted caesar code is:");
       char [] ab = {'x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n',
       'o','p','q','r','s','t','u','v','w'};
        char temp = ab[0];
        
        for(x=0;x < ch.length; x++){
            
            if(ch[x]!=' ' && ch[x]!='1'&& ch[x]!='2'&& ch[x]!='3'&& ch[x]!='4'&& ch[x]!='5'&& ch[x]!='6'&& ch[x]!='7'&& ch[x]!='8'&& ch[x]!='9'){
                if(num1==1){
                System.out.print(ab[(int)str.toLowerCase().charAt(x)-97]+"");
                }
                else if(num1>1){
                    for(int k =1;k <=ab.length;k++){
                        ab[k-1]=ab[k];
                    }
                    ab[ab.length-1]=temp;
                    
                    System.out.print(ab[(int)str.toLowerCase().charAt(x)-97]+"");
            } 
                else{
                    System.out.println("Sorry the order must be greater than zero");
                }
            }}
           if(ch[x]==' '){
               System.out.print(" ");
           }
           else if(ch[x]=='0'||ch[x]=='1'||ch[x]=='2'||ch[x]=='3'||ch[x]=='4'||ch[x]=='5'||ch[x]=='6'||ch[x]=='7'||ch[x]=='8'||ch[x]=='9'){
               System.out.print(ch[x]+"");
           }
        
        /* for ( s = 97 ; s < alpha.length-1; s++){
        alpha[s] = s;
        high=alpha.length;
        for(num1 =1; num1 <=num;){
            first = alpha[s];
            last = alpha[high-3];
            alpha[s] = last;
            high++;
            if(last < alpha[high]){
                last = first;               //alpha[s] = last;
               }
            if(first < last){
                num1++;
                high--;
            }}
        for(int k = 0; k < ch.length-1;k++){
            if(ch[k]==alpha[s]){
                ch[k]=last;
                System.out.print(ch[k]+"");                
            }

        }
         
       
         }*/
        System.out.println();
}
}