class Icecream extends Decorater{
    Icecream(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName()+"with Icecream";
    }
    int getPrice(){
        return offering.getPrice()+75;
    }
    
}