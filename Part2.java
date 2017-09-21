
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
}
