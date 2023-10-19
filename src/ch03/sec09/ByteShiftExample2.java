package ch03.sec09;

public class ByteShiftExample2 {
    public static void main(String[] args) {
        int value = 772; // [00000000] [00000000] [00000011] [00000100]

        //우측으로 3byte 이동 하고 끝 1바이트만 읽음 : [00000000]
        byte byte1 = (byte) (value >>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫번째바이트 부호 없는 값= " + int1);
        byte byte2 = (byte) (value >>> 16);
        int int2 = byte2 & 255;
        System.out.println("두번째바이트 부호 없는 값= " + int2);
        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println("첫번째바이트 부호 없는 값= " + int3);

        // 끝 1바이트만 읽음
        byte byte4 = (byte) value;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네번째 바이트 부호 없는 값 = " + int4);
    }
}
