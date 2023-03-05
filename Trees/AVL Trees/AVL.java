class AVL {

    Node root;

    int NodeHeight(Node p){

        int hl, hr;

        if(p != null && p.right != null){
            hr = p.right.height;
        }
        else {
            hr = 0;
        }

        if(p != null && p.left != null){
            hl = p.left.height;
        }
        else {
            hl = 0;
        }

        if (hl > hr){
            return hl + 1;
        }
        else{
            return hr +1;
        }
    }

    int balanceFactor(Node p){

        
        int hl, hr;

        if(p != null && p.right != null){
            hr = p.right.height;
        }
        else {
            hr = 0;
        }

        if(p != null && p.left != null){
            hl = p.left.height;
        }
        else {
            hl = 0;
        }

        return hl-hr;

    }


    Node LLRotation(Node p){
        Node pl = p.left;
        Node plr = pl.right;

        pl.right = p;
        p.left = plr;

        p.height = NodeHeight(p);
        pl.height = NodeHeight(pl);

        if(root == p){
            root = pl;
        }

        return pl;
    }



    Node LRRotation(Node p){

        Node pl = p.left;
        Node plr = pl.right;

        pl.right = plr.left;
        p.right = plr.right;
        plr.right = p;
        plr.left = pl;

        pl.height = NodeHeight(pl);
        p.height = NodeHeight(p);
        plr.height = NodeHeight(plr);

        if(root == p){
            root = plr;
        }

        return plr;
    }


    Node RRRotation(Node p){
        Node pr = p.right;
        Node prl = pr.left;


        p.right = prl;
        pr.left = p;
        
        if(root == p){
            root = pr;
        }

        p.height = NodeHeight(p);
        pr.height = NodeHeight(pr);
        
        return pr;
    }



    Node  RLRotation(Node p){

        Node pr = p.right;
        Node prl = pr.left;


        pr.left = prl.right;
        p.right = prl.left;
        
        prl.left = p;
        prl.right = pr;


        if(root == p){
            root = prl;
        }

        pr.height = NodeHeight(pr);
        p.height = NodeHeight(p);
        prl.height = NodeHeight(prl);

        return prl;

    }



     Node RInsert(Node p, int key){

        Node t;

        if(p == null){

            t = new Node();
            t.data = key;
            t.height = 1;
            t.left = t.right = null;
            return t;
        }
        if(key < p.data)
            p.left=RInsert(p.left,key);
        else if(key > p.data)
            p.right=RInsert(p.right,key);


            p.height = NodeHeight(p);

        if(balanceFactor(p) == 2 && balanceFactor(p.left) == 1){
           return LLRotation(p);
        }
       if(balanceFactor(p) == 2 && balanceFactor(p.left) == -1){
           return LRRotation(p);
       }

       if(balanceFactor(p) == -2 && balanceFactor(p.right) == 1){
           return RLRotation(p);
       }
       if(balanceFactor(p) == -2 && balanceFactor(p.right) == -1){
           return RRRotation(p);
       }

    return p;

    }
   


    Node InPre(Node p){

        while(p != null && p.right != null )
            p = InPre(p.right);
        return p;
    }


    Node InSucc(Node p){

        while(p != null && p.left != null )
            p = InPre(p.left);
        return p;
    }


    Node Delete( int key, Node p){

        if(p == null){
            return p;
        }

        if(p.left ==  null && p.right == null)
        {
            if(p == root)
                root = null;
            return null;
        }

        else {
         if(key > p.data){
            p.right = Delete( key,p.right);
        }
       else if(key < p.data){
            p.left = Delete(key, p.left);
        }
    
            else {

                if(NodeHeight(p.left) > NodeHeight(p.right)){
                    Node  q = InPre(p.left);
                    p.data = q.data;
                    p.left = Delete(q.data, p.left); 
                }

                else {
                    Node  q = InSucc(p.right);
                    p.data = q.data;
                    p.right = Delete(q.data, p.right); 
                }

            }
        }

        p.height = NodeHeight(p);
                
            int bf = balanceFactor(p);

            System.out.println("BF" + bf);

            if(bf == 2 && balanceFactor(p.left)== 1){
                return LLRotation(p);
            }

            if(bf == 2 && balanceFactor(p.left) == -1){
                return LRRotation(p);
            }

            if(bf == 2 && balanceFactor(p.left) == 0){
                return LLRotation(p);
            }

            if(bf == -2 && balanceFactor(p.right)== 1){
                return RLRotation(p);
            }

            if(bf == -2 && balanceFactor(p.right) == -1){
                return RRRotation(p);
            }

            if(bf == -2 && balanceFactor(p.right) == 0){
                return RRRotation(p);
            }


            

            return p;
        
        }



    void InOrder(Node p){

        if(p == null){
            return;
        }
        InOrder(p.left);
        System.out.println(p.data);
        InOrder(p.right);
    }


    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    public static void main(String[] args) {
         AVL tree = new AVL();

         tree.root = tree.RInsert(tree.root,10);
         tree.root = tree.RInsert(tree.root,20);
         tree.root = tree.RInsert(tree.root, 30);
         tree.root = tree.RInsert(tree.root, 40);
         tree.root = tree.RInsert(tree.root, 50);

         tree.root = tree.RInsert(tree.root, 25);
        //  tree.root = tree.RInsert(tree.root, 13);
        //  tree.root = tree.RInsert(tree.root, 22);
        //  tree.root = tree.RInsert(tree.root, 31);
        //  tree.root = tree.RInsert(tree.root, 40);

         tree.preOrder(tree.root);

         System.out.println(tree.root.data);

         tree.root = tree.Delete(40, tree.root);
         tree.root = tree.Delete(50, tree.root);

         tree.preOrder(tree.root);

         System.out.println(tree.balanceFactor(tree.root));

         

    }

}