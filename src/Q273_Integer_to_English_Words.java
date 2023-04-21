public class Q273_Integer_to_English_Words {
}
/*
class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        StringBuilder sb = new StringBuilder();
        if(num >= 1000000000){
            int n = num / 1000000000;
            sb.append(numberToWordsUnderHundred(n));
            sb.append(" Billion");
            num %= 1000000000;
        }
        if(num >= 1000000){
            int n = num / 1000000;
            sb.append(" ");
            sb.append(numberToWordsUnderHundred(n));
            sb.append(" Million");
            num %= 1000000;
        }
        if(num >= 1000){
            int n = num / 1000;
            sb.append(" ");
            sb.append(numberToWordsUnderHundred(n));
            sb.append(" Thousand");
            num %= 1000;
        }
        if(num > 0){
            sb.append(" ");
            sb.append(numberToWordsUnderHundred(num));
        }
        return sb.toString().trim();
    }

    public String numberToWordsUnderHundred(int num){
        String[] str1 = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] str2 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] str3 = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        StringBuilder sb = new StringBuilder();
        int flag = 0;
        if(num >= 100 && num <= 999){
            flag = 1;
            int size3 = num / 100;
            sb.append(str1[size3]);
            sb.append(" Hundred");
            num %= 100;
        }
        if(num >= 20 && num <= 99){
            if(num % 10 == 0){
                sb.append(" ");
                num /= 10;
                sb.append(str3[num - 2]);
                num = 0;
            }else{
                int size2 = num / 10;
                sb.append(" ");
                sb.append(str3[size2 - 2]);
                num %= 10;
                if(num >= 1 && num <= 9){
                    sb.append(" ");
                    sb.append(str1[num]);
                    num = 0;
                }
            }
        }
        if(num >= 10 && num <= 19){
            sb.append(" ");
            num %= 10;
            sb.append(str2[num]);
            num = 0;
        }
        if(num > 0 && num <= 9){
            sb.append(" ");
            sb.append(str1[num]);
        }
        return sb.toString().trim();
    }
}*/
