package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
        
        //phone으로부터 상속받은 필드 읽기
        System.out.println("myPhone.model = " + myPhone.model);
        System.out.println("myPhone.color = " + myPhone.color);

        //SmartPhone의 필드 읽기
        System.out.println("와이파이 상태 : " + myPhone.wifi);

        //phone으로부터 상속받은 메서드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동");
        myPhone.sendVoice("아~ 네 반갑!");
        myPhone.hangUp();


    }
}
