package hotelxitong;

public class Hotel
{
    Room[][] rooms;

    public Hotel(){
        rooms = new Room[5][9];  //默认创建5层楼，每层9个房间
        //给所有房间编号
        for (int i = 0; i < rooms.length; i++)
        {
            for (int j = 0; j < rooms[i].length; j++)
            {
                /*
                    房间分布设置：1楼、2楼为标准间，3楼为单人间，4楼为情侣间，5楼为豪华间
                */
                if (i == 0 || i == 1)
                {					//调用了有参构造方法
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", false);
                }else if (i == 2)
                {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", false);
                }else if (i == 3)
                {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "情侣间", false);
                }else if (i == 4)
                {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "豪华间", false);
                }

            }
        }
    }

    //显示所有房间信息
    public void display()
    {
        for (int i = 0; i < rooms.length; i++)
        {
            for (int j = 0; j < rooms[i].length; j++)
            {
                if (j % 3 == 0)
                {
                    System.out.println(); //每行显示三个房间的信息
                }
                System.out.print(rooms[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //订房
    public void reserve(int no)
    {
        for (int i = 0; i < rooms.length; i++)
        {
            for (int j = 0; j < rooms[i].length; j++)
            {
                if (rooms[i][j].getNo() == no)
                {
                    rooms[i][j].setOccupancy(true); 
                    System.out.println("订房成功！您预定的房间编号为：" + no);
                    return;
                }
            }
        }
    }

    //退房
    public void checkout(int no)
    {
        for (int i = 0; i < rooms.length; i++)
        {
            for (int j = 0; j < rooms[i].length; j++)
            {
                if (rooms[i][j].getNo() == no)
                {
                    rooms[i][j].setOccupancy(false); 
                    System.out.println("您已成功退掉[" + no + "]房间!");
                    return;
                }
            }
        }
    }

    //根据房间编号，获取房间的占用情况occupancy
    public boolean getRoomOccupancy(int no)
    {
        for (int i = 0; i < rooms.length; i++)
        {
            for (int j = 0; j < rooms[i].length; j++)
            {
                if (rooms[i][j].getNo() == no)
                {
                    return rooms[i][j].getOccupancy();
                }
            }
        }
        return false;
    }
}
