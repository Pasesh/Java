package practice_5_hw1.task8;

public class Museum {
    private Exhibit exhibit;

   void setExhibit(Exhibit exhibit){
       this.exhibit = exhibit;
       System.out.println("Экспонат добавлен");
   }

   void showExhibit(){
       if(this.exhibit == null){
           System.out.println("В музее пока нет экспанатов");
           return;
       }
       exhibit.describe();
       exhibit.preserve();
   }
}
