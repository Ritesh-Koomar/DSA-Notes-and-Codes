/*

there are always two options while making combinations
either use or don't use
This question works on the same principle

we use and check and then we remove and check all is done by the function call

the last 4 code lines hold some importance and that's why they are written that way
try to understand if element is less than or equal to target then only we should subtract right so if satisfied we subtract
and also add the element to the list
we also ensure that once added we remove it as soon as our call finishes
the last line is kept outside as we aren't considering and we mostly don't consider something if it's not probable to give an answer.

TC : O(k * 2^k)
SC : O(k * x)

*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        poss(list,li,target,0,candidates);
        return list;
    }
    public void poss(List<List<Integer>> list,List<Integer> l,int target,int i,int[] arr)
    {
        if(i==arr.length)
        {
            if(target==0)
            {
                list.add(new ArrayList<>(l));
                return;
            }
            return;
        }
        if(arr[i]<=target)
        {
            l.add(arr[i]);
            poss(list,l,target-arr[i],i,arr);
            l.remove(l.size()-1);
        }
        poss(list,l,target,i+1,arr);
    }
}
