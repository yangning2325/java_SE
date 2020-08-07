package tuxingjianmian.window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
public Login(){
		
		this.setTitle("登陆窗体");
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		//告诉窗体，我自己指定控件的位置
		this.setLayout(null);//绝对布局
		//创建一个文字标签类
		JLabel titlelab=new JLabel();
		titlelab.setText("QQ登陆框");
		titlelab.setBounds(160,30,80,20);
		this.add(titlelab);

		//创建一个用户名的label
		JLabel userlab=new JLabel();
		userlab.setText("用户名");
		userlab.setBounds(60,80,50,20);
		this.add(userlab);
		//创建用户文本框
		JTextField txtusername=new JTextField();
		txtusername.setBounds(140,80,120,20);
		this.add(txtusername);
		//创建密码label
		JLabel passlab=new JLabel();
		passlab.setText("密码");
		passlab.setBounds(60,120,50,20);
		this.add(passlab);
		//密码框
		JPasswordField txtuserpass=new JPasswordField();
		txtuserpass.setBounds(140,120,120,20);
		this.add(txtuserpass);
		//提交按钮
		JButton btnlogin=new JButton();
		btnlogin.setText("登陆");
		btnlogin.setBounds(120,170,80,30);
		this.add(btnlogin);
		//添加事件
		//匿名内部类
		//给按钮添加事件监听
		btnlogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				//获取用户名的内容
				String username=txtusername.getText();
				//获取密码内容
				String userpass=txtuserpass.getText();
				if(username.equals("admin")&&userpass.equals("123456")){
					JOptionPane.showMessageDialog(null,"恭喜，登陆成功");
				}else{
					JOptionPane.showMessageDialog(null,"登陆失败");	
				}
			}
		});
		
		//重置按钮
		JButton btnreset=new JButton();
		btnreset.setText("重置");
		btnreset.setBounds(220,170,80,30);
		this.add(btnreset);
		btnreset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				//JOptionPane.showMessageDialog(null,"重置按钮");
				txtusername.setText("");
				txtuserpass.setText("");
			}
		});
		
	}
	public static void main(String []args){
		//          new 后面调用的就是构造方法
		Login login=new Login();
		login.setVisible(true);

	}


}
