    import java.util.*;

    class Rectangle{
        private int length;
        protected int width;

        Rectangle(){}

        //setter
        public Rectangle(int length){
            this.length = length;
        }   
        //getter
        public int getLength(){
            return length;
        }

        Rectangle(int length,int width){
            this.length = length;
            this.width = width;
        }

        void perimeter(){
            int per = 2*(length+width);
            System.out.println("Perimeter: "+per);
        }

        void area(){
            int area = length*width;
            System.out.println("Area: "+area);
        }
    }

    class _3dRectangle extends Rectangle{
        protected int height;
        _3dRectangle(){}

        _3dRectangle(int getLength,int width,int height){
            super(getLength,width);
            this.height = height;
        }

        @Override
        void area(){
            int length = getLength();
            int area = length*height*width;
            System.out.println("Area: "+area);
        }
    }

    class Main{
        public static void main(String[] args){
            _3dRectangle r = new _3dRectangle(20,30,40);
            r.perimeter();
            r.area();
        }

    }
    
    

