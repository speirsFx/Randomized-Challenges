class ParenthesisMatching2 {




    public static Boolean isBalance2(String s){

        StackWithList stack = new StackWithList();

      for (int i = 0; i < s.length() ; i++ ) {

        if(s.charAt(i) == '(' ||  s.charAt(i) == '{' ||  s.charAt(i) == '['){
          stack.push(s.charAt(i));

        }
      //  stack.display();
        if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
          char x = stack.pop();
          if(x == '1'){
            return false;
          }

          int f = (int) s.charAt(i);
          int l = (int) x;

          if(l - f > 2){
            return false;
          }
        }
      }

      if(stack.top != null)
        return false;
      return true;

    }



    public static void main(String[] args) {

      String s = "({{{{}}}))";

      Boolean check = isBalance2(s);
      System.out.println(check);

    }


  }
