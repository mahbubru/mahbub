
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
 
	public void testSimpleGene               () {
		String a = "cccatggggtttaaataataataggagagagagagagagttt";
		String ap = "atggggtttaaataataatag";
		a = a.toUpperCase();
		ap = ap.toUpperCase();
		String result = findSimpleGene(a);
		if (ap.equals(result)) {
			System.out.println("success for " + ap + " length " + ap.length());
		}
		else {
			System.out.println("mistake for input: " + a);
			System.out.println("got: " + result);
			System.out.println("not: " + ap);
		}
	}
}

