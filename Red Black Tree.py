#Red Black Tree
class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        self.parent=None
        self.color='r'
class RB:
    def __init__(self):
        self.root=None
        self.ll=False
        self.lr=False
        self.rl=False
        self.rr=False
    def inserthelp(self,root,data):
        flag=False
        if(root==None):
            return Node(data)
        elif(data<root.data):
            root.left=ob.inserthelp(root.left,data)
            root.left.parent=root
            if(root!=self.root):
                if(root.color=='r' and root.left.color=='r'):
                    flag=True
        elif(data>root.data):
            root.right=ob.inserthelp(root.right,data)
            root.right.parent=root
            if(root!=self.root):
                if(root.color=='r' and root.right.color=='r'):
                    flag=True
        if(self.ll==True):
            root=ob.rightrotate(root)
            root.color='b'
            root.right.color='r'
            self.ll=False
        if(self.rr==True):
            root=ob.leftrotate(root)
            root.color='b'
            root.left.color='r'
            self.rr=False
        if(self.lr==True):
            root.left=ob.leftrotate(root.left)
            root.left.parent=root
            root=ob.rightrotate(root)
            root.color='b'
            root.right.color='r'
            self.lr=False
        if(self.rl==True):
            root.right=ob.rightrotate(root.left)
            root.right.parent=root
            root=ob.leftrotate(root)
            root.color='b'
            root.left.color='r'
            self.lr=False
        if(flag==True):
            if(root.parent.left==None or \
            root.parent.left.color=='b'):
                if(root.right!=None and root.right.color=='r'):
                    self.rr=True
                elif(root.left!=None and root.left.color=='r'):
                    self.rl=True
            if(root.parent.right==None or \
            root.parent.right.color=='b'):
                if(root.left!=None and root.left.color=='r'):
                    self.ll=True
                elif(root.right!=None and root.right.color=='r'):
                    self.lr=True
            if(root.parent.left=='r'):
                root.color='b'
                root.parent.left='b'
                if(root.parent!=self.root):
                    root.parent.color='r'
            if(root.parent.right=='r'):
                root.color='b'
                root.parent.right='b'
                if(root.parent!=self.root):
                    root.parent.color='r'
            flag=False
        return root
    def leftrotate(self,root):
        t1=root.right
        t2=t1.left
        root.right=t2
        t1.left=root
        root.parent=t1
        if(t2!=None):
            t2.parent=root
        return t1
    def rightrotate(self,root):
        t1=root.left
        t2=t1.right
        root.left=t2
        t1.right=root
        root.parent=t1
        if(t2!=None):
            t2.parent=root
        return t1
    def insert(self,data):
        if(self.root==None):
            self.root=Node(data)
            self.root.color='b'
        else:
            self.root=ob.inserthelp(self.root,data)
    def level(self):
        root=self.root
        h=ob.height(root)+1
        for i in range(1,h):
            for j in range(i,h):
                print(" ",end="")
            ob.helper(root,i)
            print()
    def helper(self,root,l):
        if(root==None):
            return
        if(l==1):
            print(root.data,end=" ")
        else:
            ob.helper(root.left,l-1)
            ob.helper(root.right,l-1)
    def height(self,root):
        if(root==None):
            return 0
        else:
            return max(1+ob.height(root.left),1+ob.height(root.right))
ob=RB()
ob.insert(5)
ob.insert(3)
ob.insert(4)
ob.level()