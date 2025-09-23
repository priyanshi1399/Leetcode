class Pair<K,V>{
    private final K first;
    private final V second;

    public Pair( K first, V second){
        this.first=first;
        this.second=second;
    }

    public K getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }

}
class FoodRatings {
    String [] food;
    String [] cuis;
    int [] rate;
    HashMap<String,TreeSet<Pair<Integer,String>>> cuisineFoodratings;
    HashMap<String,Integer> foodRating;
    HashMap<String,String> foodCuisine; //to get the corresponding cuisine from food because need to change it
  
    
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.food=foods;
        this.cuis=cuisines;
        this.rate=ratings;
        this.cuisineFoodratings=new HashMap<>();
        this.foodRating=new HashMap<>();
        this.foodCuisine=new HashMap<>();
        for(int i=0;i<foods.length;i++){
            cuisineFoodratings.putIfAbsent(cuisines[i],new TreeSet<>((a,b)->{
                int val1=a.getFirst();
                int val2=b.getFirst();
                return val1==val2?a.getSecond().compareTo(b.getSecond()):Integer.compare(a.getFirst(),b.getFirst());
            }));
            cuisineFoodratings.get(cuisines[i]).add(new Pair<>(-ratings[i],foods[i]));
            foodCuisine.put(foods[i],cuisines[i]);
            foodRating.put(foods[i],ratings[i]);
        }
    }
    
    public void changeRating(String food, int newRating) {
            if(foodRating.containsKey(food)){
                String cuisineFound=foodCuisine.get(food); //get the cuisine to change the value
                int oldRating=foodRating.get(food);
                foodRating.put(food,newRating);
                TreeSet<Pair<Integer,String>> cuisineSet=cuisineFoodratings.get(cuisineFound);
                Pair<Integer,String> ratingFoodToRemove= new Pair<>(-oldRating,food);
                cuisineSet.remove(ratingFoodToRemove);
                cuisineSet.add(new Pair<>(-newRating,food));
            }
    }
    
    public String highestRated(String cuisine) {
      Pair<Integer,String> ratingAndFood=cuisineFoodratings.get(cuisine).getFirst();
      return ratingAndFood.getSecond();
      

      

    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */