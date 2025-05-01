public class Main{
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        Appointmentbook a = new Appointmentbook(schedule);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        a.printPeriod(2);
        a.findFreeBlock(2, 15);
        for(int i =25; i <30; i++) schedule[1][i] = true;
        for(int i =0; i <15; i++) schedule[2][i] = true;
        for(int i =41; i <60; i++) schedule[2][i] = true;
        for(int i =5; i <30; i++) schedule[3][i] = true;
        for(int i =44; i <60; i++) schedule[3][i] = true;
        
        Appointmentbook b = new Appointmentbook(schedule);
        int period = 2;
        while(period < 5)
        {
            System.out.println("Period: " + period);
            b.printPeriod(period);
            period++;
        }
        b.printPeriod(4);
        System.out.println(b.makeAppointment(2, 4, 22));
        b.printPeriod(4);
    }    
}

