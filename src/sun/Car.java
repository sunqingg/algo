//package sun;
//
//public class Car {
//    int speed;
//    String color;
//    String name;
//    String direction;
//    boolean isTrafficAdmin;
//    public Car() {
//        this("Java护航者","咖啡豆色");
//    }
//    public Car(String p_name,String p_color) {
//        this.name = p_name;
//        this.color = p_color;
//    }
//    public void drivecar() {
//        speed = 50;
//        direction = "南方";
//    }
//    public void raiseSpeed(int p_speed) {
//        if (p_speed <0) {
//            System.out.println("p_speed的值小于0，raiseSpeed（）方法将结束");
//            return;
//        }
//        int currentSpeed = speed + p_speed;
//        speed = currentSpeed;
//    }
//    public void raiseSpeed(byte p_speed) {
//        if (p_speed < 0) {
//            System.out.println("p_speed的值小于0，raiseSpeed（）方法将结束");
//            return;
//        }
//        int currentSpeed = speed + p_speed;
//        speed = currentSpeed;
//    }
//    public void setSpeedAndDirection(int p_speed,String p_direction) {
//        speed = p_speed;
//        direction = p_direction;
//    }
//    public boolean isOverspeed() {
//        if (speed > 80) {
//            return true;
//        }
//        else {return false;}
//    }
//    public void overtakeCar(Car anotherCar) {
//        speed = anotherCar.speed + 5;
//        direction =anotherCar.direction;
//    }
//    public void setNameForAnotherCar(Car anotherCar,String newName) {
//        if (!isTrafficAdmin) {
//            System.out.println("你不是交通管理员，无权调用此方法");
//            return;
//        }
//        anotherCar.name = newName;
//    }
//    public void stopAnotherCar(Car anotherCar) {
//        if (!isTrafficAdmin) {
//            System.out.println("你不是交通管理员，无权调用此方法");
//            return;
//        }
//        anotherCar.speed = 0;
//    }
//    public CarStatus get
//
//}
