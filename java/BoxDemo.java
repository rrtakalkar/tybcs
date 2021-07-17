class Box{
    double width;
    double height;
    double depth;
    //This is the constructor of Box
    Box(){
        System.out.println("Constructing Box");
        width=10;
        height=10;
        depth=10;
    }
    double Volume(){
        return width*height*depth;
    }
}
class BoxDemo{
    public static  void main(String[] args){
        Box myBox1=new Box();
        Box myBox2=new Box();
        double vol;
        vol=myBox1.Volume();
        System.out.println("Volume is"+vol);
        vol=myBox2.Volume();
        System.out.println("Volume is"+vol);
    }
}