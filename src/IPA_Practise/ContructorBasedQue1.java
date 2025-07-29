package IPA_Practise;

import java.util.Scanner;

public class ContructorBasedQue1 {
    public static class Projector {
        int projectorId;
        String projectorName;
        int price;
        int rating;
        String availableIn;
        Projector(){
            this.rating=0;
            this.projectorName=null;
            this.projectorId=0;
            this.price=0;
            this.availableIn=null;
        }
        Projector(int id,String pName,int p,int r,String availableIn){
            this.projectorId=id;
            this.projectorName=pName;
            this.price=p;
            this.rating=r;
            this.availableIn=availableIn;
        }
        public int getProjectorId() {
            return projectorId;
        }

        public void setProjectorId(int projectorId) {
            this.projectorId = projectorId;
        }

        public String getProjectorName() {
            return projectorName;
        }

        public void setProjectorName(String projectorName) {
            this.projectorName = projectorName;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getAvailableIn() {
            return availableIn;
        }

        public void setAvailableIn(String availableIn) {
            this.availableIn = availableIn;
        }
    }
    public static Projector findMaximumPriceByRating(Projector[] arr, int rating){
        int price=Integer.MIN_VALUE;
        Projector ans=null;
        for(Projector projector:arr){
            if(projector.getAvailableIn().equalsIgnoreCase("TataCliq")&&projector.getRating()>rating){
                if(projector.getPrice()>price){
                    ans=new Projector(projector.getProjectorId(),projector.getProjectorName(),projector.getPrice(), projector.rating, projector.availableIn);
                }
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
     Scanner sn=new Scanner(System.in);
     int n=sn.nextInt();

     Projector[] arr=new Projector[n];
     for(int i=0;i<n;i++){
         int ID=sn.nextInt();
         sn.nextLine();//line consumed
         String name=sn.nextLine();
         int price=sn.nextInt();
         int rate =sn.nextInt();
         sn.nextLine();//line comsume
         String available=sn.nextLine();
         arr[i]=new Projector(ID,name,price,rate,available);
     }
     int givenRating=sn.nextInt();
     Projector sol=findMaximumPriceByRating(arr,givenRating);
     if(sol!=null){
         System.out.println("Name "+sol.getProjectorName()+" "+"\n"+ "ID :"+sol.getProjectorId());
     }else{
         System.out.println("NOT FOUND");
     }
    }
}
