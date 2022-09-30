public class Taxi {

    static int counter = 0; //*****0이니까 아무데나 써도 되는가?
    int number; // 택시 번호
    int fuelAmount;//주유량
    int curSpeed;//현재 속도
    String destination; //목적지
    int basicDistance; //기본거리
    int totalDistance;//목적지까지 거리
    int basicCost;//기본요금
    int addCost;//거리당 요금
    int state;//상태 ( 운행전=-1 / 일반=0 / 운행중=1 )
    int maxP; //최대 승객수
    int curP;//현재 승객수

    //생성자
    public Taxi() {
        number = Taxi.counter++;
        maxP = 4;
        basicCost = 3000;
        addCost = 1000;
        basicDistance = 1;
        fuelAmount = 100;
        state = 0;
        curSpeed = 0;

        //운행전
        public void BeforeDrive() {state = -1;} //운행전
        public void General()     {state =  0;} //일반
        public void Driving()     {state =  1;} //운행중

        //운행 시작전 주유상태를 체크
        public void fuelCheckBefore (int fuel) {
            //운행시작전 시작전 and 주유량이 10 이상이어야 운행 가능
            if ( state == -1 && fuelAmount >= 10 ) state=1;
        }

        //택시가 '일반'상태일때만 승객탑승 가능
        public void checkGe









    }

}
