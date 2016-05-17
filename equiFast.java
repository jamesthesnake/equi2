int equi(int arr[], int n) {
    if (n==0) return -1; 
    long long sum = 0;
    int i; 
    for(i=0;i<n;i++) sum+=(long long) arr[i]; 

    long long sum_left = 0;    
    for(i=0;i<n;i++) {
        long long sum_right = sum - sum_left - (long long) arr[i];
        if (sum_left == sum_right) return i;
        sum_left += (long long) arr[i];
    } 
    return -1; 
} 
