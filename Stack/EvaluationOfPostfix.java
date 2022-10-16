class EvaluationOfPostfix {

//Works only for 1 digit number
    public static int Eval(String postfix){

      StackWithListInt st = new StackWithListInt();

      int x,y,res;

      for (int i = 0; i < postfix.length() ; i++ ) {

          if(isOperand(postfix.charAt(i))){
            st.push(postfix.charAt(i)-'0');
          }
          else {

            y = st.pop();
            x = st.pop();

            switch (postfix.charAt(i)) {

                case '+' :
                  res = x + y;
                  st.push(res);
                  break;

                case '-' :
                  res = x - y;
                  st.push(res);
                  break;

                case '*' :
                      res = x * y;
                      st.push(res);
                      break;

                case '/' :
                      res = x / y;
                      st.push(res);
                      break;
            }
          }
      }

      return st.pop();

    }




    public static Boolean isOperand(char x){

      if(x == '+' || x == '-' || x == '*' || x == '/'){
        return false;
      }
      return true;
    }


    public static void main(String[] args) {


      InfixToPostfix p = new InfixToPostfix();
      String s = "2+3-4/2*8";

      s = p.convert(s);
      System.out.println(s);
      System.out.println(Eval(s));
    }


}
