import java.util.*;
import java.io.*;
class Meeting implements Comparable<Meeting>
{
    public int startTime;
    public int endTime;
    public Meeting(int startTime,int endTime)
    {
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public int getStartTime()
    {
        return startTime;
    }
    public int getEndTime()
    {
        return endTime;
    }
    public void setStartTime(int startTime)
    {
        this.startTime=startTime;
    }
    public void setEndTime(int endTime)
    {
        this.endTime=endTime;
    }
    public int compareTo(Meeting m)
    {
     if(this.startTime>m.startTime)
     {
        return 1;
     }
     else if(this.startTime==m.startTime)
     {
         return 0;
     }
     else
     {
         return -1;
     }
    }

    @Override
    public String toString() {
        return "("+getStartTime()+","+getEndTime()+")";
    }
}
public class Solution4 {
    public ArrayList<Meeting> mergeMeeting(ArrayList<Meeting> al)
    {
        ArrayList<Meeting> result=new ArrayList<>();
        for(int i=0;i<al.size()-1;i++)
        {
            if(al.get(i).getEndTime()>=al.get(i+1).getStartTime())
            {

                int maxi=Math.max(al.get(i).getEndTime(),al.get(i+1).getEndTime());
                al.get(i+1).setStartTime(al.get(i).getStartTime());
                al.get(i+1).setEndTime(maxi);

                al.get(i).setStartTime(Integer.MIN_VALUE);
                al.get(i).setEndTime(Integer.MIN_VALUE);
            }
        }
        for (int i =0; i<al.size(); i++) {
            if(al.get(i).getStartTime()!=Integer.MIN_VALUE){
                result.add(new Meeting( al.get(i).getStartTime(),al.get(i).getEndTime() ));
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        ArrayList<Meeting> al=new ArrayList<>();
        al.add(new Meeting(1,10));
        al.add(new Meeting(2,6));
        al.add(new Meeting(3,5));
        al.add(new Meeting(7,9));

        Collections.sort(al);
        MergingMeetTimes mt=new MergingMeetTimes();
        System.out.println(mt.mergeMeeting(al));

    }
}