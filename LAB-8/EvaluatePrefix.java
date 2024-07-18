import java.util.Stack;

public class EvaluatePrefix {
        public static void main(String[] args) {
            Stack <Integer> st = new Stack<>();
            String s = "*+369";
    
            for(int i = s.length()-1; i>=0; i--){
                if(Character.isDigit(s.charAt(i))){
                    st.push((s.charAt(i) - '0'));
                }
                else{
                    int second = st.pop();
                    int first = st.pop();
    
                    switch (s.charAt(i)) {
                        case '+': st.push(first + second);
                            break;
                        case '-': st.push((first > second)?first-second:second-first);
                             break;
                        case '*': st.push(first * second);
                            break;
                        case '/': st.push((first > second)?first/second:second/first);
                            break;   
                    
                        default:
                            break;
                    }
                }
    
            }
            System.out.println(st.pop());
    }
}
