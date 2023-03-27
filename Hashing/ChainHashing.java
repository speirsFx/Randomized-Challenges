
class chainHashing {

    static Node arr[] = new Node[10];



    static void insert(int data){

        int hf = data %10;

        Node newNode = new Node(data);

        if(arr[hf] == null){
            arr[hf] = newNode;
        }
        else {
            if(arr[hf].data >= data){
                Node node = arr[hf];
                arr[hf] = newNode;
                newNode.next = node;
                return;
            }
            else {
                if(arr[hf].next == null){
                    arr[hf].next = newNode;
                    return;
                }
                Node node = arr[hf].next;
                Node n = node;
                while(node != null && node.data <= data){
                    n = node;
                    node = node.next;
                }
                newNode.next = n.next;
                n.next = newNode;
                return;
            }

            
        }
        
    }


    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5,3,5,55,10,12,555,75,87,85,105,985};

        for(int i: a){
            insert(i);
        }

      Node node = arr[5];
      while(node != null){
        System.out.println(node.data);
        node = node.next;
      }  
      


    }




}

