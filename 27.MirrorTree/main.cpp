void MirrorTree(BinTree *bt){
    if(bt == NULL){
        return ;
    }
    if(bt->lchild == NULL  && bt->rchild == NULL){
        return ;
    }

    BinTree *temp = bt->lchild;
    bt->lchild = bt->rchild;
    bt->rchild = bt->lchild;

    if(bt->lchild){
        MirrorTree(bt->lchild);
    }
    else if(bt->rchild){
        MirrorTree(bt->rchild);
    }
}
