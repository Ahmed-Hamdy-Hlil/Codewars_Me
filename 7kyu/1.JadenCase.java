class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase.isEmpty()) {
            return null;
        }
        else {
            String Upper;
            StringBuilder Result = new StringBuilder();String[] Words = phrase.split(" ");
            for (String word : Words) {
                Upper = String.valueOf(word.charAt(0)).toUpperCase();
                Result.append(Upper).append(word.replace(String.valueOf(word.charAt(0)), ""));
                if (!word.equals(Words[Words.length - 1]))
                    Result.append(" ");
                else Result.append("");
            }
            return Result.toString();
            //-----------------------------With String
     /*else {
            String Upper;String Result = "";String[] Words = phrase.split(" ");
            for (String word : Words) {
                Upper = String.valueOf(word.charAt(0)).toUpperCase();
                Result += Upper + word.replace(String.valueOf(word.charAt(0)), "");
                if (!word.equals(Words[Words.length - 1]))
                    Result += " ";
                else Result +="";
            }
            return Result;*/
        }
    }
}
