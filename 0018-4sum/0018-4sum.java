class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<=nums.length-4;i++){
            for(int j=i+1;j<=nums.length-3;j++){
            int k=j+1;
            int l=n-1;
            while(k<l){
                long sum=nums[i]+nums[j];
                sum=sum+nums[k]+nums[l];
                if(sum==target){
                       result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

                    while(k<l && nums[k]==nums[k+1]){
                        k++;
                    }
                    while(k<l && nums[l]==nums[l-1]){
                        l--;
                    }
                    k++;
                    l--;
                
                }

                else if(nums[i]+nums[j]+nums[k]+nums[l]<target){
                    k++;
                }
                else {
                    l--;
                }
                 
            }
            while(j+1<n && nums[j]==nums[j+1]){
                        j++;
        }
        }
        while(i+1<n-1 && nums[i]==nums[i+1]){
                        i++;
        }
        
        }

    return result;

       /* List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j-1]==nums[j]){
                    continue;
                }
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=nums[i]+nums[j];
                    sum=sum+nums[k]+nums[l];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k-1]==nums[k]){
                            k++;
                        }
                        while(k<l && nums[l+1]==nums[l]){
                            l--;
                        }
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }

        return result;*/
                }
            }

        