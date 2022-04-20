package ibm;

class IE{
    int x,y,z,max = 0;
    IE(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void compare(){
        if(x>y & x>z){
            max = x;
        }
        else{
            if(y>x & y>z)
                max = y;
            else
                max = z;
        }
        System.out.println(max);
    }
}
class Te{
    int x,y,z;
    Te(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void compare(){
        int max = (x>y & x>z)? x : ((y>x & y>z) ? y : z);
        System.out.println(max);
    }
}
public class max{
    public static void main(String[] args) {
        IE obj1 = new IE(17,5,3);
        obj1.compare();
        Te obj2 = new Te(17,5,3);
        obj2.compare();
    }
}