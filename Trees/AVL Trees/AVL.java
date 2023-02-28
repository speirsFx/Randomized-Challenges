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
            root = p;
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

        p.height = NodeHeight(p);
        pr.height = NodeHeight(pr);
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
            if(root == null){
                root = t;
            }
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

       if(balanceFactor(p) == -2 && balanceFactor(p.left) == 1){
           return RLRotation(p);
       }
       if(balanceFactor(p) == -2 && balanceFactor(p.left) == -1){
           RRRotation(p);
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



    public static void main(String[] args) {
         AVL tree = new AVL();

         tree.RInsert(tree.root, 4);
         tree.RInsert(tree.root, 3);
         tree.RInsert(tree.root, 2);
         tree.RInsert(tree.root, 1);
         tree.RInsert(tree.root, 0);

         tree.RInsert(tree.root, 4);
         tree.RInsert(tree.root, 13);
         tree.RInsert(tree.root, 22);
         tree.RInsert(tree.root, 31);
         tree.RInsert(tree.root, 40);

         tree.InOrder(tree.root);
         
         

    }

}