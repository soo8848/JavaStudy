/** ����� */
/** �䱸����: �Է°��� ��(inputMonth)�� �޾Ƽ� �ش� ���� ������ ��¥(lastDay)�� ����Ѵ�. */
public class DayMonthTest {
    public static void main(String[] args) {
        
        // ����
        int year = 2025;
        // Ȯ���� ��
        int inputMonth = 6;
        // ������ ��¥ ���� ����
        int lastDay = 0;
        
        /*
         * [2���� ���]
         * �����̸� 29��, ����̸� 28�Ϸ� �����Ѵ�.
         * ���� ���� ����:
         * - year % 4 == 0  : 4�� ��� ��
         * - year % 100 != 0 : 100�� ��� �ش� ����
         * - year % 400 == 0 : 400�� ��� �ش� �ٽ� ����
         */
        if (inputMonth == 2) {
            lastDay = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
        } 
        /*
         * [31���� ���� ����]
         * - 8�� ��: Ȧ�� �� �� 1, 3, 5, 7
         * - 8�� ����: ¦�� �� �� 8, 10, 12
         */
        else if ((inputMonth < 8 && inputMonth % 2 == 1) || (inputMonth >= 8 && inputMonth % 2 == 0)) {
            lastDay = 31;
        } 
        /*
         * [������ ���] �� 30���� ��
         * 4, 6, 9, 11��
         */
        else {
            lastDay = 30;
        }
        
        // ��� ���
        System.out.println(year + "�� " + inputMonth + "�� " + lastDay + "�ϱ����Դϴ�.");
    }
}
