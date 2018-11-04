
class Stack{
	int max = 100;
	char a[];
	int size;
	int top;

	Stack(int size) {
		a = new char[max];
		this.size = size;
		this.top = -1;
	}

	public void push(char x) {
		if(top >= size) {
			System.out.println("Stack overflow");
		} else {
			if(top <= -1) {
				top = 0;
				a[top] = x;
			} else {
				a[++top] = x;
			}
		}
	}

	public void pop() {
		if(top <= -1) {
			System.out.println("Stack underflow");
		} else {
			top--;
		}
	}

	public char peek() {
		if(top <= -1) {
			System.out.println("Satck underflow");
			return '\0';
		} else {
			return a[top];
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean paranthesisBal(String s) {

		for(int i = 0; i < s.length(); i++) {

			char x = s.charAt(i);

			if(x == '{' || x == '(' || x == '[') {
				push(x);
			}

			if(x == ')') {
				char c = peek();
				if(c == '(') {
					pop();
					return true;
				} else {
					return false;
				}
			} else {
				if(x == '}') {
					char c = peek();
					if(c == '{') {
						pop();
						return true;
					} else {
						return false;
					}
				} else {
					if(x == ']') {
						char c = peek();
						if(c == '[') {
						;	pop();
							return true;
						} else {
							return false;
						}
					}
				}
			}
		}

		return isEmpty();
    
	}
}

public class ParenthesisBalancing{
	public static void main(String[] args) {

		Stack s = new Stack(10);
		System.out.println(s.paranthesisBal("{ ( ) { [ ( ) ] } }"));
		System.out.println(s.paranthesisBal(") ("));
    System.out.println(s.paranthesisBal("[ ( ] )"));
    System.out.println(s.paranthesisBal("{ ( ) ( ) ( ) [ { } ] }"));
	}
}
