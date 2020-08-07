package tuxingjianmian.window;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import static javax.swing.JFrame.*;
public class Windowcreat {

	public static void main(String[] args) {
		JFrame jf1=new JFrame("杨宁");
		JFrame jf2=new JFrame("哈哈");
		jf1.setBounds(680, 330, 550, 420);
		jf2.setBounds(50, 50, 300, 300);
		jf1.setVisible(true);
		//jf1.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //隐藏窗口并释放资源
		//jf1.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//什么也不做
		jf1.setDefaultCloseOperation(HIDE_ON_CLOSE); //隐藏当前窗口；
		//jf2.setVisible(true);
		//jf2.setDefaultCloseOperation(EXIT_ON_CLOSE); //退出程序
		JMenuBar mb=new JMenuBar();
		jf1.setJMenuBar(mb); //将菜单添加到窗口
		JMenu mu=new JMenu("菜单"); //创建菜单；
		mb.add(mu);
		JMenu jt1=new JMenu("身高");
		mb.add(jt1);
		JMenuItem jt2=new JMenuItem("体重");
		JMenuItem jt3=new JMenuItem("颜值");
		mu.add(jt2);
		mu.add(jt3);
		JMenuItem jt4=new JMenuItem("170");
		jt1.add(jt4);
	}

}
