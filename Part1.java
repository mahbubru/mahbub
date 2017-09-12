
public class Part1
{
 public String findSimpleGene               (String dna)
 {
   int startIndex = dna.indexOf("ATG");
   if(startIndex == -1)
   return "";
   int stopIndex = dna.indexOf("TAA", startIndex+3);
   if ((stopIndex - startIndex) % 3 == 0) 
   return dna.substring(startIndex, stopIndex+3);

   return "";
 }
}