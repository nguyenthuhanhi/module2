package bai4;

public class StopWatch {

        private long startTime;
        private long endTime;

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }
        StopWatch(){
            this.startTime =System.currentTimeMillis();
        }
        void start(){
            long a=System.currentTimeMillis();
            this.setStartTime(a);
        }
        void stop(){
            long b=System.currentTimeMillis();
            this.setEndTime(b);
        }
        long getElapsedTime(){
            long other=this.getEndTime()-this.getStartTime();
            return other;
        }
    }

