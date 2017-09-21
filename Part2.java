
public class Part2
{
     public int howMany(String stringa, String stringb){
     int startIndex = 0,count = 0;
        int curIndex = stringb.indexOf(stringa, startIndex);
        while(true){
            if(curIndex != -1){
                count++;
            }
            else{
                break;
            }
            curIndex = stringb.indexOf(stringa, curIndex + stringa.length());
        }
        return count;
    }
     public void testHowMany(){
        String stringa = "GAA";
        String stringb = "ATGAACGAATTGAATC";
        System.out.println(howMany(stringa, stringb));
        stringa = "AA";
        stringb = "ATAAAA";
        System.out.println(howMany(stringa, stringb));
    }
}
