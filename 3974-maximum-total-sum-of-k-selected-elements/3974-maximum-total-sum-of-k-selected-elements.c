int compare (const void *a,const void *b){
    return (*(int*)a-*(int*)b);
}
long long maxSum(int* nums, int numsSize, int k, int mul) {
    qsort(nums,numsSize,sizeof(int),compare);
    long long ans=0;
    int i=numsSize-1;
    while(k>0){
        if(mul>0){
            ans+=(long long)nums[i]*mul;
        }else{
            ans+=(long long)nums[i];
        }
        mul--;
        i--;
        k--;
    }
    return ans;
}