import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
		 String[] paths = path.split("/");
	        Stack<String> stack = new Stack<String>();
	        for(String s : paths){
	            if(s.equals("..")){
	                if(!stack.isEmpty())
	                    stack.pop();}
	            else if(s.length() > 0 && !s.equals(".") && !s.equals(".."))
	                stack.push(s);
	        }
	        StringBuilder sb = new StringBuilder();
	        for (String s : stack) 
	            sb.append("/" + s);
	        if (sb.length() == 0) 
	            sb.append("/");
	        return sb.toString();
	}
}
