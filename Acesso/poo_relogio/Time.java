public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    @Override 
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void next(){
        int totalSeconds =  hour * 3600 + minute * 60 + ++second;
        
        hour = (totalSeconds / 3600) == 24 ? 0 : totalSeconds / 3600;
        minute = totalSeconds % 3600;
        second = totalSeconds % 60; 
    }

    public void setHour(int hour) {
        if(hour > 23 || hour < 0){
            IO.write("fail: hora invalida");
            return;
        }
        this.hour = hour ;
    }

    public void setMinute(int minute) {
        if(minute > 59 || minute < 0){
            IO.write("fail: minuto invalido");
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if(second > 59 || second < 0){
            IO.write("fail: segundo invalido");
            return;
        }
        this.second = second;
    }
}
