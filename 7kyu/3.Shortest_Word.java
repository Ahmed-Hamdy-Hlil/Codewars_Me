public class Shortest_Word {
    public static void main(String[] args) {
        System.out.print(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
    public static int findShort(String s) {;
        /*String[] Words =s.split(" ");
        int [] count=new int[s.length()];
        for (int i=0;i< Words.length;i++)
        {
            count[i]=Math.min(Words[0].length(),Words[i].length());
        }
        int min = count[0];
        for (int j : count) {
            if (min > j) {
                if (j != 0)
                    min = j;
            }
        }*/
        /*for (int i=0;i< count.length;i++)
        {
            if (min > count[i])
            {
                if(count[i]!=0)//we have problem smallest value is 0
                    min = count[i];
            }
        }*/
        //return min;
        //or
        String[] words = s.split(" ");
        // the length of each word is compare with the shortest now
        String one = words[0];
        for (String word : words) {
            if (word.length() < one.length()) one = word;
        }
        return one.length();

    }
}
