
class InfixToPostfix {


    public static Boolean isOperand(char x){

      if(x == '+' || x == '-' || x == '*' || x == '/'){
        return false;
      }
      return true;
    }

    public static int precendence(char x){
      if(x == '+' || x == '-')
        return 1;
      if( x == '*' || x == '/')
        return 2;


    return 0;
  }


  public static String convert(String infix){

    StackWithList stack = new StackWithList();

    String res  = "";

    for(int i = 0; i < infix.length(); i++){

      if(isOperand(infix.charAt(i)))
      {
        res = res + infix.charAt(i);
      }
      else {
        char z = stack.stackTop();
        if(precendence(infix.charAt(i)) > precendence(z))
        {
          stack.push(infix.charAt(i));

        }
        else {
          res = res + stack.pop();
          stack.push(infix.charAt(i));
        }
      }
    }

    while(stack.stackTop() != '1') {
    	res = res + stack.pop();
    }


	  return res;

	  }



  public static void main(String[] args) {
    String infix = "a+b-c*d/e";
  
   String result = convert(infix);
    System.out.println(result);
  }
}
