public class NextDayCalculator {
    public static String check(int day, int month , int year){
        return switch (month) {
            case 1, 3, 5, 8, 10, 12 -> checkMonth31day(day, month, year);
            case 4, 6, 7, 9, 11 -> checkMonth30day(day, month, year);
            case 2 -> checkYear(day, month, year);
            default -> "";
        };
    }
    public static String checkYear(int day , int month , int year){
        if (year%4 == 0 && year%100==0 && year%400==0){
            return checkMonth29day(day,month,year);
        }else {
            return checkMonth28day(day,month,year);
        }
    }
    public static String checkMonth31day(int day , int month , int year){
        if (day>0 && day<31){
            return (day+1) + "/" + month + "/" + year;
        }else {
            day = 1;
            month += 1;
            return day + "/" + month + "/" + year;
        }
    }
    public static String checkMonth30day(int day , int month , int year){
        if (day>0 && day<30){
            return (day+1) + "/" + month + "/" + year;
        }else {
            day = 1;
            month += 1;
            return day + "/" + month + "/" + year;
        }
    }
    public static String checkMonth28day(int day , int month , int year){
        if (day>0 && day<28){
            return (day+1) + "/" + month + "/" + year;
        }else {
            day = 1;
            month += 1;
            return day + "/" + month + "/" + year;
        }
    }
    public static String checkMonth29day(int day , int month , int year){
        if (day>0 && day<29){
            return (day+1) + "/" + month + "/" + year;
        }else {
            day = 1;
            month += 1;
            return day + "/" + month + "/" + year;
        }
    }
}
