import java.awt.*;
class DemoFrameCalculator {
    Frame f;Label l;TextField tf;Button b[];
    DemoFrameCalculator(String s){
	String q[] = {"9","8","7","AC","6", "5", "4", "+", "3", "2", "1", "-", "0", "/", "*", "="};
	b=new Button[q.length];
        f = new Frame(s);
        tf = new TextField();
        tf.setBounds(40,40,360,40);
        f.add(tf);
        int x=40, y=100 , w= 70 ,h=70 ;
        for (int i=0; i<q.length; i++){
            b[i]= new Button(q[i]); 
            b[i].setBounds(x,y,w,h);
            f.add(b[i]);
            x=x+90;
            if ((i+1)%4==0){
                x=40;
                y=y+90;
            }
        }
        f.setBounds(500, 250, 450, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String... str){
        new DemoFrameCalculator("First Frame");
    }
}