class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                counter++;
                
                if(counter == count){
                    return s.substring(i + 1);
                }
            
            }
        }
        
        return "";
    }
}