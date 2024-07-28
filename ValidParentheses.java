class Solution {
    public boolean isValid(String st) {
       Stack<Character> s=new Stack<>();
       for(int i=0; i<st.length(); i++){
        char ch=st.charAt(i);
        switch(ch){
            case '(':
            case '[':
            case '{':
               s.push(ch);
               break;
            case ')':
            if(s.isEmpty() || s.pop()!='(')return false;
            break;
            case ']':
            if(s.isEmpty() || s.pop()!='[')return false;
            break;
            case '}':
            if(s.isEmpty() || s.pop()!='{')return false;
            break;
        }

       }
       return s.isEmpty();
    }
}