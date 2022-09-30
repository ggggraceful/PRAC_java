public class TaxiMain {
    public static void main(String[] args) {

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        //각 택시 번호가 다른지 확인
//        System.out.println(checkNumber);
        System.out.println(taxi1.number);
        //주유량 =100
        System.out.printf("주유량 = " + taxi1.fuelAmount);
        //상태 = 일반(기본값)
        System.out.println("상태 = " + taxi1.state);
        System.out.println("----------------------------");

        taxi1.curP(2);
        taxi1.driving();
        System.out.printf("탑승 승객 수 = " + taxi1.curP);
        System.out.printf("잔여 승객 수 = " + taxi1.remainP);
        System.out.printf("기본 요금 확인 = " + taxi1.basicCost);
        System.out.printf("목적지 = " + "서울역");
        System.out.printf("목적지까지 거리 = " + taxi1.totalDistance);
        System.out.printf("지불할 요금 = " + taxi1.totalcost);
        System.out.println(taxi1.state);
        System.out.println("----------------------------");

        taxi1.checkFuel(-80);
        // (택시 : 요금결제)
        System.out.printf("주유량 = " +taxi1.fuelAmount);
        System.out.println("누적 요금 = " + taxi1.totalcost);
        System.out.println("----------------------------");

        taxi1.curP(5);
        //(알럿: '최대 승객 수 초과')
        //curP 0으로 리셋 필요
        System.out.printf("탑승 승객 수 = " +taxi1.curP);
        System.out.printf("잔여 승객 수 = " +taxi1.remainP);
        System.out.printf("기본 요금 확인 = " +taxi1.basicCost);
        System.out.printf("목적지 = " + "구로디지털단지역");
        System.out.printf("목적지까지 거리 = " +taxi1);
        System.out.printf("지불할 요금" +taxi1.totalcost);
        System.out.println("----------------------------");


        taxi1.checkFuel(-80);
        // (택시 : 요금결제)
        taxi1.noDrive();
        System.out.printf("주유량 = " +taxi1.fuelAmount); // =0
        System.out.println(taxi1.state); // 운행불가
        System.out.printf("누적 요금 = " +taxi1);
//      알럿 : 주유 필요
        System.out.println("----------------------------");
    }
}
