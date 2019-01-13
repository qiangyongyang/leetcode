BinTreeNode *getNext(BinTreeNode *pNode){
    if(pNode==NULL){
        return NULL;
    }

    BinTreeNode *pNext=NULL;
    if(pNode->rchild!=NULL){
        BinTreeNode *pRight=pNode->rchild;
        while(pRight!=NULL){
            pRight=pRight->lchild;
        }
        pNext=pRight;
    }
    else if(pNode->parent!=NULL){
        BinTreeNode *current=pNode;
        BinTreeNode *pParent=pNode->parent;
        while(pParent!=NULL && current==pParent->rchild){
            current=pParent;
            pParent=pParent->parent;
        }
        pNext=pParent;
    }
    return pNext;
}
