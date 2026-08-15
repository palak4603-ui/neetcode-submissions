
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        String sorted= new String(chars);
        char[] charm=t.toCharArray();
        Arrays.sort(charm);
        String sortedd= new String(charm);

        if(sorted.equals(sortedd))
        {
            return true;
        }
        return false;

        

    }
}
