class Solution {
    public String intToRoman(int num) {
        String str=convertToRoman(num);
        return str;
        
    }
    private String convertToRoman(int n){
        if(n==0){
            return "";
        }
        if(n>=1000){
            return "M"+ convertToRoman(n-1000);
        }else if(n>=900){
            return "CM"+convertToRoman(n-900);
        }else if(n>=500){
            return "D"+convertToRoman(n-500);
        }else if(n>=400){
            return "CD"+convertToRoman(n-400);
        }else if(n>=100){
            return "C"+convertToRoman(n-100);
        }else if(n>=90){
            return "XC"+convertToRoman(n-90);
        }else if(n>=50){
            return "L"+convertToRoman(n-50);
        }else if(n>=40){
            return "XL"+convertToRoman(n-40);
        }else if(n>=10){
            return "X"+convertToRoman(n-10);
        }else if(n>=9){
            return "IX"+convertToRoman(n-9);
        }else if(n>=5){
            return "V"+convertToRoman(n-5);
        }else if(n>=4){
            return "IV"+convertToRoman(n-4);
        }else{
            return "I"+convertToRoman(n-1);
        }
    }
}