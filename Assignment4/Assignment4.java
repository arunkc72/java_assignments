import java.awt.*;

class Assignment4 extends Frame{
	Assignment4()
	{
		setSize(600,600);
		setVisible(true);
		setBackground(Color.WHITE);
	}
	public void paint(Graphics g){
		g.setColor(new Color(20,42,42));
		int x[]={100,300,500};
		int y[]={200,100,200};
		g.fillPolygon(x,y,3);
		g.setColor(Color.YELLOW);
		g.fillRect(130,200,340,200);
		g.setColor(Color.RED);
		g.drawRect(249,240,102,60);
		g.drawLine(283,240,283,300);
		g.drawLine(351,240,351,300);
		g.drawLine(317,240,317,300);
	}
	public static void main(String[] args) {
		new Assignment4();
	}
}