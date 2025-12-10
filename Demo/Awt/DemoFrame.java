import java.awt.*;
/*
class DemoFrame{
	Frame f;
	Button b;
	Label l;
	TextField tf;
	DemoFrame(String s)
	{
		f=new Frame(s);
		l=new Label("Enter the no.");
		l.setBounds(40,40,80,20);
		f.add(l);
		tf=new TextField();
		tf.setBounds(150,40,200,20);
		f.add(tf);
		b=new Button("ok");
		b.setBounds(40,100,50,50);
		f.add(b);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String s[])
	{
		new DemoFrame("first frame");
	}
}*/


class DemoFrame{
	Frame f; Button b[]; TextField tf;
	DemoFrame(String s)
	{
		String q[] = {"9","8","7","AC","6", "5", "4", "+", "3", "2", "1", "-", "0", "/", "*", "="};
	    b=new Button[q.length];
		
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(40,40,360,40);
		f.add(tf);
		
		int x=40, y=100 , w= 70 ,h=70 ;
		for(int i=0; i<q.length; i++){
		b[i]=new Button(q[i]);
		b[i].setBounds(x,y,w,h);
		f.add(b[i]);
		x=x+90;
		if((i+1)%4==0){
			x=40;
			y=y+90;
		
		}
		}
		f.setLayout(null);
		f.setSize(450,500);
		f.setVisible(true);
	}
	public static void main(String s[])
	{
		new DemoFrame("first frame");
	}
}