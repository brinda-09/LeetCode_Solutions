class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> small=new HashSet<>();
        Set<Character> caps=new HashSet<>();
        int count=0;
        for(char c:word.toCharArray()){
             if(Character.isLowerCase(c)){
                small.add(c);
             }else{
                caps.add(c);
             }
        }
        for(char c :small){
            if(caps.contains(Character.toUpperCase(c))){
                count++;
            }
        }
        return count;
    }
}