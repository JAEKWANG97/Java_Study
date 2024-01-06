package ch16.sec02.exma02;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();

        //ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnOk.setClickListener(()->{
            System.out.println("Ok 버튼을 클릭했습니다.");
        });

        btnOk.click();
    }
}
