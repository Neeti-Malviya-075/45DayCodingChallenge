class Solution {
    public int calculate(String s) {
        int num=0;
        char operator='+';
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char charValue=s.charAt(i);
            if(Character.isDigit(charValue)){
                num=(num*10)+(charValue-'0');
            }
            if(!Character.isDigit(charValue) && charValue!=' ' || (i==s.length()-1)){
                if(operator=='+'){
                    st.push(num);
                }else if(operator=='-'){
                    st.push(-1*num);
                }else if(operator=='*'){
                    st.push(num*st.pop());
                }else if(operator=='/'){
                    st.push(st.pop()/num);
                }
                num=0;
                operator=charValue;
            }
        }
        int sum=0;
while(!st.isEmpty()){
    sum+=st.pop();
}
return sum;

        
    }

}

