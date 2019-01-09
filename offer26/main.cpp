bool hasEqaNode(BinTree *root1,BinTree *root2){
    bool ans=false;

    if(root1 != NULL && root2 != NULL){
        if(root1->data == root2->data){
            ans= hasMinTree(root1,root2);
        }
        else if(root1->data > root2->data){
            ans = hasEqaNode(root1->lchild,root2);
        }
        else{
            ans = hasEqaNode(root1->rchild,root2);
        }
    }
    return ans;
}



bool  hasMinTree(BinTree *root1,BinTree *root2){
    if(root2 == NULL){
        return true;
    }

    if(root1 == NULL){
        return false;
    }

    if(root1->data != root2->data){
        return false;
    }


    return hasMinTree(root1->lchild,root2->lchild) && hasMinTree(root2->rchild,root2->rchild);
}


































