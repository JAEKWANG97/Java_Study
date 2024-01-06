package exam.no7;

public class Chatting {
    class Chat {
        void start() {

        }

        void sendMessage(String message) {

        }
    }

    void startChar(String chatId){
        String nickName = chatId;
        Chat chat = new Chat(){
            @Override
            void start() {
                while(true){
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
