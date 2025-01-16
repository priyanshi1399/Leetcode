class Solution {

    public boolean isSetBit(int number, int bit){
        return ((number & (1<<bit))!=0);
    }

    public int minimizeXor(int num1, int num2) {
        int x=0;
        int requiredBitCount=Integer.bitCount(num2);
        for(int bit=31;bit>=0;bit--){
            if(isSetBit(num1,bit)){
                x=x|(1<<bit);
                requiredBitCount--;
                System.out.println(requiredBitCount);
                if(requiredBitCount==0){
                    return x;
                }
            }
        }
        
        for(int bit=0;bit<32;bit++){
            if(!isSetBit(num1,bit)){
                x=x|(1<<bit);
                requiredBitCount--;
                if(requiredBitCount==0){
                    break;
                }
            }
        }
        
        
        return x;
    }
}

    /*public boolean isSetBit(int num,int bit){
        return ((num & (1<<bit))!=0);
    }

    public boolean isUnSetBit(int num,int bit){
        return ((num&(1<<bit))==0);
    }

    public int minimizeXor(int num1, int num2) {
        int x=num1;
        int num1SetBitCount=Integer.bitCount(num1);
        int num2SetBitCount=Integer.bitCount(num2);
        int bit=0;
        if(num1SetBitCount<num2SetBitCount){
            while(num1SetBitCount<num2SetBitCount){
                if(!isSetBit(x,bit)){ //if bit is unset then make it set
                    x=x|(1<<bit); //here we are setting the bit 
                    num1SetBitCount++; //for count addition
                }
                else{
                    bit++;
                }
            }
        }

        else if(num1SetBitCount>num2SetBitCount){
            while(num1SetBitCount>num2SetBitCount){
                if(isSetBit(x,bit)){ //checking the bit is set then make it unset
                    x=x&(~(1<<bit));
                    num1SetBitCount--; //decreasing the count to amke it equal
                }
                else{
                    bit++;
                }
            }
        }    
        //if the bit count are equal then  you acn return  num1 which is x;
        return x; 
        
    }
}*/