
class ParenthesisBalancing {
	char stack1[] = new char[20];
	int top = -1;

	void push(char ch) {
		if(top >= stack1.length) {
			System.out.println("Overflow");
		} else {
			stack1[++top] = ch;
		}
	}

	char pop() {
		if(top <= -1) {
			System.out.println("Underflow");
			return 'x';
		} else {
			return stack1[top];
		}
	}

	char peek() {
		return stack1[top];
	}

	boolean isEmpty() {
		if(top == -1) {
			return true;
		} else {
			return false;
		}
	}

	 boolean paranthesisBal(String s) {
		 for(int i = 0; i < s.length(); i++) {
			 char c = s.charAt(i);
			 if(c == '(' || c == '{' || c == '[') {
				 push(c);
			 } else if(c == ')') {
				 char x = peek();
				 if(x == '(') {
					 pop();
					 return true;
				 } else {
					 return false;
				 }
			 } else if(c == '}') {
				 char x = peek();
				 if(x == '{') {
					 pop();
					 return true;
				 } else {
					 return false;
				 }
			 } else if(c == ']') {
				 char x = peek();
				 if(x == '[') {
					 pop();
					 return true;
				 } else {
					 return false;
				 }
			 }
		 }
		 return(isEmpty());
	 }
}
public class ParenthesisBalance {
  public static void main(String[] args) {
    ParenthesisBalancing s = new ParenthesisBalancing();
    System.out.println(s.paranthesisBal("{ ( ) { [ ( ) ] } }"));
		System.out.println(s.paranthesisBal(") ("));
    System.out.println(s.paranthesisBal("[ ( ] )"));
    System.out.println(s.paranthesisBal("{ ( ) ( ) ( ) [ { } ] }"));
  }
}
