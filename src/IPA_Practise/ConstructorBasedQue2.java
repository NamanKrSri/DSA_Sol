package IPA_Practise;

import java.util.Scanner;

public class ConstructorBasedQue2 {
    public static class HeadSets{
        String headsetName;
        String brand;
        int price;
        boolean available;
        HeadSets(String name,String b,int p,boolean v){
            this.headsetName=name;
            this.brand=b;
            this.price=p;
            this.available=v;
        }
        public String getHeadsetName(){return headsetName;}
        public String getBrand(){return brand;}
        public int getPrice(){return price;}
        public boolean isAvailable(){return available;}
        public void setHeadsetName(String n){this.headsetName=n;}
        public void setBrand(String b){this.brand=b;}
        public void setPrice(int price){this.price=price;}
        public void setAvailable(boolean v){this.available=v;}
    }
    public static int findTotalPriceForGivenBrand(HeadSets[] arr,String brand){
        int totalPrice=0;
        for(HeadSets headSets:arr){
            if(headSets.getBrand().equalsIgnoreCase(brand)){
                totalPrice+=headSets.getPrice();
            }
        }
        return totalPrice;
    }
    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] arr){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(HeadSets head:arr){
            if(min1>head.getPrice()){
                min1=head.getPrice();
            }
        }
        int minIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice()<min2 && arr[i].getPrice()!=min1){
                min2=arr[i].getPrice();
                minIndex=i;
            }
        }
        if(minIndex!=-1){
            HeadSets head=arr[minIndex];
            return head;
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        sn.nextLine();//dump
        HeadSets[] arr=new HeadSets[n];
        for(int i=0;i<n;i++){
            System.out.println("name");
            String name=sn.nextLine();
            System.out.println("brand");
            String brand=sn.nextLine();
            System.out.println("price");
            int price=sn.nextInt();
            sn.nextLine();
            System.out.println("true/falase");
            boolean v=sn.nextBoolean();
            sn.nextLine();
            arr[i]=new HeadSets(name,brand,price,v);
        }
        String brand=sn.nextLine();
        int price=findTotalPriceForGivenBrand(arr,brand);
        if(price!=0){
            System.out.println("Price "+price);
        }
        HeadSets sol=findAvailableHeadsetWithSecondMinPrice(arr);
        if(sol!=null)
        {
            System.out.println("Name "+sol.getHeadsetName());
        }
    }
}
