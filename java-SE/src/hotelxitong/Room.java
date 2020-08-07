package hotelxitong;

public class Room
{
    private int no;		//房号
    private String type;		//类型
    private boolean occupancy;	//是否空闲

    public Room(int no, String type, boolean occupancy)
    {
        this.no = no;
        this.type = type;
        this.occupancy = occupancy;
    }

    //重写toString()——按照规定格式输出房间信息
    public String toString()
    {
        String str = occupancy ? "占用" : "空闲";//如果str为真则执行“占用”，否则执行“空闲”；
        return "[no=" + no + "，房型=" + type + "，状态=" + str + "]";
    }

    //setter/getter
    public int getNo(){ return no;}
    public void setNo(int no){ this.no = no;}
    public String getType(){ return type;}
    public void setType(String type){ this.type = type;}
    public boolean getOccupancy(){ return occupancy;}
    public void setOccupancy(boolean occupancy){ this.occupancy = occupancy;}
}
