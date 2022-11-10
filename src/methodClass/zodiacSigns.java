package methodClass;

public class zodiacSigns {

   public int day, month;
    String a;

   public String getA() { if (day>=20 & day<=31 & month==1 | day>=1 & day<=18 & month==2){
        a = "Водолей";
    } else if(day>=19 & day<=29 & month==2 | day>=1 & day<=20 & month==3){
        a = "Рыбы";
    } else if (day>=21 & day<=31 & month==3 | day>=1 & day<=19 & month==4) {
        a = "Овен";
    } else if (day>=20 & day<=30 & month==4 | day>=1 & day<=20 & month==5) {
        a = "Телец";
    }else if (day>=21 & day<=31 & month==5 | day>=1 & day<=21 & month==6) {
        a = "Близнецы";
    }else if (day>=22 & day<=31 & month==6 | day>=1 & day<=22 & month==7) {
        a = "Рак";
    }else if (day>=23 & day<=30 & month==7 | day>=1 & day<=22 & month==8) {
        a = "Лев";
    }else if (day>=23 & day<=31 & month==8 | day>=1 & day<=22 & month==9) {
        a = "Дева";
    }else if (day>=23 & day<=30 & month==9 | day>=1 & day<=22 & month==10) {
        a = "Весы";
    }else if (day>=23 & day<=31 & month==10 | day>=1 & day<=22 & month==11) {
        a = "Скорпион";
    }else if (day>=23 & day<=31 & month==11 | day>=1 & day<=21 & month==12) {
        a = "Стрелец";
    }else if (day>=23 & day<=31 & month==12 | day>=1 & day<=19 & month==1) {
        a = "Козерог";
    } else {
        a = "Не верные данные";
    }
    return a;
   }
}
