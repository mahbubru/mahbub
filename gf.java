
/**
 * Write a description of class gf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gf
{
  {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        while(stopIndex != -1){
            if((stopIndex - startIndex) % 3 == 0){
                return stopIndex;
            }
            else{
                stopIndex = dna.indexOf(stopCodon, stopIndex + 1);
            }
        }
        return -1;
    }
    public String findGene(String dna, int Index){
        int startIndex = dna.indexOf("ATG", Index);
        if(startIndex == -1){
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int minIndex = 0;
        if (taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        }
        else {
            minIndex = taaIndex;
        }
        if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1){
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }
    public int printAllGenes(String dna) {
      int startIndex = 0,count = 0;
      while ( true ) {
          String currentGene = findGene(dna, startIndex);
          if (currentGene.isEmpty()) {
              break;
          }
          System.out.println(currentGene);
          count++;
          startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
        }
        return count;
    }
    public int countGenes(String dna){
        int x = printAllGenes(dna);
        System.out.println(x);
        return x;
    }
    public void testOn(String dna) {
        System.out.println("Testing printAllGenes on " + dna);
        //printAllGenes(dna);
        countGenes(dna);
    }
    public void testCountGenes(){
        countGenes("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        countGenes("");
        countGenes("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
    }
    public void test() {
        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        testOn("");
        testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
    }
}