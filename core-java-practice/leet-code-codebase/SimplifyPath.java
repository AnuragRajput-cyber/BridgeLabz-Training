package leet_code_codebase;
import java.util.*;
public class SimplifyPath {
	public static String Simplify(String path) {
		StringBuilder ans=new StringBuilder();
        String[]str=path.split("/");
        Stack<String>st=new Stack<>();
        for(String s:str){
            if(s.equals("")||s.equals(".")) continue;
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(s);
            }
        }
        for(String dr:st){
            ans.append("/").append(dr);
        }
        return ans.length()==0? "/" :ans.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String path=sc.next();
		String res=Simplify(path);
		System.out.println(res);
	}

}
