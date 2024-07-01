package Main;

public class ValidateAnIPAddress {
    public boolean isValid(String s) {
        int count=0;
        String arr[]=s.split("\\.");
        if(arr.length!=4)
            return false;
        if(s.startsWith(".")||s.endsWith("."))
            return false;
        for(String str :arr){
            if(str.length()>3||(str.length()>1&&str.charAt(0) == '0'))
                return false;
            try{
                int val = Integer.valueOf(str);
                if(!(val>=0&&val<=255)){
                    return false;
                }
            }catch(NumberFormatException e){
                return false;
            }

        }
        return true;
    }
}
