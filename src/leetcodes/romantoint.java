package leetcodes;

public class romantoint {
    public static void main(String[] args){
    String a="LVIII";
    int b=Solution3.romanToInt(a);
        System.out.println(b);
    }
}
class Solution3 {
    public static int romanToInt(String s) {
        int a=0,i=s.length(),b=0;

        while (b!=i){
            if(b!=s.length()-1){
                if (s.charAt(b)=='I'){
                    if (s.charAt(b+1)=='V'){
                        a+=4;
                        b+=2;
                        continue;
                    }
                    else if (s.charAt(b+1)=='X'){
                        a+=9;
                        b+=2;
                        continue;
                    }
                }
                if (s.charAt(b)=='X'){
                    if (s.charAt(b+1)=='L'){
                        a+=40;
                        b+=2;
                        continue;
                    }
                    else if (s.charAt(b+1)=='C'){
                        a+=90;
                        b+=2;
                        continue;
                    }
                }
                if (s.charAt(b)=='C'){
                    if (s.charAt(b+1)=='D'){
                        a+=400;
                        b+=2;
                        continue;
                    }
                    else if (s.charAt(b+1)=='M'){
                        a+=900;
                        b+=2;
                        continue;
                    }
                }
                }


            switch (s.charAt(b)){
                case 'I':{
                    a+=1;
                    break;
                }
                case 'V':{
                    a+=5;
                    break;
                }
                case 'X':{
                    a+=10;
                    break;
                }
                case 'L':{
                    a+=50;
                    break;
                }
                case 'C':{
                    a+=100;
                    break;
                }
                case 'D':{
                    a+=500;
                    break;
                }
                case 'M':{
                    a+=1000;
                    break;
                }
            }
            b++;
        }
        return a;
    }
}