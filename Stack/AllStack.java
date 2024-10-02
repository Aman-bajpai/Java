package Stack;

public class AllStack {
    static final int Max = 10;
    int top = -1;
    int a[] = new int[Max];
    boolean push(int x){
        if(top>=(Max-1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    }
    int pop(){
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x  = a[top--];
            return x;
        }
    }
    int peek(){
        if (top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }
    void print(){
        for (int i = top;i>-1;i--){
            System.out.print(" "+a[i]);
        }

    }

    public static void main(String[] args) {
        AllStack wo = new AllStack();
        wo.push(10);
        wo.push(13);
        wo.push(14);
        wo.push(72);
        wo.push(9);
        wo.print();
        wo.pop();
        wo.pop();
        wo.print();
        wo.peek();
    }
}
