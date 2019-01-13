bool isSymmetrical(BinTree *bt){
    return isSymmetrical(bt,bt);
}



bool isSame(BinTree *root1,BinTree *root2){
    if(root1 == NULL && root2 == NULL){
        return true;
    }
    if(root1 == NULL || root2 == NULL){
        return false;
    }
    if(root1->data != root2->data){
        return false;
    }

    return isSame(root1->lchild,root2->rchild) && isSame(root1->rchild,root2->lchild);
}
