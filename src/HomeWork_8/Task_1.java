package HomeWork_8;

public class Task_1 {
    public static void main(String[] args) {

            int a = 3;
            int b = 56;

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(a).append("+").append(b).append("=").append(a + b).append("\n");
            stringBuilder.append(a).append("-").append(b).append("=").append(a - b).append("\n");
            System.out.println(stringBuilder.append(a).append("*").append(b).append("=").append(a * b));

            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.indexOf("=") != -1) {
                    stringBuilder.replace(stringBuilder.indexOf("="), stringBuilder.indexOf("=") + 1, " равно ");
                }
            }
            System.out.println(stringBuilder);
        }
    }


