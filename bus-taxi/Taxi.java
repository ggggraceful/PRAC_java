import java.sql.SQLOutput;

public class Taxi {

    static int counter = 0; //*****0이니까 아무데나 써도 되는가?
    int number; // 택시 번호
    int fuelAmount;//주유량
    int curSpeed;//현재 속도
    String destination; //목적지
    int basicDistance; //기본거리
    int totalDistance;//목적지까지 거리
    int basicCost; //기본요금
    int addCost; //거리당 요금
    int totalcost; //최종 요금
    int state; //상태 ( 운행전=-1 / 일반=0 / 운행중=1 )
    int maxP; //최대 승객수
    int curP; //현재 승객수
    int remainP; //++남은 자리


    //생성자
    public Taxi() {
        number = Taxi.counter++;//중복되지 않는 택시번호
        maxP = 4; //최대 승객수
        basicCost = 3000; //기본 요금
        addCost = 1000; //거리당 요금
        basicDistance = 1; //기본 거리
        fuelAmount = 100; //주유량
        state = 0; // 상태=일반
        curSpeed = 0; // 속도
        curP = 0; //++현재 승객수
    }

        //운행불가
        public void noDrive(){
            state = -2;
            System.out.println("상태 = 운행불가");
        }
        //운행전
        public void beforeDrive(){state = -1; }
        //일반
        public void general(){
            state =  0;
            System.out.println("상태 = 일반");
        }
        //운행중
        public void driving(){
            state =  1;
            System.out.println("상태 =운행중");
        }

        //운행 시작전 주유상태를 체크
        public void fuelCheckBefore() {
            //운행시작전 시작전 and 주유량이 10 이상이어야 운행 가능
            if ( state == -1 && fuelAmount >= 10 ) state=1;
        }

        //택시가 '일반'상태일때만 승객탑승 가능
        public void checkGeneral() {
            if(state != 0){
                System.out.println("탑승불가");
            } else if(state == 0) {
                System.out.println("운행 중");
            }
        }

        //속도변경 +,- 가능
        public void checkSpeed(int changeSpeed) {
            curSpeed = curSpeed + changeSpeed;
        }

        //요금결제: 최종 요금 출력 = 기본요금 + 거리당 추가요금
        public int pay() {
            //기본거리 < 목적지(더 멀다면) : +추가요금
            if (basicDistance < totalDistance) {
                // 총요금 = 기본요금 3000/km + 추가요금*(거리-1)
                totalcost = 3000 + 1000*(totalDistance-1);
            }
            return pay();
        }
        //i명이 탑승했을 대 i명이 늘어난다.
        public void curP(int plusP) {
            curP = curP + plusP;
        }

        //잔여승객수 확인
        public int remainP() {
             remainP = maxP - curP;

             if(remainP > 5) {
                 int curP = 0;
                 System.out.printf("최대 승객 수 초과");
             }
             return remainP;
        }

        //주유량 변경
        //n만큼 주유했을때 현재 주유량이 n만큼 증가한다.
        public void checkFuel(int fuel) {
            fuelAmount = fuelAmount + fuel;
        }

        // 기름 상태 체크
        public void fuelStateCheck() {

            // 기름이 떨어진 경우
            if (this.fuelAmount <= 0) noDrive();
                // 기름이 10 미만인 경우
            else if (this.fuelAmount < 10) {
                System.out.println("주유 필요");
                noDrive();
            }
        }

        //목적지까지 거리(총 거리) = 목적지까지 거리 + 기본거리


    //***위 요소에 적지 않은 totalCost
        //***필요시 위에 추가? or 이 안에 추가?
        //*** 이 안에서는 새로운 변수를 지정할 수 없는가?



//        Taxi taxi1 = new Taxi();
//        Taxi taxi2 = new Taxi();

        //택시번호 다른지 확인
//        public void checkNumber() {
//            if (taxi1.number != taxi2.number){
//                System.out.println("택시 번호가 다릅니다.");
//            }
//        }
        //*** System.out.println(checkNumber); 에러
}































