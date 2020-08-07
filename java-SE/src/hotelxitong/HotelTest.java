package hotelxitong;

import java.util.*;

public class HotelTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------- 酒店管理系统 -------------------------------------------------");
        Hotel hotel = new Hotel();
        hotel.display();  //显示所有房间信息
        while(true)
        {           
            try
            {
                //订房
                System.out.println();
                System.out.print("请输入您想要入住的房间编号：");
                int no = sc.nextInt();
                if (hotel.getRoomOccupancy(no))
                {                   
                    System.out.println("该房间已经有人入住！请重新预定！");
                }else{
                    hotel.reserve(no);
                    hotel.display();
                }
                //退房
                System.out.println();
                System.out.print("请输入您想要退房的房间编号：");
                no = sc.nextInt();
                if (hotel.getRoomOccupancy(no))
                {                   
                    hotel.checkout(no);
                    hotel.display();
                }else{

                    System.out.println("该房间原本就无人入住！请重新输入！");
                }
            }
            catch (Exception e)
            {
                System.out.println("输入数据有误！请重新进入系统！"); return;
            }
        }
    }
}

